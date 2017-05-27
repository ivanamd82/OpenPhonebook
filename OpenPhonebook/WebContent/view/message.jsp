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
				<p id="mess">${message.toString()}</p>
				<button class="btn">Go back</button>
			</article>
		</div>
	</div>
</body>
</html>