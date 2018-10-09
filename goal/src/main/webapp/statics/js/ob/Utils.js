
/*AJAX加载等待效果*/
 function ajaxLoading(){ 
	    $("<div class=\"datagrid-mask\"></div>").css({display:"block",width:"100%",height:$(window).height()}).appendTo("body"); 
	    $("<div class=\"datagrid-mask-msg\"></div>").html("正在处理，请稍候。。。").appendTo("body").css({display:"block",left:($(document.body).outerWidth(true) - 190) / 2,top:($(window).height() - 45) / 2}); 
} 
 /*AJAX关闭加载等待效果*/
function ajaxLoadEnd(){ 
	     $(".datagrid-mask").remove(); 
	     $(".datagrid-mask-msg").remove();             
}

/*页面加载加载等待效果*/
function pageLoading(){ 
	    $("<div class=\"datagrid-mask\"></div>").css({display:"block",width:"100%",height:$(window).height()}).appendTo("body"); 
	    $("<div class=\"datagrid-mask-msg\"></div>").html("正在处理，请稍候。。。").appendTo("body").css({display:"block",left:($(document.body).outerWidth(true) - 190) / 2,top:($(window).height() - 45) / 2}); 
} 
/*关闭加载等待效果*/
function pageLoadEnd(){ 
	     $(".datagrid-mask").remove(); 
	     $(".datagrid-mask-msg").remove();             
}
 
/*加载页面*/
function loadUrl(url){
	window.location.href=url;
}

/*打开页面*/
function openNewWin(url,title,width,height){
	parent.window.$.iframe.win({
	        title:title,
	        url:url,
	        width: width,
	        height: height,
	        modal: true
	    });
}
/*关闭页面*/
function closeIFrame(){
	parent.window.$.iframe.close();
}

/**
 * post数据到后台
 * url 提交路径
 * data 提交数据
 * msg 成功后提示信息
 * backurl成功操作后是否返回指定的页面，如果为空则不返回
 * callback回调函数
 */
function submitData(url,data,msg,backurl){
	submitData(url,data,msg,backurl,"");
}

/**
 * post数据到后台
 * url 提交路径
 * data 提交数据
 * msg 成功后提示信息
 * backurl成功操作后是否返回指定的页面，如果为空则不返回
 * callback回调函数
 */
function submitData(url, data, msg, backurl, callback, newTabTile, isFresh) {
	$.ajax( {
		async : true,
		cache : false,
		type : 'POST',
		dataType : "json",
		traditional : true,		//当提交的参数是数组(e.g. {name:[value,value,value]} ),如果是false的话,则提交时会是"name[]=value&name[]=value"
								//如果设置成true,则提交时会是"name=value&name=value"		checkbox的提交问题
		url : url,
		data : data,
		beforeSend:ajaxLoading,
		error : function() {// 请求失败处理函数
			ajaxLoadEnd();
			parent.window.$.messager.alert('提示','请求失败!');
		},
		success : function(data) { // 请求成功后处理函数。
			ajaxLoadEnd();
			if (data.jht_error_code==0 && msg!="") {
				parent.window.$.messager.alert('提交成功',msg,"info",function(){
					if(backurl!=""&&backurl!="close"){
						if(newTabTile!=undefined) {
							loadAndUpdateTab(newTabTile, backurl, isFresh)
						} else {
							window.location.href=backurl;
						}
					}
					if(backurl=="close&reload"){
						window.top.reload.call();
						closeIFrame();
					}
				});
			} else{//后台异常处理
				if(msg!="")
					parent.window.$.messager.alert('提交失败',data.jht_error_msg);
			}
			//执行回调函数
			if(callback!=null && callback!="" && callback!=undefined)
				callback(data);
		}
	});
}


/**
 * 通过AJAX获取数据，并用回调函数做相应的处理
 * 
 * @param url
 * @param data
 * @param success_callback
 * 					请求成功回调函数
 * @param error_callback
 * 					请求失败回调函数
 */
