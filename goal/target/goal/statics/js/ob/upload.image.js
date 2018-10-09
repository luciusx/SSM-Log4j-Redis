$(function(){
	
	$(".upload-img-btn").each(function(i, n){
		var _adBtn = $(n);
		var opts = $(_adBtn).attr("upload-options");
		var attrs = opts.split(",");
		
		var _target = "adImg";//默认的图片要添加到的位置
		var _dialog = "dlg";//默认的上传图片的弹框
		var _input = "adImgUrl";//图片路径保存的表单值
		var _maxImg = "true";//默认用原图
		
		for(var i=0; i<attrs.length;i++){
			var attr = attrs[i];
			if(attr){
				var kv = attr.split(":");
				var k = kv[0];
				var v = kv[1];
				if(k == "target"){
					_target = v;
				}else if(k == "dialog"){
					_dialog = v;
				}else if(k == "inputName"){
					_input = v;
				}else if(k == "maxImg"){
					if(v != "true" && v == "false"){
						_maxImg = v;
					}
				}
			}
		}
		
		var _it = $('input[name="'+_input+'"]');
		var _dlg = $("#" + _dialog);
		var _tg = $("#" + _target);
		
		var initUrls = $(_it).val();//初始化图片
		if(initUrls){
			$(_tg).attr("value", initUrls);
			var urls = initUrls.split(",");
			for(var i=0; i<urls.length; i++){
				var url = urls[i];
				$(_tg).append('<p><img src="'+url+'" width="100" height="100"><span class="del-ico">x</span></p>');
				$(".del-ico").on("click", function(){
					$(this).parent().remove();
					var values = getImgUrls(_tg); 
					$(_it).val(values);
					$(_tg).attr("value", values);
				});
			}
		}
		
		$(_adBtn).on("click", function(){
			var maxNum = $(this).attr("maxUploadNum");
			var curNum = $("#" + _target + " img").size();
			if(maxNum){
				if(curNum >= maxNum){
					$.messager.alert('警告','上传图片个数已达上限：' + maxNum);
					return;
				}
			}
			
			var _top = document.body.scrollTop + 80;
			var _left = document.body.scrollWidth / 2;
			
			$(_dlg).dialog({
				closed : false,
				iconCls: 'icon-save',
				shadow : true,
				buttons: [{
					text:'确认返回',
					iconCls:'icon-ok',
					handler:function(){
						var ck = "max_img";
						if(_maxImg == "false"){
							ck = "min_img";
						}
						var imgUrl = getCookie(ck);//源图
						if(imgUrl){
							var imgUrls = getImgUrls(_tg);
							if(imgUrls){
								imgUrls += ',' + imgUrl;
							}else{
								imgUrls = imgUrl;
							}
							$(_it).val(imgUrls);
							$(_tg).attr("value", imgUrls);
							//imgUrl=imgUrl+"?"+new Date().getTime();
							$(_tg).append('<p><img src="'+imgUrl+'" width="100" height="100"><span class="del-ico">x</span></p>');
							$(".del-ico").on("click", function(){
								$(this).parent().remove();
								var values = getImgUrls(_tg); 
								$(_it).val(values);
								$(_tg).attr("value", values);
							});
						}
						$(_dlg).dialog('close');
					}
				},{
					text:'取消',
					handler:function(){
						$(_dlg).dialog('close');
					}
				}]
			});
			
			$(_dlg).dialog('move', {top:_top});
		});
		
	});
});

function getImgUrls(_tg){
	var _child = $(_tg).find("img");
	var values = '';
	if($(_child).size() > 0){
		$(_child).each(function(i, j){
			var src = $(j).attr("src");
			values += src + ',';
		});
		values = values.substring(0, values.length - 1);
	}else{
		values = '';
	}
	return values;
}