<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <script>
    var a1 = false;
	var a2 = false;
	var a3 = false;
	var a4 = false;
	var a5 = false;
	var a6 = false;
	var a7 = false;
	var a8 = false;
    function checkaccount(){
		var name = document.getElementById("t1").value;
		var nn = /^[0-9]{12}$/;
		var ee = nn.test(name);
		if(ee){
			document.getElementById("l1").innerHTML = "<font color='green' size='-1'>学号正确</font>";
			a1 = true;
			}
		else{
			document.getElementById("l1").innerHTML = "<font color='red' size='-2'>学号错误</font>";
			a1 = false;
			}
		}
	
	function password1(){
		var name1 = document.getElementById("t2").value;
		var nn = /^[a-zA-Z0-9]{8,16}$/;
		var ee = nn.test(name1);
		if(ee){
			document.getElementById("l2").innerHTML = "<font color='green' size='-1'>密码可以使用</font>";
			a2 = true;
			}
		else{
			document.getElementById("l2").innerHTML = "<font color='red' size='-2'>密码包含大小写字母和数字的组合，不能使用特殊字符，长度在8-16之间</font>";
			a2 = false;
			}
		}
		
	function password2(){
		var name1 = document.getElementById("t2").value;
		var name2 = document.getElementById("t3").value;
		if(name1==name2){
			document.getElementById("l3").innerHTML = "<font color='green' size='-1'>密码一致</font>";
			a3 = true;
			}
		else{
			document.getElementById("l3").innerHTML = "<font color='red' size='-2'>密码不一致</font>";
			a3 = false;
			}
		}
		
	function checkname(){
		var name = document.getElementById("t4").value;
		var nn = /^[\u4e00-\u9fa5]{2,}$/;
		var ee = nn.test(name);
		if(ee){
			document.getElementById("l4").innerHTML = "<font color='green' size='-1'>姓名可以使用</font>";
			a4 = true;
			}
		else{
			document.getElementById("l4").innerHTML = "<font color='red' size='-2'>姓名不可以使用</font>";
			a4 = false;
			}
		}
	
	function checktel(){
		var name = document.getElementById("t6").value;
		var nn = /^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\d{8}$/;
		var ee = nn.test(name);
		if(ee){
			document.getElementById("l6").innerHTML = "<font color='green' size='-1'>手机号码正确</font>";
			a6 = true;
			}
		else{
			document.getElementById("l6").innerHTML = "<font color='red' size='-2'>手机号码错误</font>";
			a6 = false;
			}
		}
		
	function checkclass(){
		var name = document.getElementById("t7").value;
		var nn = /^[0-9]{0,}$/;
		var ee = nn.test(name);
		if(ee){
			document.getElementById("l7").innerHTML = "<font color='green' size='-1'>班级编号正确</font>";
			a7 = true;
			}
		else{
			document.getElementById("l7").innerHTML = "<font color='red' size='-2'>班级编号错误</font>";
			a7 = false;
			}
		}

    function checkage(){
		var name = document.getElementById("t8").value;
		var nn = /^[0-9]{0,}$/;
		var ee = nn.test(name);
		if(ee){
			document.getElementById("l8").innerHTML = "<font color='green' size='-1'>年龄正确</font>";
			a8 = true;
			}
		else{
			document.getElementById("l8").innerHTML = "<font color='red' size='-2'>年龄错误</font>";
			a8 = false;
			}
		}
		
	function check(){
		if(a1&&a2&&a3&&a4&&a6&&a7&&a8){
			return true;
			}
		else{
			return false;
			}
		}
</script>
<style type="text/css">
table {
	width: 60%;
	margin: auto;
	border: 1px solid #09F;
}

