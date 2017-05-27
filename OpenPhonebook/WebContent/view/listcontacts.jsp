<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="head.jsp"%>
</head>
<body>
	<div class="page">
		<%@ include file="navuser.jsp"%>
		<div id="content">
			<article class="container bgimg">
				<div class="row list">
					<h2>Contacts</h2>
					<ul>
						<c:forEach var="contact" items="${contactList}">
							<li>
								<div class="col-md-3">${contact.getName()}</div>
								<div class="col-md-9">Ovdje je tekst</div>
							</li>
						</c:forEach>
					</ul>
				</div>
			</article>
		</div>
	</div>
	<%@ include file="bottomscripts.jsp"%>

</body>
</html>