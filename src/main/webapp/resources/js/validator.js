/*数据验证*/
$
		.extend(
				$.fn.validatebox.defaults.rules,
				{
					minLength : {
						validator : function(value, param) {
							return value.length >= param[0];
						},
						message : "字数不够."
					},
					equalPassword : {
						validator : function(value, param) {
							return $(param[0]).val() == value;
						},
						message : "密码不匹配"
					},
					lengthAllowSpace : {
						validator : function(value, param) {
							var minLen = param[0];
							var maxLen = param[1];

							if (value.length < minLen) {
								$(this).attr("message", "字数不够，输入不能少于 " + minLen + " 位。");
								return false;
							}

							if (value.length > maxLen) {
								$(this).attr("message", "输入过长，输入不能超过" + maxLen + " 位。");
								return false;
							}
							
							return true;
						},
						message : ""
					},
					length : {
						validator : function(value, param) {
							var minLen = param[0];
							var maxLen = param[1];
							
							var reg = /^\s*(\S+)\s*$/;
						    if(reg.test(value)){
						      //如果用户输入的内容,开头或结尾带有空格,则将空格去掉,重新赋给文本框的value属性
						      value = RegExp.$1; 
						    }else{
						      //如果用户只输入了空格,则将空格清空
						      value = "";
						      $(this).attr("message", "请注意空格");
							  return false;
						    } 

							if (value.length < minLen) {
								$(this).attr("message", "字数不够，输入不能少于 " + minLen + " 位。");
								return false;
							}

							if (value.length > maxLen) {
								$(this).attr("message", "输入过长，输入不能超过" + maxLen + " 位。");
								return false;
							}
							
							return true;
						},
						message : ""
					},
					inLength : {
						validator : function(value, param) {
							var minLen = param[0];
							var maxLen = param[1];
							var msg = param[2];

							$(this).attr("message", msg);

							if (value.length < minLen) {
								return false;
							}

							if (value.length > maxLen) {
								return false;
							}

							return true;
						},
						message : ""

					},
					inLengthX : {
						validator : function(value, param) {
							var minLen = param[0];
							var maxLen = param[1];
							var msg = param[2];

							$(this).attr("message", msg);

							if (value.length != minLen && value.length != maxLen) {
								return false;
							}

							if (param.length == 4) {
								var url = param[3];
								$(this).attr("message", "已被使用");
								var text = $.ajax({
									url : url,
									dataType : "json",
									type : "post",
									async : false,
									cache : false,
									data : {
										value : value
									}
								}).responseText;
								if (isJson(text)) {
									var result = eval('(' + text + ')');
									return result.success;
								} else {
									return false;
								}
							}

							return true;
						},
						message : ""

					},
					name : {
						validator : function(value, param) {
							var minLen = param[0];
							var maxLen = param[1];

							var reg = new RegExp("^[0-9a-zA-Z_\u4e00-\u9fa5]*$");
							if (!(reg.test(value))) {
								$(this).attr("message", "非法字符");
								return false;
							}

							if (value.length < minLen) {
								$(this).attr("message", "字数不够，输入不能少于 " + minLen + " 位。");
								return false;
							}

							if (value.length > maxLen) {
								$(this).attr("message", "输入过长，输入不能超过" + maxLen + " 位。");
								return false;
							}

							return true;
						},
						message : ""
					},
					unique : {
						validator : function(value, param) {
							var minLen = param[0];
							var maxLen = param[1];
							var url = param[2];

							var reg = new RegExp("^[0-9a-zA-Z_\u4e00-\u9fa5]*$");
							if (!(reg.test(value))) {
								$(this).attr("message", "非法字符");
								return false;
							}

							if (value.length < minLen) {
								$(this).attr("message", "字数不够，输入不能少于 " + minLen + " 位。");
								return false;
							}

							if (value.length > maxLen) {
								$(this).attr("message", "输入过长，输入不能超过" + maxLen + " 位。");
								return false;
							}

							$(this).attr("message", "已被使用");
							var text = $.ajax({
								url : url,
								dataType : "json",
								type : "post",
								async : false,
								cache : false,
								data : {
									value : value
								}
							}).responseText;
							if (isJson(text)) {
								var result = eval('(' + text + ')');
								return result.success;
							} else {
								return false;
							}
						},
						message : ""
					},
					afterdate : {
						validator : function(value, param) {
							var date = new Date(Date.parse(value.replace("-", "/")));
							var compareDate = new Date(Date.parse(param[0].replace("-", "/")));
							var str = param[1];
							if (date < compareDate) {
								$(this).attr("message", "此日期应当大于" + str);
								return false;
							}
							return true;
						},
						message : ""
					},
					beforedate : {
						validator : function(value, param) {
							var date = new Date(Date.parse(value.replace("-", "/")));
							var compareDate = new Date(Date.parse(param[0].replace("-", "/")));
							var str = param[1];
							if (date > compareDate) {
								$(this).attr("message", "当前日期应当小于" + str);
								return false;
							}
							return true;
						},
						message : ""
					},
					telphone : {
						validator : function(value, params) {
							var minLen = params[0];
							var maxLen = params[1];

							if (value.length < minLen) {
								$(this).attr("message", "请输入有效的电话号码。");
								return false;
							}

							if (value.length > maxLen) {
								$(this).attr("message", "请输入有效的电话号码。");
								return false;
							}
							
							var reg =  /^((\d{11})|^((\d{7,8})|(\d{4}|\d{3})-(\d{7,8})|(\d{4}|\d{3})-(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1})|(\d{7,8})-(\d{4}|\d{3}|\d{2}|\d{1}))$)/;
							if (!reg.test(value)) {
								$(this).attr("message","请输入有效的电话号码。");
								return false;
							}

							return true;

						},
						message : ""
					},
					emaillength : {
						validator : function(value, params) {

							var minLen = params[0];
							var maxLen = params[1];

							if (value.length < minLen) {
								$(this).attr("message", "字数不够，输入不能少于 " + minLen + " 位。");
								return false;
							}

							if (value.length > maxLen) {
								$(this).attr("message", "输入过长，输入不能超过" + maxLen + " 位。");
								return false;
							}

							if (!/^((([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+(\.([a-z]|\d|[!#\$%&'\*\+\-\/=\?\^_`{\|}~]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])+)*)|((\x22)((((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(([\x01-\x08\x0b\x0c\x0e-\x1f\x7f]|\x21|[\x23-\x5b]|[\x5d-\x7e]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(\\([\x01-\x09\x0b\x0c\x0d-\x7f]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF]))))*(((\x20|\x09)*(\x0d\x0a))?(\x20|\x09)+)?(\x22)))@((([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|\d|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.)+(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])|(([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])([a-z]|\d|-|\.|_|~|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])*([a-z]|[\u00A0-\uD7FF\uF900-\uFDCF\uFDF0-\uFFEF])))\.?$/i
									.test(value)) {
								$(this).attr("message", "请输入正确邮箱地址。");
								return false;
							}

							return true;

						},
						message : ""
					},
					username : {
						validator : function(value, params) {
							var msg = "用户名只能是字母和数字，长度范围为4-20。";
							
							var minLen = params[0];
							var maxLen = params[1];
							var url = params[2];

							if (value.length < minLen) {
								$(this).attr("message", msg);
								return false;
							}

							if (value.length > maxLen) {
								$(this).attr("message", msg);
								return false;
							}
							var reg = /^[A-Za-z0-9]+$/;

							if (!reg.test(value)) {
								$(this).attr("message", msg);
								return false;
							}

							$(this).attr("message", "已被使用");
							var text = $.ajax({
								url : url,
								dataType : "json",
								type : "post",
								async : false,
								cache : false,
								data : {
									value : value
								}
							}).responseText;
							if (isJson(text)) {
								var result = eval('(' + text + ')');
								return result.success;
							} else {
								return false;
							}
						},
						message : ""
					},
					password : {
						validator : function(value, params) {
							var msg = "请输入有效密码，必须是8-20位并且是数字与字母的组合,可包含特殊字符。";
							
							var minLen = params[0];
							var maxLen = params[1];

							if (value.length < minLen) {
								$(this).attr("message", msg);
								return false;
							}

							if (value.length > maxLen) {
								$(this).attr("message", msg);
								return false;
							}
							/*
							必须要有大小写字母，数字，特殊字符
							var reg = /^(?=[^\d]*[\d])(?=[^A-Z]*[A-Z])(?=[^a-z]*[a-z])(?=[a-zA-Z\d]*[^a-zA-Z\d])[\d\D]{8,20}/; 
							 */
							// 必须要有字母
							var reg = /^(?=[^\d]*[\d])(?=[^a-zA-Z]*[a-zA-Z])[\d\D]{0,20}/;

							if (!reg.test(value)) {
								$(this).attr("message", msg);
								return false;
							}

							return true;
						},
						message : ""
					},
					idcard : {
						validator : function(value, param) {
							//身份证正则表达式(15位) 
							var isIDCard1=/^[1-9]\d{7}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}$/; 
							//身份证正则表达式(18位) 
							var isIDCard2=/^[1-9]\d{5}[1-9]\d{3}((0\d)|(1[0-2]))(([0|1|2]\d)|3[0-1])\d{3}(\d|X)$/; 
							
							if(!isIDCard1.test(value) && !isIDCard2.test(value)){
								$(this).attr("message", "请输入正确的身份证号码。");
								return false;
							}
							
							var url = param[0];
							$(this).attr("message", "已被使用");
							var text = $.ajax({
								url : url,
								dataType : "json",
								type : "post",
								async : false,
								cache : false,
								data : {
									value : value
								}
							}).responseText;
							if (isJson(text)) {
								var result = eval('(' + text + ')');
								return result.success;
							} else {
								return false;
							}
						},
						message : ""
					}
				});