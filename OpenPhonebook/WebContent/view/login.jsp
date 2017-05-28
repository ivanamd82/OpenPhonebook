<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<%@ include file="head.jsp"%>
</head>
<body>
	<div class="page">
		<%@ include file="nav.jsp"%>
		<div id="content">
			<article class="container bgimg">
                <div class="row">
                    <div class="col-xs-8 col-sm-7 col-md-4 login-form">
                    	<form class="formLogin" action="login" method="post">
                            <h2 class="wcolor">Please login</h2>
                            <label for="inputName" class="sr-only">Username</label>
                            <input type="text" id="inputName" name="userName" class="form-control" placeholder="Username" required autofocus>
                            <label for="inputPassword" class="sr-only">Password</label>
                            <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
                            <input class="button" type="submit" name="login" value="Login" />
                        </form>
                    </div>
             	</div>
           	</article>  	
		</div>
	</div>
	<%@ include file="bottomscripts.jsp"%>
</body>	
</html>