<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<html>
<head>
<base href="<%=basePath%>">
<title>Anonymous User</title>
</head>
<script>
	function goToLoginPage() {
		top.window.location.href = "<%=request.getContextPath()%>";
	}
	goToLoginPage();
</script>
</html>