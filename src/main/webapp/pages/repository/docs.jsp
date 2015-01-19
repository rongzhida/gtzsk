<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ include file="../commons/commons.jsp"%>

<html>
	<head>
		<%@ include file="../commons/header.jsp"%>
		<title>公文</title>
		<link rel="stylesheet" type="text/css" href="${ctx}/resources/css/repository.css">
	</head>
	<body class="easyui-layout" style="visibility:hidden;width: 960px;margin: auto;">
		<div data-options="region:'north',border:false" style="height: 45px;overflow: hidden;">
				<div style="float: left;padding: 12px 10px 10px 250px;margin: auto;"><input id="searchword" name="searchword" value="${searchword}" class="easyui-validatebox" style="width: 300px;" /></div>
				<div style="float: left;"><a class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="getdocs();">查询</a> </div>
		</div>		
		<div data-options="region:'center',border:false">
			<div id="message"></div>
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
				getdocs();
			}
		});
		
		var page="${page}";
		var searchword="${searchword}";
		var pages="${pages}";
		var count="${count}";
		if(pages==0){
			$('#count').html('没有找到相关数据');
		}else{
			$('#count').html("一共搜到 <b style='color:red'>${count}</b> 篇公文。");			
		}		
		$.ajax({
		   type: "get",
		   url: "${ctx}/repository/doclist",
		   data: "page="+page+"&searchword="+searchword,				 
		   success: function(data){			  
			   var html='';
			   for(var i=0;i<data.length;i++){
			    	 html += '<div class="name" onclick="'
			    	 	/*
			    	 	+'openContext('
			    	 	+ data[i].formId + ',' + data[i].procId + ',' + data[i].actId 
			    	 	+ ',' + data[i].workItemId + ',' + data[i].typeId + ',' + data[i].id +');'
			    	 	*/
			    	 	+ 'getContextById(' + data[i].workItemId +');'
			    	 	+ '">'+data[i].name+'</div>'
			    	    +'<div class="pzyj">批准意见：'+data[i].pzyj+'</div>'
			    	    +'<div class="time">'+data[i].showdate+'</div>';
			    }	
			   	$('#message').html(html);
			    getpages(page,searchword,pages,count);
			    document.getElementById("message").style.display="";
		   }
		});	
		$('body').css({visibility: 'visible'});
	});
	
	function getdocs() {
		var searchword=document.getElementById("searchword").value;
		window.location.href="${ctx}/repository/docs?searchword="+searchword+"&page=1&count=0&pages=0";
	}
	
	function openContext(formId,procInstId,actId,workItemId,procTypeId,procInfoId) {
		var url = 'http://172.30.242.37/workitem/openWorkItem.jsp?formId='+formId
			+'&procInstId='+ procInstId +'&actId='+ actId +'&workItemId='+ workItemId +'&flag=1&procTypeId='
			+procTypeId+'&procInfoId='+ procInfoId +'&coming=receiver&name=viewList1&viewList=all&i=0&addinfo=';
		window.open(url);
	}
	
	function getContextById(id){
		$.ajax({
			   type: "get",
			   url: "${ctx}/repository/getContextById",
			   data: "id="+id,				 
			   success: function(data){		
				   var s1=data.substr(0,21);
				   var s2=data.substr(29,data.lenght);
				   var url=s1+'workitem/view'+s2;
				   window.open(url);					     				   				   
			   }
			});
	}
	
	function getpages(page,searchword,pages,count){
		var previous=page*1-1;
		var next=page*1+1; 
		var hrefstr="${ctx}/repository/docs?searchword="+searchword+"&count="+count+"&pages="+pages+"&page=";
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