function sendAjaxRequest(url, data, success_callback, error_callback) {
	$.ajax( {
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		traditional : true,		//当提交的参数是数组(e.g. {name:[value,value,value]} ),如果是false的话,则提交时会是"name[]=value&name[]=value"
								//如果设置成true,则提交时会是"name=value&name=value"		checkbox的提交问题
		url : url,
		data : data,
		beforeSend:ajaxLoading,
		error : function() {		// 请求失败处理函数
			ajaxLoadEnd();
			if(error_callback)
				error_callback(data);
		},
		success : function(data) { // 请求成功后处理函数。
			ajaxLoadEnd();
			//执行回调函数
			if(success_callback)
				success_callback(data);
		}
	});
	

}



//自动按比例显示图片，按比例压缩图片显示
function AutoResizeImage(maxWidth,maxHeight,objImg){
	var img = new Image();
	img.src = objImg.src;
	var hRatio;
	var wRatio;
	var Ratio = 1;
	var w = img.width;
	var h = img.height;
	wRatio = maxWidth / w;
	hRatio = maxHeight / h;
	if (maxWidth ==0 && maxHeight==0){
	Ratio = 1;
	}else if (maxWidth==0){//
	if (hRatio<1) Ratio = hRatio;
	}else if (maxHeight==0){
	if (wRatio<1) Ratio = wRatio;
	}else if (wRatio<1 || hRatio<1){
	Ratio = (wRatio<=hRatio?wRatio:hRatio);
	}
	if (Ratio<1){
	w = w * Ratio;
	h = h * Ratio;
	}
	objImg.height = h;
	objImg.width = w;
	}
 
/*封装要提交的数据*/
function getFormData(form) {
	var data = {};
	$("#"+form).find('input,select,textarea').each(function() {
		var $element = $(this);
		var type = $element[0].tagName;//$element.attr('type');
		type = type.toLocaleLowerCase();
		var id = $element.attr('id');
		if (typeof(id) != "undefined")
		{
		var classGet=$("#"+id).attr("getType");
		var value =$element.val()==null?"":$element.val().replace(/(^\s*)|(\s*$)/g, "").replace(/</g, '&lt;').replace(/>/g, '&gt;');
		if (type == 'checkbox' || type == 'radio') {
			if($element.is(':checked')){
				data[id] = value;
			}
		} else if (type == 'select') {
			data[id] =$element.combobox('getValue');
		} else {
			if(classGet=='datetimebox'){
			   data[id] =$element.datetimebox('getValue');
			} else if(classGet=='datebox'){
			        data[id] =$element.datebox('getValue');
		    } else if(classGet=='numberbox'){
		        data[id] =$element.numberbox('getValue');
		    } else if(classGet=='numberspinner'){
		        data[id] =$element.numberspinner('getValue');
		    } else if(classGet=='checkbox' || classGet=='radio'){
		    	if($element.is(':checked')){
					data[id] = value;
				}
		    } else if(classGet=='textarea'){
		    	data[id] = $element.val();	
		    } else if(classGet=='combobox'){
		    	data[id] =$element.combobox('getValue');
		    } else {
		    	data[id] = value;	
		    }
		};
		}
	});
	return data;
}

/*封装要提交的数据   注意：只需要在对应的表单中，加入 getType='combobox'  getType='textarea' 
 类似即可实现，顺带要有name属性(form表单都应该有)
 */
