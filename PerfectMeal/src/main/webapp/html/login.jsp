<%@ page language="java" 
		 contentType="text/html; charset=ISO-8859-1"
     	 pageEncoding="ISO-8859-1"%>
<%@ page import= "javax.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- CSS style for Navigation and Header Starts -->
		<jsp:include page="/html/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
<title>Login Page</title>
</head>
	<body>
	<!--Navigation and Header Starts -->
        <jsp:include page="/includeFiles/inludeJSPFile.jsp" />
	<!--Navigation and Header End -->
		<h1>You have logged in!</h1>
		<h2>Name: <%= request.getAttribute("firstName")%> <%= request.getAttribute("lastName") %> </h2>	
		<h2>Email: <%= request.getAttribute("userEmail") %></h2>
		<h2>Session value: <%= session.getAttribute("loginEmail") %></h2>

        <form action="userProfile" method="post">
 		   <button>View User Profile</button>
        </form>

		<br>	

		<form action="logout" method="post">
 
              <button>Logout</button>
        </form>
        
	</body>
</html>