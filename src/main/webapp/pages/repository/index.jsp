<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ include file="../commons/commons.jsp" %>

<html>
<head>
	<%@ include file="../commons/header.jsp" %>
	<title>知识库</title>
	<style type="text/css">
		.index_logo_div_portal {
			margin-top: 80px;
			text-align: center;
		}
		.index_tab_portal {
			width: 400px;
			text-align: center;
		}
		.form_input {
			width: 420px;
			border: 1px solid #86b2d1;
			height: 20px;
			margin-left: 30px;
		}
		.index_imgbutton1 {
			background-image:url(${ctx}/resources/images/index_btn1.gif);
			background-repeat: no-repeat;
			width: 90px;
			height: 38px;
			border: 0px;
			margin: 20px 10px 20px 10px;
			cursor: pointer;
		}
		#querytype {
			margin: auto;
			font-size: 14px;
			text-align: center;
		}
		#querytype span {
			padding-right: 5px;
		}
	</style>
</head>

<body>
	<div class="index_logo_div_portal">
		<img src="${ctx}/resources/images/index_logo3.png" />
	</div>

	<table align="center" cellpadding="0" cellspacing="0" class="index_tab_portal">
		<tr>
			<td>
				<input type="hidden" name="channelid" value="278237">
				<input type="hidden" name="orderby" value="RELEVANCE" />
				<input type="hidden" name="perpage" value="">
				<input type="text" name="searchword" id="searchword" class="form_input" style="width:350px;height:35px;line-height:35px;font-size:18px;border:1px solid #31AE8E;" />
			</td>
			<td>
				<input id="queryButton" type="button" value="" class="index_imgbutton1" />
			</td>
		</tr>
	</table>

	<div id="querytype">
		<input type="radio" name="query" value='news' checked="checked" />
		<span>新闻</span>
		<input type="radio" name="query" value='docs' />
		<span>公文</span>
		<input type="radio" name="query" value='images' />
		<span>图片</span>
		<input type="radio" name="query" value='fgk' />
		<span>法规</span>
	</div>
</body>
<script type="text/javascript">
	$(function() {
		$("#searchword").keypress(function(event) {
			if (event.which == 13) {
				getContext();
			}
		});
		
		$("#queryButton").click(function(event) {
			getContext();
		});
	});

	function getContext() {
		var searchword = document.getElementById("searchword").value;
		var query = null;
		var querygroup = document.getElementsByName("query");
		for (var i = 0; i < querygroup.length; i++) {
			if (querygroup[i].checked) {
				query = querygroup[i].value;
			}
		}
		window.open("${ctx}/repository/context?searchword="+searchword+"&querytype="+query);
		//window.location.href = "${ctx}/repository/context?searchword=" + searchword + "&querytype=" + query;
	}

</script>

</html>