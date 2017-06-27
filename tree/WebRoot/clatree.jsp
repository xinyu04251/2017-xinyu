<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

<title>My JSP 'clatree.jsp' starting page</title>

	<link rel="stylesheet" href="http://static.runoob.com/assets/js/jquery-treeview/jquery.treeview.css" />
	<link rel="stylesheet" href="http://static.runoob.com/assets/js/jquery-treeview/screen.css" />

	<script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script src="http://static.runoob.com/assets/js/jquery-treeview/jquery.cookie.js"></script>
	<script src="http://static.runoob.com/assets/js/jquery-treeview/jquery.treeview.js" type="text/javascript"></script>

	<script type="text/javascript">
	$(document).ready(function(){
		$("#browser").treeview({
			toggle: function() {
				console.log("%s was toggled.", $(this).find(">span").text());
			}
		});
	});
	</script>
</head>
<c:if test="${empty CLASSLIST }">
	<c:redirect url="ClassServlet">
	    <c:param name="method" value="findAll"></c:param>
	</c:redirect>
</c:if>
<body>
	<div id="main">
		<ul id="browser" class="filetree treeview-famfamfam">
			<li><span class="folder">���а༶</span>
				<ul>
					<c:forEach var="ci" items="${CLASSLIST }">
						<li class="closed"><span class="folder">${ci.className }</span>
							<ul>
								<c:forEach var="si" items="${ci.stuSet }">
									<li><span class="file">${si.stuName }</span></li>
								</c:forEach>
							</ul></li>
					</c:forEach>
				</ul></li>
		</ul>
	</div>
</body>
</html>