th,td {
	border: 1px solid #09F;
}
</style>
</head>
<body bgcolor="#FFFFFF">
    <form action="StuServlet" method="post">
    <table>
        <thead>
            <tr>
                <th bgcolor="#0099FF" colspan="2"><font color="#FFFFFF" size="+3" face="微软雅黑"><b>学生修改</b></font></th>
            </tr>        
        </thead>
        
        <tbody>
            <tr>
                <td width="15%"><b>学号：</b></td>
                <td width="45%"><input type="text" name="stuId" required value="${STUINFO.stuId }" id="t1" onBlur="checkaccount()"/><label id="l1">&nbsp;</label>
                </td>
            </tr>
            <tr>
                <td><b>性别：</b></td>
                <td><input type="radio" name="stuSex" value="男" ${STUINFO.stuSex=="男"?"checked":"" }/>男
                <input type="radio" name="stuSex" value="女" ${STUINFO.stuSex=="女"?"checked":"" }/>女</td>
            </tr>
            <tr>
                <td><b>密码（至少8位）：</b><br/><font size="-3">请输入密码，区分大小写。</font></td>
                <td><input type="password" name="stuPass" required value=${STUINFO.stuPass } id="t2" onBlur="password1()"/><label id="l2">&nbsp;</label></td>
            </tr>
            <tr>
                <td><b>确认密码（至少8位）：</b><br/><font size="-3">请再输入一遍密码。</font></td>
                <td><input type="password" name="stuPass" required value=${STUINFO.stuPass } id="t3" onBlur="password2()"/><label id="l3">&nbsp;</label></td>
            </tr>
            <tr>
                <td><b>真实姓名：</b></td> 
                <td><input type="text" name="stuName" required value=${STUINFO.stuName } id="t4" onBlur="checkname()"/><label id="l4">&nbsp;</label></td>           
            </tr>
            <tr>
                <td><b>年龄：</b></td> 
                <td><input type="text" name="stuAge" required value=${STUINFO.stuAge } id="t8" onBlur="checkage()"/><label id="l8">&nbsp;</label></td>           
            </tr>
            <tr>
                <td><b>地区：</b></td>
                <td><select name="stuOri">
                    <option value="北京" ${STUINFO.stuOri=="北京"?"selected":"" }/>北京
                    <option value="内蒙古" ${STUINFO.stuOri=="内蒙古"?"selected":"" }/>内蒙古
                    <option value="黑龙江" ${STUINFO.stuOri=="黑龙江"?"selected":"" }/>黑龙江
                    <option value="吉林" ${STUINFO.stuOri=="吉林"?"selected":"" }/>吉林
                    <option value="辽宁" ${STUINFO.stuOri=="辽宁"?"selected":"" }/>辽宁
                    <option value="山东" ${STUINFO.stuOri=="山东"?"selected":"" }/>山东
                    <option value="河北" ${STUINFO.stuOri=="河北"?"selected":"" }/>河北
                    <option value="河南" ${STUINFO.stuOri=="河南"?"selected":"" }/>河南
                    <option value="湖南" ${STUINFO.stuOri=="湖南"?"selected":"" }/>湖南
                    <option value="湖北" ${STUINFO.stuOri=="湖北"?"selected":"" }/>湖北
                    <option value="甘肃 " ${STUINFO.stuOri=="甘肃 "?"selected":"" }/>甘肃 
                    <option value="青海 " ${STUINFO.stuOri=="青海"?"selected":"" }/>青海
                    <option value="西藏" ${STUINFO.stuOri=="西藏"?"selected":"" }/>西藏
                    <option value="新疆" ${STUINFO.stuOri=="新疆"?"selected":"" }/>新疆
                    <option value="云南" ${STUINFO.stuOri=="云南"?"selected":"" }/>云南
                    <option value="四川" ${STUINFO.stuOri=="四川"?"selected":"" }/>四川
                    <option value="广州" ${STUINFO.stuOri=="广州"?"selected":"" }/>广州
                    <option value="山西" ${STUINFO.stuOri=="山西"?"selected":"" }/>山西
                    <option value="福建" ${STUINFO.stuOri=="福建"?"selected":"" }/>福建
                    <option value="江苏" ${STUINFO.stuOri=="江苏"?"selected":"" }/>江苏
                    <option value="江西" ${STUINFO.stuOri=="江西"?"selected":"" }/>江西
                    <option value="陕西" ${STUINFO.stuOri=="陕西"?"selected":"" }/>陕西
                    </select></td>
            </tr>
            <tr>
                <td><b>职业：</b></td>
                <td><select name="stuJob">
                    <option value="学生" />学生
                    <option value="教师" />教师
                    </select></td>
            </tr>
            <tr>
                <td><b>民族：</b></td>
                <td><select name="stuNat">
                    <option value="汉族" ${STUINFO.stuNat=="汉族"?"selected":"" }/>汉族
                    <option value="蒙族" ${STUINFO.stuNat=="蒙族"?"selected":"" }/>蒙族
                    <option value="壮族" ${STUINFO.stuNat=="壮族"?"selected":"" }/>壮族
                    <option value="满族" ${STUINFO.stuNat=="满族"?"selected":"" }/>满族
                    <option value="藏族" ${STUINFO.stuNat=="藏族"?"selected":"" }/>藏族
                    <option value="回族" ${STUINFO.stuNat=="回族"?"selected":"" }/>回族
                    <option value="苗族" ${STUINFO.stuNat=="苗族"?"selected":"" }/>苗族
                    <option value="维吾尔族" ${STUINFO.stuNat=="维吾尔族"?"selected":"" }/>维吾尔族
                    </select></td>
            </tr>
            <tr>
                <td><b>手机号码：</b></td>
                <td><input type="tel" name="stuPhone" value=${STUINFO.stuPhone } required id="t6" onBlur="checktel()"/><label id="l6">&nbsp;</label></td>
            </tr>
            <tr>
                <td><b>班级编号：</b></td>
                <td><input type="tel" name="classId" value=${STUINFO.classId } id="t7" onBlur="checkclass()"/><label id="l7">&nbsp;</label></td>
            </tr>
        </tbody>
    </table><br/>
    <center>
        <input type="hidden" name="stuNo" value=${STUINFO.stuNo }>
        <input type="hidden" name="stuState" value=${STUINFO.stuState }>
        <input type="hidden" name="method" value="update">
        <input type="submit" value=" 提 交 " onClick="check()"/>
    </center>
    </form>
</body>
</html>