function getFormData2(form) {
	var data = {};
	$("#" + form).find('input,select,textarea').not(':disabled').each(function() {
		var $element = $(this);
		var classGet = $element.attr("getType");
		var name = $element.attr("name");
		if (name != undefined)
		{
			var value = $element.val()==null?"":$element.val().replace(/(^\s*)|(\s*$)/g, "").replace(/</g, '&lt;').replace(/>/g, '&gt;');
			if(classGet=='datetimebox'){
			   data[name] =$element.datetimebox('getValue');
			} else if(classGet=='datebox'){
			   data[name] =$element.datebox('getValue');
		    } else if(classGet=='numberbox'){
		        data[name] =$element.numberbox('getValue');
		    } else if(classGet=='numberspinner'){
		        data[name] =$element.numberspinner('getValue');
		    } else if(classGet=='radio'){
		    	if($element.is(':checked')){
					data[name] = value;
				}
		    } else if(classGet=='textarea'){
		    	console.debug("$element.val():" + $element.val());
		    	data[name] = $element.val();	
		    }  else if(classGet=='file'){
		    	
		    }
			//多选，即同一组
		    else if(classGet=='checkbox') {
		    	if($element.is(':checked')) {
		    		var array = data[name];
		    		if(array==null || array==undefined)
		    			array = new Array();
		    		array.push(value); 
					data[name] = array;
				}
		    } else if(classGet=='combobox'){
		    	data[name] =$element.combobox('getValue');
		    } else if(classGet=='comboboxText'){
		    	data[name] =$element.combobox('getText');
		    } else if(classGet=='select'){
		    	data[name]=$element.val();
		    }else {
		    	data[name] = value;	
		    }
		}
	});
	return data;
}
function getFormData3(form) {
	var data = {};
	$("#" + form).find('input,select,textarea').each(function() {
		var $element = $(this);
		var classGet = $element.attr("getType");
		var name = $element.attr("name");
		if (name != undefined)
		{
			var value = $element.val()==null?"":$element.val().replace(/(^\s*)|(\s*$)/g, "").replace(/</g, '&lt;').replace(/>/g, '&gt;');
			if(classGet=='datetimebox'){
			   data[name] =$element.datetimebox('getValue');
			} else if(classGet=='datebox'){
			   data[name] =$element.datebox('getValue');
		    } else if(classGet=='numberbox'){
		        data[name] =$element.numberbox('getValue');
		    } else if(classGet=='numberspinner'){
		        data[name] =$element.numberspinner('getValue');
		    } else if(classGet=='radio'){
		    	if($element.is(':checked')){
					data[name] = value;
				}
		    } else if(classGet=='textarea'){
		    	console.debug("$element.val():" + $element.val());
		    	data[name] = $element.val();	
		    }  else if(classGet=='file'){
		    	
		    }
			//多选，即同一组
		    else if(classGet=='checkbox') {
		    	if($element.is(':checked')) {
		    		var array = data[name];
		    		if(array==null || array==undefined)
		    			array = new Array();
		    		array.push(value); 
					data[name] = array;
				}
		    } else if(classGet=='combobox'){
		    	data[name] =$element.combobox('getValue');
		    } else if(classGet=='comboboxText'){
		    	data[name] =$element.combobox('getText');
		    } else if(classGet=='select'){
		    	data[name]=$element.val();
		    }else {
		    	data[name] = value;	
		    }
		}
	});
	return data;
}

/**
 * 重新打开一个新的tab跳转
 * 
 * @param newTabTile
 * @param url
 * @param isFresh
 */
function loadAndUpdateTab(newTabTile, url, isFresh) {
	var title = self.parent.getCurrentTabTitle();
	self.parent.addTab(newTabTile, url, isFresh);
	self.parent.closeTabb(title);
}



function submitFormData(formid,url,data,gourl,addurl){
	$('#'+formid).form('submit',{
		onSubmit:function(){
			var msg=$(this).form('enableValidation').form('validate');
			if(msg==true){
				FormSaveOrUpdate(url,data,gourl,addurl);	
			}
			return false;
		}
	});

function FormSaveOrUpdate(url,data,gourl,addurl){
	$.ajax( {
		async : false,
		cache : false,
		type : 'POST',
		dataType : "json",
		url : url,
		data :data,
		beforeSend:ajaxLoading,
		error : function() {// 请求失败处理函数
			ajaxLoadEnd();
			parent.window.$.messager.alert('失败','提交失败!');
		},
		success : function(data) { // 请求成功后处理函数。
			ajaxLoadEnd();
			if (data.jht_error_code==0) {
				parent.window.$.messager.confirm('确认', '成功提交，你确定要继续添加吗?', function(r){
					if (r==true){
						window.location = addurl;	
					}else{
						window.location = gourl;	
					}
				});
			} else{//后台异常处理
				parent.window.$.messager.alert('失败',data.jht_error_msg);
			}
		}
	});
}
}


/**
 * 网上案例（实现图片预览）
 * 调用方法：
 * 	<input type="file" name="file"   onchange="PreviewImage(this,'imgHeadPhoto','divPreview')"  />  
 * 	<font color="red"> 图片大小为40＊40</font> <br/>
 *  <div id="divPreview">
 *     <img id="imgHeadPhoto" width="200"  height="200" src="/admin/upload/">
 *  </div>
 * 
 * @param fileObj
 * @param imgPreviewId
 * @param divPreviewId
 */
