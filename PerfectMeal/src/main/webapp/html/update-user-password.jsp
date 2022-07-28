<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.algonquin.PerfectMeal.beans.User"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/includeFiles/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
	<title>Update Password</title>
</head>
<body>
      	
<!--Navigation and Header Starts -->
<jsp:include page="/includeFiles/newNavBar.jsp" />
	<div id="wrapper">
		
			<jsp:include page="/includeFiles/header.jsp" />
			<!--Navigation and Header END-->
	
		<% User user = (User) session.getAttribute("user");%>
		
		<p>Updating password for <%=user.getEmail()%></p>
		
		<div>
			<form id="forgot-password-email-form" action="update-password" method="post">
		        <label>New Password:</label>
		        <input type="text" id="password" name="password" required>
		        <label>Re-Type New Password:</label>
		        <input type="text" id="confirmPassword" name="confirmPassword" required>
				<input type="submit" class="formButton" value="Submit">
			</form>
		</div>
	</div>
</body>
</html>