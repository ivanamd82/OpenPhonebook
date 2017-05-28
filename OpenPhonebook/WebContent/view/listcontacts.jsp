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
				<div class="row login-form">
					<h2>Contacts</h2>
					<ul class="bgcolor">
						<c:forEach var="contact" items="${contactList}">
							<li class="bgcolor">
								<div class="col-md-2">${contact.getName()}</div>
								<div class="col-md-2">${contact.getLastName()}</div>
								<div class="col-md-2">${contact.getPhone()}</div>
								<div class="col-md-2">${contact.getPhone()}</div>
								<div class="col-md-2">${contact.getPhone()}</div>
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