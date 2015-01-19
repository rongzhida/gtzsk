<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../commons/commons.jsp"%>

<html>
	<head>
		<%@ include file="../commons/header.jsp"%>
		<title>知识库</title>
		<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/repository.css">
	</head>
	<body class="easyui-layout" style="visibility:hidden;">
		<div data-options="region:'center',border:false">
		<div class="easyui-tabs" data-options="fit:true" id="tt" >
			<div title="新闻" style="overflow:hidden;">
				<iframe id="news" src="" frameborder="0" style="width:100%;height:100%;">
				</iframe>
			</div>
			<div title="公文" style="overflow:hidden;">
				<iframe id="docs" src="" frameborder="0" style="width:100%;height:100%;">
				</iframe>
			</div>
			<div title="图片" style="overflow:hidden;">
				<iframe id="images" src="" frameborder="0" style="width:100%;height:100%;">
				</iframe>
			</div>
			<div title="法规" style="overflow:hidden;">
				<iframe id="laws" src="" frameborder="0" style="width:100%;height:100%;">
				</iframe>
			</div>
		</div>	
		</div>
	</body>	
	<script type="text/javascript">
		$(function(){
			$.parser.parse();
			
			var querytype="${querytype}";
			var newssrc="${ctx}/repository/news?searchword=${searchword}";
			var docssrc="${ctx}/repository/docs?page=1&pages=0&count=0&searchword=${searchword}";
			var imagessrc="${ctx}/repository/images?page=1&pages=0&count=0&searchword=${searchword}";
			var fgksrc="${ctx}/repository/fgk?searchword=${searchword}";
			
			if(querytype=='news'){
				$('#tt').tabs('select', 0);	
			} else if(querytype=='docs'){
				$('#tt').tabs('select', 1);
			} else if(querytype=='images'){				
				$('#tt').tabs('select', 2);
			} else if(querytype=='fgk'){
				$('#tt').tabs('select', 3);
			}
			
			$('#news').attr("src",newssrc);
			$('#docs').attr("src",docssrc);
			$('#images').attr("src",imagessrc);
			$('#laws').attr("src",fgksrc);
			
			$('body').css({visibility: 'visible'});
		});
	</script>	
</html>