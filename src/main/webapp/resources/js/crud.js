function postForm(target, options) {
    var $form = $(target);
    if ($form.form("validate")) {
        var loadingMsg = options.loadingMsg;
        if (loadingMsg != null && loadingMsg != undefined) {
            $("body").mask(loadingMsg);
        }else{
            //find all buttons and disable them
			
            $('div.dialog-button> a').each(function(i){
                $(this).linkbutton('disable');
				
            });
        }

        $.ajax({
            url : options.url,
            type : "post",
            data : options.data,
            success : function(result, textStatus) {
                //enable all buttons
                $('div.dialog-button> a').each(function(i){
                    $(this).linkbutton('enable');
					
                });
				
                $("body").unmask();
                
                if (result.success == undefined){
                    top.location.reload();
                } else if (result.success) {
                    if(options.onBeforePostSuccess){
                        options.onBeforePostSuccess.call(target, result);
                    }
                    /*
                    $.messager.alert(result.title, result.msg, result.icon, function(ok){
                        if (options.onPostSuccess){
                            options.onPostSuccess.call(target, result);
                        }
                    });
                    */
                    
                    var timeout = 2000;
                    $.messager.show({
                		title : result.title,
                		msg : result.msg,
                		timeout : timeout,
                		showType : 'slide',
                		style : {
                            right:'',
                            bottom:''
                        }
                	});
                    
                    setTimeout(function(){
                    	if (options.onPostSuccess){
                            options.onPostSuccess.call(target, result);
                        }
                    }, timeout);
                    
                    
                } else {
                    // $.messager.alert(result.title, result.msg, result.icon);
                	var timeout = 2000;
                	$.messager.show({
                		title : result.title,
                		msg : result.msg,
                		timeout : timeout,
                		showType : 'slide',
                		style : {
                            right:'',
                            bottom:''
                        }
                	});
                }
            },
            error : function(xhr, textStatus, error) {
                //enable all buttons
				
                $('div.dialog-button> a').each(function(i){
                    $(this).linkbutton('enable');
					
                });
				
                $("body").unmask();
                if (xhr.responseText == undefined){
                    top.location.reload();
                }else{
                    $.messager.alert("提示", xhr.responseText);
                }
            }
        });
    }
}

function getAjaxResult(url, fn) {
    $.ajax({
        url : url,
        type : "get",
        success : function(result, textStatus) {
            if (result.success) {
                fn(result);
            }
        },
        error : function(XMLHttpRequest, textStatus, errorThrown) {
            $.messager.alert("提示", XMLHttpRequest.responseText);
        }
    });
}
/***by Xenogear Tang***/
function getAjaxResultX(title, width, height, url, fn) {
    $.ajax({
        url : url,
        type : "get",
        success : function(result, textStatus) {
            if (result.success) {
                fn(result);
            }
        },
        error : function(XMLHttpRequest, textStatus, errorThrown) {
        	openDialogX({
                title : title,                    
                width : width,
                height : height
            }, XMLHttpRequest.responseText);            
        }
    });
}
/***by Xenogear Tang***/
