<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ include file="../commons/commons.jsp" %>

<html>

<head>
	<%@ include file="../commons/header.jsp" %>
	<title>法规库</title>
	<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/repository.css">
</head>

<body style="overflow: auto">
	<div id="loading"></div>
	<div id="all" style="display: none">
		<table align="center" cellpadding="0" cellspacing="0" class="index_tab_portal">
			<tr>
				<td>
					<input id="searchword" name="searchword" value="${searchword}" class="easyui-validatebox" style="width: 300" />
				</td>
				<td>
					<a class="easyui-linkbutton index_imgbutton1" data-options="iconCls:'icon-search'" onclick="getdocs();">查询</a>
				</td>
			</tr>
		</table>
		<div id="docs">
			<div id="message"></div>
			<div id="count"></div>
		</div>
		<div id="pages"></div>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$("#searchword").keypress(function(event) {
			if (event.which == 13) {
				getdocs();
			}
		});
		
		var page="${page}";
		var searchword="${searchword}";
		var pages="${pages}";
		var count="${count}";
		if(pages==0){
			$('#message').text('没有找到相关数据');
		}else{
			$('#count').append("<span>一共搜到 <span style='color:red'>${count}</span> 篇法规</span>");			
		}		
		$.ajax({
		   type: "get",
		   url: "${ctx}/repository/fgklist",
		   data: "page="+page+"&searchword="+searchword,				 
		   success: function(data){			  
			   $('#loading').remove();			   
			   for(var i=0;i<data.length;i++){
			    	 var html='';
			    	 html+='<div class="subcontext"><div class="name" onclick="getContextById(\''+data[i].id+'\');">'+data[i].fileTitle+'</div>';
			    	 html+='<div class="pzyj">发文字号：<span class="redfont">'+data[i].promulgationReferenceNumber+ '</span>颁发部门：<span class="redfont">'+data[i].filePromulgationDepartment + '</span></div>';
			    	 html+='<div class="summary">'+data[i].summary+'……</div></div>';
			    	 $('#docs').append(html);	    	 
			    }	
			    getpages(page,searchword,pages,count);
			    document.getElementById("all").style.display="";
		   }
		});
	});
	
	function getdocs(){
		var searchword=document.getElementById("searchword").value;
		window.location.href="${ctx}/repository/fgk?searchword="+searchword+"&page=1&count=0&pages=0";
	}
	
	function getContextById(id) {
		var url = "http://172.30.242.220:7777/fgk/web/fgkView/searchAction_viewPreview?fileId=" + id;
		window.open(url);	
	}
	
	function getpages(page,searchword,pages,count){
		var previous=page*1-1;
		var next=page*1+1; 
		var hrefstr="${ctx}/repository/fgk?searchword="+searchword+"&count="+count+"&pages="+pages+"&page=";
		var endhref=hrefstr+pages;
		var starthref=hrefstr+1;
		if(pages<=10){
			if(page>1){
				myhref=hrefstr+previous;
				$("#pages").append("<a href="+starthref+" class='blue'>首页</a>");
				$("#pages").append("<a href="+myhref+" class='blue'>上一页</a>");
			}
			for(var i=1;i<=pages;i++){					
				if(page==i){
					$("#pages").append("<a href='#' class='red'>"+i+"</a>");
				}else{
					myhref=hrefstr+i;
					$("#pages").append("<a class='blue' href="+myhref+" value="+i+" name='page'>"+i+"</a>");
				}
			}
			if(page<pages){
				myhref=hrefstr+next;
				$("#pages").append("<a class='blue' href="+myhref+">下一页</a>");
				$("#pages").append("<a class='blue' href="+endhref+">尾页</a>");
			}				
		}
		else{				
			if(page<=5){
				var previous=page*1-1;
				var next=page*1+1;
				var myhref=null;
				if(page>1){					
					var myhref=hrefstr+previous;
					$("#pages").append("<a href="+starthref+" class='blue'>首页</a>");
					$("#pages").append("<a href="+myhref+" class='blue'>上一页</a>");
				}
				for(var i=1;i<=10;i++){
					if(page==i){
						$("#pages").append("<a href='#' class='red'>"+i+"</a>");
					}else{
						myhref=hrefstr+i;
						$("#pages").append("<a class='blue' href="+myhref+" value="+i+" name='page'>"+i+"</a>");
					}
				}
				myhref=hrefstr+next;
				$("#pages").append("<a class='blue' href="+myhref+">下一页</a>");
				$("#pages").append("<a class='blue' href="+endhref+">尾页</a>");
			}
			else{
				var previous=page*1-1;
				var next=page*1+1;
				var myhref=null;
				if(pages-page<5){
					var myhref=hrefstr+previous;
					$("#pages").append("<a href="+starthref+" class='blue'>首页</a>");
					$("#pages").append("<a href="+myhref+" class='blue'>上一页</a>");
					for(var i=pages-9;i<=pages;i++){
						if(page==i){
							$("#pages").append("<a href='#' class='red'>"+i+"</a>");
						}else{
							myhref=hrefstr+i;
							$("#pages").append("<a class='blue' href="+myhref+" value="+i+" name='page'>"+i+"</a>");
						}
					}
					if(page<pages){
						myhref=hrefstr+next;
						$("#pages").append("<a class='blue' href="+myhref+">下一页</a>");
						$("#pages").append("<a class='blue' href="+endhref+">尾页</a>");
					}				
				}else{
					var start=page*1-5;
					var end=page*1+5;
					var myhref=hrefstr+previous;
					$("#pages").append("<a href="+starthref+" class='blue'>首页</a>");
					$("#pages").append("<a href="+myhref+" class='blue'>上一页</a>");
					for(var i=start;i<end;i++){
						if(page==i){
							$("#pages").append("<a href='#' class='red'>"+i+"</a>");
						}else{
							myhref=hrefstr+i;
							$("#pages").append("<a class='blue' href="+myhref+" value="+i+" name='page'>"+i+"</a>");
						}
					}						
					myhref=hrefstr+next;
					$("#pages").append("<a class='blue' href="+myhref+">下一页</a>");
					$("#pages").append("<a class='blue' href="+endhref+">尾页</a>");
				}
			}
		}
	}
</script>

</html>