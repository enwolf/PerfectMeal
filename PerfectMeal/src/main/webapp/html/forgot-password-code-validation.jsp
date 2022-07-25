<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.algonquin.PerfectMeal.beans.User"%>
<!DOCTYPE html>
<html>
<head>
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/includeFiles/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
	<title>Reset Password</title>
</head>
<body>
      	
<!--Navigation and Header Starts -->
<jsp:include page="/includeFiles/newNavBar.jsp" />
	<div id="wrapper">
	
		<jsp:include page="/includeFiles/header.jsp" />
		<!--Navigation and Header END-->

		<% User user = (User) session.getAttribute("user");%>
		
		<p>Input the code you received at <%=user.getEmail()%>: </p>
		
		<div>
			<form id="validate-forgot-password" action="update-password" method="get">
		        <input type="text" id="validation-code" name="validation-code" required>
				<input type="submit" class="formButton" value="Submit">
			</form>
		</div>
	</div>
</body>
</html>