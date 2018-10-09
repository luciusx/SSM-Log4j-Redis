<%@ page contentType="text/html;charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/commons/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>提示</title>
	<style type="text/css">
		.msg-box{width:480px; height:250px; background-color: #F6FBFF; border:1px solid #95B8E7; margin: 20px auto; font-size: 12px; line-height: 30px; color: #0064FF;}
		.msg-box .nav{width:470; height:30px; border-bottom: 1px solid #95B8E7; background-color:#E0ECFF; padding-left: 10px;} 
		.msg-box .content{width:480; height:220px; padding-top:80px; text-align: center;  }
	</style>
</head>

<body>

	<c:set var="loginUrl" value="${permissionAddr}" />
	
	<div class="msg-box">
		<div class="nav">提示</div>
		<div class="content">${tips}，本页将在<strong id='tt'></strong>后，跳转至：<span id='link'></span></div>
	</div>
	
</body>

<script type="text/javascript">
	function go(t, pageName, url) {
		//t设置跳转时间：秒
		//url设置跳转网址
		/* document
				.write("<div id=text>本页将在<strong id='tt'></strong>后，跳转至：<span id='link'></span></div>");*/
		document.getElementById("link").innerHTML = "<a href=\"javascript:void(0);\">" + pageName + "</a>"; 
		$(t, url);
	}
	function $(t, url) {
		ta = t - 1;
		tb = t + "000";
		d = document.getElementById("tt");
		d.innerHTML = t;
		window.setInterval(function() {
			go_to(url);
		}, 1000);
	}
	function go_to(url) {
		d.innerHTML = ta--;
		if (ta < 0) {
			//document.write("正在跳转至：<a href="+url+">登录页面</a>");
			top.document.location.href = url;
		} else {
			return;
		}
	}
	function open(url){
		top.document.location.href = url;
	}
</script>
<script type="text/javascript">
	go(3, "登录页面", "${loginUrl}");
</script>
</html>