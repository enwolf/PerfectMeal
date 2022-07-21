<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/html/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
	<title>Error</title>
</head>
<body>
<!--Navigation and Header Starts -->
        <jsp:include page="/includeFiles/inludeJSPFile.jsp" />
<!--Navigation and Header End -->
<title>Logged out</title>
</head>
	<body>	
		<h1>Logout Success</h1>
		
		<h2>Welcome <%= request.getAttribute("firstName")%> <%= request.getAttribute("lastName") %> </h2>	
		
		<h2>Email: <%= request.getAttribute("userEmail") %></h2>
		
		<h2>Session value: <%= session.getAttribute("loginEmail") %></h2>
		
		<form action="userProfile" method="post">
 			<button>View User Profile</button>
        </form>
        
	</body>
</html>