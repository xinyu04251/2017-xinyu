<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<title>��ʦ��ѯҳ��</title>

<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet"
	href="http://www.bootcss.com/p/buttons/css/buttons.css">

<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript" src="jar/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("tr:first").css("backgroundColor", "#09F");
		$("tr:first").css("color", "white");
		$("tr:odd:not(tr:first)").css("backgroundColor", "");
		$("tr:even:not(tr:first)").css("backgroundColor", "#CCC");
	});

	function deleteOne(tno) {
		if (confirm("ȷ��Ҫɾ��ô")) {
			location.href = "TServlet?method=delete&tNo=" + tno;
		}
	}
</script>
</head>
<c:if test="${empty TINFO }">
	<c:redirect url="TServlet">
		<c:param name="method" value="findAll"></c:param>
	</c:redirect>
</c:if>
<body>
	<table class="table table-striped" align="center">
		<caption>
			<form action="TServlet" method="post">
				<input type="text" name="str"
					class="TEXT button-glow button-border button-rounded button-primary"
					style="width: 320px;" /> <input type="hidden" name="method"
					value="findBy" /> <input type="submit" value="����һ��"
					class="button button-glow button-border button-rounded button-primary" />
			</form>
			<a href="tReg.jsp"><b>ע�����û�</b> </a>
		</caption>
		<tr>
			<th>���</th>
			<th>�˺�</th>
			<th>����</th>
			<th>�Ա�</th>
			<th>����</th>
			<th>����</th>
			<th>����</th>
			<th>�绰</th>
			<th>ѧ��</th>
			<th>��Ŀ</th>
			<th>��ɫ</th>
			<th>����</th>
		</tr>
		<c:forEach var="ti" items="${TINFO }" varStatus="t">
			<tr>
				<td>${t.count }</td>
				<td>${ti.tId }</td>
				<td>${ti.tName }</td>
				<td>${ti.tSex }</td>
				<td>${ti.tOri }</td>
				<td>${ti.tNat }</td>
				<td>${ti.tAge }</td>
				<td>${ti.tPhone }</td>
				<td>${ti.eduBac }</td>
				<td>${ti.si.subName }</td>
				<td>${ti.ri.roleName }</td>
				<td><a href="javascript:deleteOne(${ti.tNo })">ɾ��</a> <a
					href="TServlet?method=findById&tNo=${ti.tNo }">�޸�</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
