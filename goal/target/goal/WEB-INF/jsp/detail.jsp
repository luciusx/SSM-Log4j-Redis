<div id="dlg" class="easyui-dialog" style="width:400px;height:280px;padding:10px 20px"
     closed="true" buttons="#dlg-buttons">
    <div class="ftitle">User Information</div>
    <form id="fm" method="post">
        <div class="fitem">
            <label>First Name:</label>
            <input name="orderSn" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem">
            <label>Last Name:</label>
            <input name="mobile" class="easyui-validatebox" required="true">
        </div>
        <div class="fitem">
            <label>Phone:</label>
            <input name="fullAddress">
        </div>
        <div class="fitem">
            <label>Email:</label>
            <input name="serviceTime" class="easyui-validatebox" validType="email">
        </div>
    </form>
</div>
<div id="dlg-buttons">
    <a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="saveUser()">Save</a>
    <a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
</div>