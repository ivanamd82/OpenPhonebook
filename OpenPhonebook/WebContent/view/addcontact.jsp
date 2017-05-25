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
                        <form class="formLogin" action="addcontact" method="post">
                        	<label for="inputName" class="sr-only">First name</label>
                            <input type="text" id="inputName" name="nameContact" class="form-control" placeholder="First name" required autofocus>
                            <label for="inputLName" class="sr-only">Last name</label>
                            <input type="text" id="inputLName" name="nameLContact" class="form-control" placeholder="Last name" required>
                            <label for="inputEmail" class="sr-only">Email address</label>
                            <input type="email" id="inputEmail" name="emailContact" class="form-control" placeholder="Email" required>
                            <label for="inputPhone" class="sr-only">Phone</label>
                            <input type="text" id="inputPhone" name="phoneContact" class="form-control" placeholder="Phone" required>
                            <label for="inputCity" class="sr-only">City</label>
                            <input type="text" id="inputCity" name="cityContact" class="form-control" placeholder="City" required>
                            <input class="button" type="submit" name="AddContact" value="Add contact" />
                        </form>
                   	</div>
              	</div>
           	</article>
    	</div>
   	</div>
   	<%@ include file="bottomscripts.jsp"%>
</body>
</html>