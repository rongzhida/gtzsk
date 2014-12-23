<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../commons/commons.jsp"%>

<html>
	<head>
		<%@ include file="../commons/header.jsp"%>
		<title>知识库</title>
		<style type="text/css">
		</style>
	</head>
	<body>
		<div>		
			<form id="getlaws" action="http://172.30.242.220:7777/fgk/web/fgkView/searchAction_seach" method="post">
				<input name="searchContent" type="hidden" value="${searchword}" maxlength="100">
			</form>		
		</div>
	</body>
	<script type="text/javascript">
		$(function() {
			document.getElementById('getlaws').submit();
		});
	</script>
</html>