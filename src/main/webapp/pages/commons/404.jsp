<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ include file="commons.jsp"%>

<html>
    <head>
        <%@ include file="header.jsp"%>
        <style type="text/css">
            body {
              font-size:14px;
            }
        </style>
        
        <script type="text/javascript">
         $(function() {
        	 if (top.hideMask)  {
        		 top.hideMask();
        	}
         });
        </script>
    </head>

    <body>
        <div style="margin: auto 0px;padding: 5px;width: 400px">
            <div>
                <img src="${ctx}/resources/images/logo.png">
            </div>
            <div>
                <p>
                    <span style="font-weight: bold; color: #FF8D40">404异常错误</span>
                </p>
                <p>
                    <span style="color: #FF8D40">很抱歉，找不到您想要访问的页面 <%=request.getAttribute("javax.servlet.error.request_uri")%></span>
                </p>
            </div>
        </div>
    </body>
</html>