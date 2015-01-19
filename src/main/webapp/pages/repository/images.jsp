<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../commons/commons.jsp"%>

<html>
	<head>
		<%@ include file="../commons/header.jsp"%>
		<title>图片</title>
		<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/repository.css">
	</head>
	<body class="easyui-layout" style="visibility:hidden;width: 960px;margin: auto;">
		<div data-options="region:'north',border:false" style="height: 45px;overflow: hidden;">
				<div style="float: left;padding: 12px 10px 10px 250px;margin: auto;"><input id="searchword" name="searchword" value="${searchword}" class="easyui-validatebox" style="width: 300px;" /></div>
				<div style="float: left;"><a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="getimage();">查询</a> </div>
		</div>		
		<div data-options="region:'center',border:false">
			<div id="imagelist" class="contextImages">
				<div id="img0" class="itemImage"></div>
				<div id="img1" class="itemImage"></div>
				<div id="img2" class="itemImage"></div>
				<div id="img3" class="itemImage"></div>
				<div id="img4" class="itemImage"></div>
				<div id="img5" class="itemImage"></div>
				<div id="img6" class="itemImage"></div>
				<div id="img7" class="itemImage"></div>
				<div id="img8" class="itemImage"></div>
				<div id="img9" class="itemImage"></div>
				<div id="img10" class="itemImage"></div>
				<div id="img11" class="itemImage"></div>
			</div>
		</div>
		<div data-options="region:'south',border:false" style="height: 80px;">
			<div class="contextCount"><span id="count" style="display: block;height: 30px;width: 800px;"></span></div>
			<div id="pages"></div>
		</div>
	</body>
	<script type="text/javascript">
		$(function() {
			
			$.parser.parse();
			
			$("#searchword").keypress(function(event) {
				if (event.which == 13) {
					getimage();
				}
			});
			
			var page="${page}";
			var searchword="${searchword}";
			var pages="${pages}";
			var count="${count}";
			$('#count').html("一共搜到  <b style='color:red'>${count}</b> 张图片。");
			if(pages==0){
				$('#count').html('没有找到相关数据');
			}
			$.ajax({
			   type: "get",
			   url: "${ctx}/repository/imagelist",
			   data: "page="+page+"&searchword="+searchword+"&pages="+pages,				 
			   success: function(data) {					 
			     for(var i=0;i<data.length;i++){
			    	 var imgContext = '<img src='+data[i].filenail+' width="180px" height="120px" class="img"/><br/><span>'+data[i].keyword+'</span>';
			    	 $('#img'+i).append(imgContext);
			     }  
			     $('.img').click(function(){
			    	 window.open(this.src);
			     });
			     getpages(page,searchword,pages,count);
			     
			     document.getElementById("imagelist").style.display="";
			   }
			});
			
			$('body').css({visibility: 'visible'});
		});
	
		function getimage(){
			var searchword=document.getElementById("searchword").value;		
			window.location.href="${ctx}/repository/images?searchword="+searchword+"&page=1&pages=0&count=0";
		}
		
		function getpages(page,searchword,pages,count){			
			var previous=page*1-1;
			var next=page*1+1; 
			var hrefstr="${ctx}/repository/images?searchword="+searchword+"&pages="+pages+"&count="+count+"&page=";
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