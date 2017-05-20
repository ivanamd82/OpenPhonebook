<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<nav class="navbar navbar-default container">
	<div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
			<span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
           	<span class="icon-bar"></span>
		</button>
	</div>
	<div id="navbar" class="navbar-collapse collapse">
		<ul class="nav navbar-nav">
			<li class="${'/view/index.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="home">Home</a></li>
            <li class="${'/view/login.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="login">Login</a></li>
            <li class="${'/view/register.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="register">Register</a></li>
        </ul>
	</div>
</nav>