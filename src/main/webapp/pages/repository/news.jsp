<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ include file="../commons/commons.jsp" %>

<html>
<head>
	<%@ include file="../commons/header.jsp" %>
	<title>知识库</title>				
</head>

<body>
	<div>
		<form id="getnews" action="http://www.laho.gov.cn/was5/web/search" method="post">
			<input name="searchword" type="hidden" id="text" value="${searchword}" maxlength="100">
			<input name="channelid" type="hidden" id="channelid" value="9000005" maxlength="100">
		</form>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		document.getElementById('getnews').submit();
	});
</script>
</html>