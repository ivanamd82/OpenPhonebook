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
				<div class="login-form">
					<h2 class="wcolor">Contacts</h2>
					<ul class="list-group">
						<c:forEach var="contact" items="${contactList}">
							<li class="row list-group-item">
								<p class="col-md-2">${contact.getName()}</p>
								<p class="col-md-2">${contact.getLastName()}</p>
								<p class="col-md-2">${contact.getPhone()}</p>
								<p class="col-md-3">${contact.getEmail()}</p>
								<p class="col-md-3">${contact.getCity()}</p>
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