function PreviewImage(fileObj,imgPreviewId,divPreviewId){  
    var allowExtention=".jpg,.bmp,.gif,.png,.ico,.icon";//允许上传文件的后缀名document.getElementById("hfAllowPicSuffix").value;  
    var extention=fileObj.value.substring(fileObj.value.lastIndexOf(".")+1).toLowerCase();              
    var browserVersion= window.navigator.userAgent.toUpperCase();  
    if(allowExtention.indexOf(extention)>-1){   
        if(fileObj.files){//HTML5实现预览，兼容chrome、火狐7+等  
            if(window.FileReader){  
                var reader = new FileReader();   
                reader.onload = function(e){  
                    document.getElementById(imgPreviewId).setAttribute("src",e.target.result);  
                }    
                reader.readAsDataURL(fileObj.files[0]);  
            }else if(browserVersion.indexOf("SAFARI")>-1){  
                alert("不支持Safari6.0以下浏览器的图片预览!");  
            }  
        }else if (browserVersion.indexOf("MSIE")>-1){  
            if(browserVersion.indexOf("MSIE 6")>-1){//ie6  
                document.getElementById(imgPreviewId).setAttribute("src",fileObj.value);  
            }else{//ie[7-9]  
                fileObj.select();  
                if(browserVersion.indexOf("MSIE 9")>-1)  
                    fileObj.blur();//不加上document.selection.createRange().text在ie9会拒绝访问  
                var newPreview =document.getElementById(divPreviewId+"New");  
                if(newPreview==null){  
                    newPreview =document.createElement("div");  
                    newPreview.setAttribute("id",divPreviewId+"New");  
                    newPreview.style.width = document.getElementById(imgPreviewId).width+"px";  
                    newPreview.style.height = document.getElementById(imgPreviewId).height+"px";  
                    newPreview.style.border="solid 1px #d2e2e2";  
                }  
                newPreview.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod='scale',src='" + document.selection.createRange().text + "')";                              
                var tempDivPreview=document.getElementById(divPreviewId);  
                tempDivPreview.parentNode.insertBefore(newPreview,tempDivPreview);  
                tempDivPreview.style.display="none";                      
            }  
        }else if(browserVersion.indexOf("FIREFOX")>-1){//firefox  
            var firefoxVersion= parseFloat(browserVersion.toLowerCase().match(/firefox\/([\d.]+)/)[1]);  
            if(firefoxVersion<7){//firefox7以下版本  
                document.getElementById(imgPreviewId).setAttribute("src",fileObj.files[0].getAsDataURL());  
            }else{//firefox7.0+                      
                document.getElementById(imgPreviewId).setAttribute("src",window.URL.createObjectURL(fileObj.files[0]));  
            }  
        }else{  
            document.getElementById(imgPreviewId).setAttribute("src",fileObj.value);  
        }           
    }else{  
        alert("仅支持"+allowExtention+"为后缀名的文件!");  
        fileObj.value="";//清空选中文件  
        if(browserVersion.indexOf("MSIE")>-1){                          
            fileObj.select();  
            document.selection.clear();  
        }                  
        fileObj.outerHTML=fileObj.outerHTML;  
    }  
}

//获取当前日期前后天数   0 当天   1 明天  -1昨天  以此类推
function getDateStr(addDays) {
    var dd = new Date();
    dd.setDate(dd.getDate() + addDays);
    var y = dd.getFullYear();
    var m = dd.getMonth()+1;//获取当前月份的日期
    if(m<10) {
    	m = '0' + m;
    }
    var d = dd.getDate();
    if(d<10) {
    	d = '0' + d;
    }
    return y+"-"+m+"-"+d;
}

