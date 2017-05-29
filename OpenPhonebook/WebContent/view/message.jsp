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
		<div id="content">
			<article class="container bgimg">
				<div class="login-form">
					<p class="wcolor">${message.toString()}</p>
					<a href="${link.toString()}" class="loglink"><button>Go back!</button></a>
				</div>
			</article>
		</div>
	</div>
</body>
</html>