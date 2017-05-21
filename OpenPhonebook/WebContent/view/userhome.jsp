<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<%@ include file="head.jsp"%>
</head>
<body>
	<div class="page">
		<%@ include file="navuser.jsp"%>
		<div id="content">
			<article class="container bgimg">
				<div class="row">
            		<div class="col-xs-8 col-sm-7 col-md-4 login-form">
            		 	<h2>Search contact</h2>
            		 	<form class="formLogin" action="userhome" method="post">
            		 		<label class="sr-only">Search</label>
            		 		<input type="search" id="inputSearch" name="searchContact" class="form-control" placeholder="Search" required autofocus />
            		 		<input type="submit" class="button" name="Search" value="Search" />
            		 	</form>
            		</div>
            	</div>
    		</article>
    	</div>
	</div>
	<%@ include file="bottomscripts.jsp" %>
</body>
</html>