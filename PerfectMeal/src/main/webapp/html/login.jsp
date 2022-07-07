<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page   import= "javax.servlet.http.HttpSession" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
	<body>
		<h1>You have logged in!</h1>
		<h2>Name: <%= request.getAttribute("firstName")%> <%= request.getAttribute("lastName") %> </h2>	
		<h2>Email: <%= request.getAttribute("userEmail") %></h2>
		<h2>Session value: <%= session.getAttribute("loginEmail") %></h2>

        <form action="userProfile" method="post">
 		    <input type="button" Value="User Profile!!" />
        </form>

		<br>	

		<form action="logout" method="post">
 
              <button>Logout</button>
        </form>
        
	</body>
</html>