//获取当前时间
function getCurrentTime() {
	var hours, minutes, seconds, xfile; 
	var intHours, intMinutes, intSeconds; 
	var today, theday; 
	today = new Date(); 
	
	function initArray(){ 
		this.length=initArray.arguments.length 
		for(var i=0;i<this.length;i++) 
			this[i+1]=initArray.arguments[i] 
	} 
	
	var weeks = new initArray( 
		"星期日", 
		"星期一", 
		"星期二", 
		"星期三", 
		"星期四", 
		"星期五", 
		"星期六"); 
		
	theday = today.getFullYear() + "年" + [today.getMonth()+1] + "月" + today.getDate() + "日  " + weeks[today.getDay()+1] + "  "; 
	intHours = today.getHours(); 
	intMinutes = today.getMinutes(); 
	intSeconds = today.getSeconds(); 
	if (intHours == 0) { 
		hours = "12:"; 
		xfile = "午夜"; 
	} else if (intHours < 12) { 
		hours = intHours+":"; 
		xfile = "上午"; 
	} else if (intHours == 12) { 
		hours = "12:"; 
		xfile = "正午"; 
	} else { 
		intHours = intHours - 12 
		hours = intHours + ":"; 
		xfile = "下午"; 
	} 
	
	if (intMinutes < 10) { 
		minutes = "0"+intMinutes+":"; 
	} else { 
		minutes = intMinutes+":"; 
	} 
	if (intSeconds < 10) { 
		seconds = "0"+intSeconds+" "; 
	} else { 
		seconds = intSeconds+" "; 
	} 
	timeString = theday + xfile + hours + minutes + seconds;
	return timeString;
}

//拓展EasyUI验证框架
$.extend($.fn.validatebox.defaults.rules,{
	   TimeCheck : {
		   validator : function(value,param) {     
			   var s = $("input[name="+param[0]+"]").val();
			   //因为日期是统一格式的所以可以直接比较字符串 否则需要Date.parse(_date)转换
			   return value>=s;
		   },
		   message:'非法数据'
	   }
});

//=====================================  拓展EasyUI的相关功能  =====================================
//1、拓展combobox的搜索适应功能
//参数说明：zjl：记录临时字段值的对象，防止重复请求			comboboId：combobox对应的ID			url： 请求的URL（搜索仍然用q），样例：XXX?XXX&q=搜索值
function addComboboxSearch(zjl, comboboId, url) {
	zjl[comboboId] = "";
	$("#" + comboboId).combobox("textbox")[0].addEventListener("input", function() {
		//只有不等于的时候，进入发送搜索流程
		if(zjl[comboboId].trim() != $(this).val().trim()) {
			$("#" + comboboId).combobox("setValue", $(this).val());
			zjl[comboboId] = $(this).val();
			$("#" + comboboId).combobox("reload", url + zjl[comboboId]);
		}
	}, false);
}

function addComboboxEditSearch(zjl, comboxEdit, comboboId, url) {
	zjl[comboboId] = "";
	comboxEdit.combobox("textbox")[0].addEventListener("input", function() {
		//只有不等于的时候，进入发送搜索流程
		if(zjl[comboboId].trim() != $(this).val().trim()) {
			comboxEdit.combobox("setValue", $(this).val());
			zjl[comboboId] = $(this).val();
			comboxEdit.combobox("reload", url + zjl[comboboId]);
		}
	}, false);
}

function addCombogridEditSearch(zjl, comboxEdit, comboboId, url, inputId) {
	zjl[comboboId] = "";
	comboxEdit.combogrid("textbox")[0].addEventListener("input", function() {
		//只有不等于的时候，进入发送搜索流程
		if(zjl[comboboId].trim() != $(this).val().trim()) {
			comboxEdit.combogrid("setValue", $(this).val());
			if(inputId!=undefined)
				$("#" + inputId).val($(this).val());
			zjl[comboboId] = $(this).val();
			comboxEdit.combogrid("grid").datagrid("reload", url + zjl[comboboId]);
		}
	}, false);
}


//拓展EasyUI datagrid提示列（表格中显示的是截取的字符串，鼠标移上去显示完整的字符串）
$.extend($.fn.datagrid.methods, {
    tooltip : function (jq, fields) {
        return jq.each(function () {
            var panel = $(this).datagrid('getPanel');
            if (fields && typeof fields == 'object' && fields.sort) {
                $.each(fields, function () {
                    var field = this;
                    bindEvent($('.datagrid-body td[field=' + field + '] .datagrid-cell', panel));
                });
            } else {
                bindEvent($(".datagrid-body .datagrid-cell", panel));
            }
        });
 
        function bindEvent(jqs) {
            jqs.mouseover(function () {
                var content = $(this).text();
                $(this).tooltip({
                    content : content,
                    trackMouse : true,
                    onHide : function () {
                        $(this).tooltip('destroy');
                    }
                }).tooltip('show');
            });
        }
    }
});

