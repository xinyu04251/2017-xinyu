<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>

<title>ѧ����ѯҳ��</title>

<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
<link rel="stylesheet" href="http://www.bootcss.com/p/buttons/css/buttons.css">  

<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<script type="text/javascript" src="jar/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("tr:first").css("backgroundColor", "#09F");
		$("tr:first").css("color", "white");
		$("tr:odd:not(tr:first)").css("backgroundColor", "");
		$("tr:even:not(tr:first)").css("backgroundColor", "#CCC");
	});

	function deleteStu(sno) {
		if (confirm("ȷ��Ҫɾ��ô��")) {
			location.href = "StuServlet?method=deleteOne&stuNo=" + sno;
		}
	}
</script>

</head>
<c:if test="${empty STUINFO }">
	<c:redirect url="StuServlet">
		<c:param name="method" value="findAll"></c:param>
		<%-- <c:param name="page" value="1"></c:param> --%>
	</c:redirect>
</c:if>
<body>
	<table class="table table-striped" align="center">
		<caption>
		  <form action="StuServlet" method="post">
		    <input type="text" name="str" class="TEXT button-glow button-border button-rounded button-primary" style="width: 320px;"/>
		    <input type="hidden" name="method" value="search"/>
		    <input type="hidden" name="page" value="1"/>
		    <input type="submit" value="����һ��" class="button button-glow button-border button-rounded button-primary"/>
		  </form>
			<a href="stuReg.jsp"><b>ע�����û�</b> </a>
		</caption>
		<tr>
			<th>���</th>
			<th>ѧ��</th>
			<th>����</th>
			<th>�Ա�</th>
			<th>����</th>
			<th>����</th>
			<th>����</th>
			<th>�绰</th>
			<th>�༶</th>
			<th>����</th>
		</tr>
		<c:forEach var="si" items="${STUINFO }" varStatus="s">
			<tr>
				<td>${s.count }</td>
				<td>${si.stuId }</td>
				<td>${si.stuName }</td>
				<td>${si.stuSex }</td>
				<td>${si.stuOri }</td>
				<td>${si.stuNat }</td>
				<td>${si.stuAge }</td>
				<td>${si.stuPhone }</td>
				<td>${si.ci.gi.graName }.${si.ci.className }</td>
				<td><a href="javascript:deleteStu(${si.stuNo })">ɾ��</a> <a
					href="StuServlet?method=findById&stuNo=${si.stuNo }">�޸�</a></td>
			</tr>
		</c:forEach>
		
		<%-- <tr>
			<td colspan="10" align="right">
				<c:forEach var="i" begin="1" end="${PAGE }" step="1">
					<c:choose>
						<c:when test="${param.page==i }">
							${i }&nbsp;
						</c:when>
						<c:otherwise>
							<a href="StuServlet?method=findAll&page=${i }">${i }</a>&nbsp;
						</c:otherwise>
					</c:choose>	
				</c:forEach>
			</td>
		</tr> --%>
	</table>
</body>
</html>
