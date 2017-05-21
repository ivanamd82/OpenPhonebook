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
		<a class="navbar-brand" href="#">My Home Page</a>
	</div>
	<div id="navbar" class="navbar-collapse collapse">
		<ul class="nav navbar-nav">
			<li class="${'/view/addcontact.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="addcontact">Add contact</a></li>
			<li class="${'/view/userhome.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="userhome">Search contact</a></li>
			<li class="${'/view/listcontacts.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="listcontacts">List contacts</a></li>
			<li class="${'/view/index.jsp' == pageContext.request.servletPath ? 'active' : 'none'}"><a href="home">Logout</a></li>
		</ul>
	</div>
</nav>