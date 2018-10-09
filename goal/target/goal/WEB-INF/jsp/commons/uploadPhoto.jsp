<%@ page contentType="text/html;charset=UTF-8" %>

<div id="dlg" class="easyui-dialog" title="上传图片" style="width:860px;height:530px;" 
	data-options="closed:'ture',resizable:'true',shadow:'true'">
		<iframe src='http://fs.jinhuatuo.com/image/showUploadCommon?v=<%=System.currentTimeMillis() %>' id="ifr" scrolling="no" frameborder="0"  width="100%" height="80%"></iframe>
</div>
