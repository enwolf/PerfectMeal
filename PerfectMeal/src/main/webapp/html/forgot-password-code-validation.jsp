<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.algonquin.PerfectMeal.beans.User"%>
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
<title>Forgot Password</title>
</head>
<body>

<% User user = (User) session.getAttribute("user");%>

<p>Input the code you received at <%=user.getEmail()%>: </p>

<div>
	<form id="validate-forgot-password" action="update-password" method="get">
        <input type="text" id="validation-code" name="validation-code" required>
		<input type="submit" class="formButton" value="Submit">
	</form>
</div>

</body>
</html>