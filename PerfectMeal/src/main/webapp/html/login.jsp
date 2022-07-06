<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
	<body>
		<h1>You have logged in!</h1>
		<h2>Welcome <%= request.getAttribute("firstName")%> <%= request.getAttribute("lastName") %> </h2>	
		<h2>Email: <%= request.getAttribute("userEmail") %></h2>	
		<from action="logtout" method="post">
			<button name="logOut" >LogOut</button>
		</from>
	</body>
</html>