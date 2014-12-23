<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../commons/commons.jsp"%>

<html>
	<head>
		<%@ include file="../commons/header.jsp"%>
		<title>图片</title>
		<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/repository.css">
	</head>
	<body style="overflow: auto;">
		<table align="center" cellpadding="0" cellspacing="0" class="index_tab_portal">
			<tr>
                <td>                            
                	<input id="searchword" name="searchword" value="${searchword}" class="easyui-validatebox" style="width: 300" />
                </td>
                <td>
                	<a class="easyui-linkbutton index_imgbutton1" data-options="iconCls:'icon-search'" onclick="getimage();">查询</a>                   
                </td>						
            </tr>
		</table>								
		<table id="imagelist">
			<tr>
				<td colspan='4' id="count" align="left"></td>
			</tr>
			<tr>
				<td id="img0"></td>
				<td id="img1"></td>
				<td id="img2"></td>
				<td id="img3"></td>				
			</tr>
			<tr>				
				<td id="img4"></td>
				<td id="img5"></td>
				<td id="img6"></td>
				<td id="img7"></td>				
			</tr>
			<tr>				
				<td id="img8"></td>
				<td id="img9"></td>
				<td id="img10"></td>
				<td id="img11"></td>				
			</tr>
		</table>								
		<div id="pages"></div>
	</body>
	<script type="text/javascript">
		$(function() {
			$("#searchword").keypress(function(event) {
				if (event.which == 13) {
					getimage();
				}
			});
			
			var page="${page}";
			var searchword="${searchword}";
			var pages="${pages}";
			var count="${count}";
			$('#count').append("<span style='font-size:13px;padding-left:36px;'>一共搜到  <span style='color:red'>${count}</span> 张图片</span>");
			if(pages==0){
				$('#count').text('没有找到相关数据');
			}
			$.ajax({
			   type: "get",
			   url: "${ctx}/repository/imagelist",
			   data: "page="+page+"&searchword="+searchword+"&pages="+pages,				 
			   success: function(data){					 
			     for(var i=0;i<data.length;i++){
			    	 $('#img'+i).append('<img src='+data[i].filenail+' width="180px" height="120px" class="img"/><br/><span>'+data[i].keyword+'</span>');
			     }  
			     $('.img').click(function(){
			    	 window.open(this.src);
			     });
			     getpages(page,searchword,pages,count);
			   }
			});
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