var loadLayerIndex;
//打开加载层
function openloadLayer(){
    loadLayerIndex = layer.load(1, {
        shade: [0.1,'#fff'] 
    });
}
//关闭加载层
function closeloadLayer(){
    layer.close(loadLayerIndex);
}

var CommonUtil = {
	//EasyUI用DataGrid用日期格式化
    DateTimeFormatter: function (value, rec, index) {
    	if (value == undefined) {
    		return "";
    	}
    	var date = new Date(value);
    	
    	var year = date.getFullYear();
    	var month = date.getMonth() + 1;
    	var day = date.getDate();
    	var hour = date.getHours();
    	var min = date.getMinutes();
    	var sec = date.getSeconds();
    	if(month < 10){
    		month = "0" + month;
    	}
    	if(day < 10){
    		day = "0" + day;
    	}
    	if(hour < 10){
    		hour = "0" + hour;
    	}
    	if(min < 10){
    		min = "0" + min;
    	}
    	if(sec < 10){
    		sec = "0" + sec;
    	}
    	
	    return year + "-" + month + "-" + day + " " + hour + ":" + min + ":" + sec;  
    },

    //EasyUI初始化combobox的选中值,将初始加在initValue属性中，如: initValue="xxx"
    InitCombobox: function(){
    	var value = $(this).attr("initValue");
		if(value){
			$(this).combobox('setValue', value);
		}
    }
};

function openNewTab(title,url){    
    var jq = top.jQuery;    
    if (jq("#tabs").tabs('exists', title)){    
    	jq("#tabs").tabs('select', title);    
    } else {  
    	var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';     
    	jq("#tabs").tabs('add',{    
           title:title,    
           content:content,
           icon:'icon icon-nav',
           closable:true
         });    
    }
    
    jq(".tabs-inner").dblclick(function() {
		var subtitle = jq(this).children(".tabs-closable").text();
		jq('#tabs').tabs('close', subtitle);
	});
	/* 为选项卡绑定右键 */
    jq(".tabs-inner").bind('contextmenu', function(e) {
		jq('#mm').menu('show', {
			left : e.pageX,
			top : e.pageY
		});

		var subtitle = jq(this).children(".tabs-closable").text();

		jq('#mm').data("currtab", subtitle);
		jq('#tabs').tabs('select', subtitle);
		return false;
	});
} 

//LTrim(string):去除左边的空格
function LTrim(str){
	var whitespace = new String(" \t\n\r");
	var s = new String(str);
	if (whitespace.indexOf(s.charAt(0)) != -1){
		var j=0, i = s.length;
		while (j < i && whitespace.indexOf(s.charAt(j)) != -1){
			j++;
		}
		s = s.substring(j, i);
	}
	return s;
}

//RTrim(string):去除右边的空格
function RTrim(str){
	var whitespace = new String(" \t\n\r");
	var s = new String(str);
	if (whitespace.indexOf(s.charAt(s.length-1)) != -1){
		var i = s.length - 1;
		while (i >= 0 && whitespace.indexOf(s.charAt(i)) != -1){
			i--;
		}
		s = s.substring(0, i+1);
	}
	return s;
}

//Trim(string):去除前后空格
function Trim(str){
	return RTrim(LTrim(str));
}

function getCookie(src1,src2){
    var arr1=document.cookie.split(";");
    var resultArr="";
    // text.value=document.cookie;
    for(var i=0;i<arr1.length;i++) {
      var arr2=arr1[i].split("=");

      arr2[0]=Trim(arr2[0]);//去掉空格
      if(arr2[0]==src1) {
        resultArr=arr2[1];
      }
    }

    return resultArr;
}

var noResultView = $.extend({},$.fn.datagrid.defaults.view,{
    onAfterRender:function(target){
        $.fn.datagrid.defaults.view.onAfterRender.call(this,target);
        var opts = $(target).datagrid('options');
        var vc = $(target).datagrid('getPanel').children('div.datagrid-view');
        vc.children('div.datagrid-empty').remove();
        if (!$(target).datagrid('getRows').length){
            var d = $('<div class="datagrid-empty"></div>').html(opts.emptyMsg || 'no records').appendTo(vc);
            d.css({
                position:'absolute',
                left:0,
                top:35,
                width:'100%',
                textAlign:'center'
            });
        }
    }
});

