<%@ page contentType="text/html;charset=UTF-8"%>
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
      <div>
        <script>
    		top.window.location.href = "<%=request.getContextPath()%>";
    				</script>
      </div>
    </body>
</html>