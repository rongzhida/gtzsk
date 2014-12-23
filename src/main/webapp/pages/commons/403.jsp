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
        <div style="padding: 5px;width: 400px">
            <div>
                <img src="${ctx}/resources/images/logo.png">
            </div>
            <div>
                <p>
                    <span style="font-weight: bold; color: #FF8D40">访问受限</span>
                </p>
                <p>
                    <span style="color: #FF8D40">很抱歉，操作权限不足，请联系系统管理员。</span>
                </p>
            </div>
        </div>
    </body>
</html>