//easyui 合并行
$.extend($.fn.datagrid.methods, {
    autoMergeCells: function (jq, fields) {
        return jq.each(function () {
            var target = $(this);
            if (!fields) {
                fields = target.datagrid("getColumnFields");
            }
            
            var rows = target.datagrid("getRows");
            var i = 0,
            j = 0,
            temp = {};
            for (i; i < rows.length; i++) {
                var row = rows[i];
                j = 0;
                for (j; j < fields.length; j++) {
                    var field = fields[j];
                    var tf = temp[field];
                    if (!tf) {
                        tf = temp[field] = {};
                        tf[row[field]] = [i];
                    } else {
                        var tfv = tf[row[field]];
                        if (tfv) {
                            tfv.push(i);
                        } else {
                            tfv = tf[row[field]] = [i];
                        }
                    }
                }
            }

            $.each(temp, function (field, colunm) {
                $.each(colunm, function () {
                    var group = this;
                    if (group.length > 1) {
                        var before,
                        after,
                        megerIndex = group[0];
                        for (var i = 0; i < group.length; i++) {
                            before = group[i];
                            after = group[i + 1];
                            if (after && (after - before) == 1) {
                                continue;
                            }
                            var rowspan = before - megerIndex + 1;
                            if (rowspan > 1) {
                                target.datagrid('mergeCells', {
                                    index: megerIndex,
                                    field: field,
                                    rowspan: rowspan
                                });
                            }
                            if (after && (after - before) != 1) {
                                megerIndex = after;
                            }
                        }
                    }
                });
            });
        });
    }
});

//easyui 合并行
$.extend($.fn.treegrid.methods, {
	autoMergeCells: function (jq, fields) {
		return jq.each(function () {
			var target = $(this);
			if (!fields) {
				fields = target.treegrid("getColumnFields");
			}
			
			var rows = target.treegrid("getRows");
			var i = 0,
			j = 0,
			temp = {};
			for (i; i < rows.length; i++) {
				var row = rows[i];
				j = 0;
				for (j; j < fields.length; j++) {
					var field = fields[j];
					var tf = temp[field];
					if (!tf) {
						tf = temp[field] = {};
						tf[row[field]] = [i];
					} else {
						var tfv = tf[row[field]];
						if (tfv) {
							tfv.push(i);
						} else {
							tfv = tf[row[field]] = [i];
						}
					}
				}
			}
			
			$.each(temp, function (field, colunm) {
				$.each(colunm, function () {
					var group = this;
					if (group.length > 1) {
						var before,
						after,
						megerIndex = group[0];
						for (var i = 0; i < group.length; i++) {
							before = group[i];
							after = group[i + 1];
							if (after && (after - before) == 1) {
								continue;
							}
							var rowspan = before - megerIndex + 1;
							if (rowspan > 1) {
								target.treegrid('mergeCells', {
									index: megerIndex,
									field: field,
									rowspan: rowspan
								});
							}
							if (after && (after - before) != 1) {
								megerIndex = after;
							}
						}
					}
				});
			});
		});
	}

});

$.extend($.fn.validatebox.defaults.rules, {    
    minLength: {    
        validator: function(value, param){    
            return value.length >= param[0];    
        },    
        message: '请最少输入{0}个字符！'   
    }    
}); 

String.prototype.replaceAll = function(reallyDo, replaceWith, ignoreCase) {  
    if (!RegExp.prototype.isPrototypeOf(reallyDo)) {  
        return this.replace(new RegExp(reallyDo, (ignoreCase ? "gi": "g")), replaceWith);  
    } else {  
        return this.replace(reallyDo, replaceWith);  
    }  
} 

/**
 * 简单的模版替换
 */
var dataTemplate = function(template,data){  
    var outPrint="";  
    var matchs = template.match(/\{[a-zA-Z]+\}/gi);  
    var temp="";  
    for(var j = 0 ; j < matchs.length ;j++){  
        if(temp == "")  
            temp = template;  
        var re_match = matchs[j].replace(/[\{\}]/gi,"");  
        temp = temp.replace(matchs[j],data[re_match]);  
    }  
    outPrint += temp;  
    return outPrint;  
}  
