<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../commons/commons.jsp"%>

<html>
	<head>
		<%@ include file="../commons/header.jsp"%>
		<title></title>
		<style type="text/css">
		
		</style>
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
			var newssrc="${ctx}/repository/news?searchword=";
			var docssrc="${ctx}/repository/docs?page=1&pages=0&count=0&searchword=";
			var imagessrc="${ctx}/repository/images?page=1&pages=0&count=0&searchword=";
			var lawssrc="${ctx}/repository/laws?searchword=";
			var fgksrc="${ctx}/repository/fgk?searchword=";
			if(querytype=='news'){
				$('#tt').tabs('select', 0);	
				newssrc=newssrc+"${searchword}";
				lawssrc=lawssrc+"国土";
			}
			else if(querytype=='docs'){
				$('#tt').tabs('select', 1);
				docssrc=docssrc+"${searchword}";
				lawssrc=lawssrc+"国土";
			}
			else if(querytype=='images'){				
				$('#tt').tabs('select', 2);
				imagessrc=imagessrc+"${searchword}";
				lawssrc=lawssrc+"国土";
			}
			else if(querytype=='laws'){
				$('#tt').tabs('select', 3);
				var searchword="${searchword}";
				if(searchword==''){
					lawssrc=lawssrc+"国土";
				}else{
					lawssrc=lawssrc+"${searchword}";
				}
								
			}
			else if(querytype=='fgk'){
				$('#tt').tabs('select', 3);
				var searchword="${searchword}";
				fgksrc=fgksrc+"${searchword}";
								
			}
			$('#news').attr("src",newssrc);
			$('#docs').attr("src",docssrc);
			$('#images').attr("src",imagessrc);
			$('#laws').attr("src",fgksrc);		
			
			$('body').css({visibility: 'visible'});
		});
	</script>	
</html>