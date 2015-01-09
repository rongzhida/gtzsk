package com.bms.rbac.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.xml.bind.JAXBElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.gov.laho.fgk.webservice.SearchServicePortType;
import cn.gov.laho.fgk.webservice.pojo.xsd.FileInfomation;
import cn.gov.laho.gzfgoa.flow.webservice.ArrayOfProcInfoBean;
import cn.gov.laho.gzfgoa.flow.webservice.ProcInfoBean;
import cn.gov.laho.gzfgoa.flow.webservice.ProcInfoServicePortType;

import com.bms.rbac.management.domain.FGKBean;
import com.bms.rbac.management.domain.Repository;
import com.bms.rbac.management.persistence.option.RepositorySearchOption;

/**
 * 知识库控制器
 * 
 * @作者 容智达
 * @创建时间 2014-10-23
 */
@Controller("repositoryController")
@RequestMapping("/repository")
public class RepositoryController {

	@Autowired
	private SearchServicePortType fgkSearchService;

	@Autowired
	private ProcInfoServicePortType fgoaProcInfoService;

	/**
	 * GET 查询
	 * 
	 * @return 视图路径
	 */
	@RequestMapping(value = { "/index", "" })
	public String index() {
		return "/repository/index";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/context")
	public ModelAndView getContext(String searchword, String querytype) {
		ModelMap map = new ModelMap();
		ModelAndView view = new ModelAndView("repository/context", map);
		view.addObject("searchword", searchword);
		view.addObject("querytype", querytype);
		return view;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/news")
	public ModelAndView news(String searchword) {
		ModelMap map = new ModelMap();
		ModelAndView view = new ModelAndView("repository/news", map);
		view.addObject("searchword", searchword);
		return view;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/laws")
	public ModelAndView laws(String searchword) {
		ModelMap map = new ModelMap();
		ModelAndView view = new ModelAndView("repository/laws", map);
		view.addObject("searchword", searchword);
		return view;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/fgk")
	public ModelAndView fgk(RepositorySearchOption searchOption, HttpServletRequest request) {
		ModelMap map = new ModelMap();
		ModelAndView view = new ModelAndView("repository/fgk", map);
		int pages = searchOption.getPages();
		Long count = 0L;
		try {
			count = fgkSearchService.searchFileInfoTotal(searchOption.getSearchword());
			if (count % 10 == 0) {
				pages = (int) (count / 10);
			} else {
				pages = (int) (count / 10 + 1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		view.addObject("searchword", searchOption.getSearchword());
		view.addObject("page", searchOption.getPage());
		view.addObject("pages", pages);
		view.addObject("count", count);
		return view;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/fgklist")
	@ResponseBody
	public List<FGKBean> fgklist(RepositorySearchOption searchOption, HttpServletRequest request) {
		List<FGKBean> beans = new ArrayList<FGKBean>();
		try {
			int page = searchOption.getPage();
			List<FileInfomation> list = fgkSearchService.searchFileInfo(searchOption.getSearchword(), page, 10, 0, 1);
			
			for (FileInfomation info : list) {
				FGKBean bean = new FGKBean();
				bean.setId(info.getId().getValue());
				bean.setFileTitle(info.getFileTitle().getValue());
				bean.setPromulgationReferenceNumber(info.getPromulgationReferenceNumber().getValue());
				bean.setFilePromulgationDepartment(info.getFilePromulgationDepartment().getValue());
				bean.setSummary(info.getSummary().getValue());
				beans.add(bean);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return beans;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/docs")
	public ModelAndView docs(RepositorySearchOption searchOption, HttpServletRequest request)
			throws ClassNotFoundException, SQLException {
		ModelMap map = new ModelMap();
		ModelAndView view = new ModelAndView("repository/docs", map);
		int pages = searchOption.getPages();
		int count = searchOption.getCount();
		if (pages == 0) {
			String username = getSessionUsername(request);
			if (username == null || username.length() == 0) {
				pages = 0;
			} else {
				searchOption.setUsername(username);
				count = getDocTotal(searchOption, username);
				if (count % 10 == 0) {
					pages = count / 10;
				} else {
					pages = count / 10 + 1;
				}
			}
		}
		view.addObject("searchword", searchOption.getSearchword());
		view.addObject("page", searchOption.getPage());
		view.addObject("pages", pages);
		view.addObject("count", count);
		return view;
	}
	
	private int getDocTotal(RepositorySearchOption searchOption,String username) {
		int total = 0;
		//total = repositoryService.count(searchOption);
		total = fgoaProcInfoService.queryFlowNum(searchOption.getSearchword(), -1, -1, "", "", "", "", "", "", "", "", "", "", username);
		return total;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/getContextById")
	@ResponseBody
	public String getContextById(int id) throws ClassNotFoundException, SQLException {
		return getDocUrl(id);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/doclist")
	@ResponseBody
	public List<Repository> doclist(RepositorySearchOption searchOption, HttpServletRequest request) {
		return pageService(searchOption, request);
	}
	
	private List<Repository> pageService(RepositorySearchOption searchOption, HttpServletRequest request) {
		List<Repository> result = new ArrayList<Repository>();
		String username = getSessionUsername(request);
		if (username == null || username.length() == 0) {
			return result;
		}
		ArrayOfProcInfoBean arrayOfProcInfoBean = this.fgoaProcInfoService.queryFlow(searchOption.getSearchword(), -1, -1, "", "", "", "", "", "", "", "", "", "", username, 10, searchOption.getPage());
		List<ProcInfoBean> procInfoBean = arrayOfProcInfoBean.getProcInfoBean();
		for (ProcInfoBean bean : procInfoBean) {
			Repository repository = new Repository();
			repository.setName(bean.getProcName().getValue());
			String pzyj = "";
			JAXBElement<String> flowLbyj = bean.getFlowLbyj();
			if(flowLbyj != null && flowLbyj.getValue() != null) {
				pzyj = flowLbyj.getValue();
			}
			repository.setPzyj(pzyj);
			repository.setShowdate(bean.getReceiveDataStr().getValue());
			//----
			repository.setId(bean.getId());
			repository.setActId(bean.getActId().toString());
			repository.setDsmId(bean.getDsmId().toString());
			repository.setFormId(bean.getFormId().toString());
			repository.setProcId(bean.getProcId().toString());
			repository.setTypeId(bean.getTypeId().toString());
			repository.setWorkItemId(bean.getWorkItemId().toString());
			result.add(repository);
		}
		return result;
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/imagelist")
	@ResponseBody
	public List<Object> imagelist(int page, String searchword, int pages) {
		try {
			return getImages(page, searchword, pages);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ArrayList<Object>();
		}
	}

	@RequestMapping(method = RequestMethod.GET, value = "/images")
	public ModelAndView images(String searchword, int page, int pages, int count) throws ClassNotFoundException,
			SQLException {
		ModelMap map = new ModelMap();
		ModelAndView view = new ModelAndView("repository/images", map);
		if (pages == 0) {
			count = getImageCount(searchword);
			if (count % 12 == 0) {
				pages = count / 12;
			} else {
				pages = count / 12 + 1;
			}
		}
		view.addObject("searchword", searchword);
		view.addObject("page", page);
		view.addObject("pages", pages);
		view.addObject("count", count);
		return view;
	}
	
	private Connection getDocConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.30.242.135:1521:fgora2", "oa_xxb", "gzlaho");
		return conn;
	}
	
	private String getDocUrl(int id){
		String url = "";
		try {
			Connection conn = getDocConnection();
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select FORM_URL from WF_WORK_ITEMURL where ID="+id);
			if(rs.next()){
				url = rs.getString(1);
			}
		} catch (Exception e) {
		} 
		return url;
	}

	private Connection getImagesConnection() throws ClassNotFoundException, SQLException {
		String driverName = "net.sourceforge.jtds.jdbc.Driver"; // 加载JDBC驱动
		String dbURL = "jdbc:jtds:sqlserver://172.30.253.135:1433/photo80"; // 连接服务器和数据库sample
		String userName = "photo80"; // 默认用户名
		String userPwd = "photo@123"; // 密码
		Class.forName(driverName);
		Connection conn = DriverManager.getConnection(dbURL, userName, userPwd);
		return conn;
	}

	private int getImageCount(String searchword) {
		int count = 0;
		Connection conn = null;
		Statement statement = null;
		try {
			conn = getImagesConnection();
			statement = conn.createStatement();
			String sql = "SELECT count(*) FROM docqryweb where KeyWords like '%" + searchword + "%' or ClassName like '%"
					+ searchword + "%' or GroupName like '%" + searchword + "%'";
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				count = rs.getInt(1);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(statement != null) {
					statement.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
			}
		}
		
		return count;
	}

	private List<Object> getImages(int page, String searchword, int pages) {
		List<Object> result = new ArrayList<Object>();
		try {
			Connection conn = null;
			Statement statement = null;
			try {
				conn = getImagesConnection();
				Statement st = conn.createStatement();
				int num = page * 12;
				int one = 12;
				if (pages == page) {
					int sum = getImageCount(searchword);
					if (sum % 12 != 0) {
						one = sum % 12;
					}
				}
				String sql = "SELECT w1.GroupName,w1.PhotoFileNail FROM docqryweb w1,(SELECT TOP "
						+ one
						+ " PhotoFileNail FROM(SELECT TOP "
						+ num
						+ " PhotoFileNail FROM docqryweb where KeyWords like '%"
						+ searchword
						+ "%' or GroupName like '%"
						+ searchword
						+ "%' or ClassName like '%"
						+ searchword
						+ "%' ORDER BY PicDate DESC) w ORDER BY w.PhotoFileNail ASC) w2 WHERE w1.PhotoFileNail = w2.PhotoFileNail ORDER BY w1.PicDate DESC";
				ResultSet rs = st.executeQuery(sql);
				while (rs.next()) {
					Map<String, String> m = new HashMap<String, String>();
					m.put("keyword", rs.getString(1));
					m.put("filenail", rs.getString(2));
					result.add(m);
				}

			} catch (Exception ex) {
				ex.printStackTrace();
			} finally {
				if (statement != null) {
					statement.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	private String getSessionUsername(HttpServletRequest request) {
		return request.getHeader("oam_userid");
	}

}
