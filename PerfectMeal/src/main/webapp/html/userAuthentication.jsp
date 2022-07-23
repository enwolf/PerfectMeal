<%@ page language="java" 
		 contentType="text/html; charset=ISO-8859-1"
    	 pageEncoding="ISO-8859-1"%>    
    <%@ page import="java.util.*"%>
    <%@ page import="java.util.ArrayList"%>
    <%@ page import="com.algonquin.PerfectMeal.beans.User"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/html/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
<title>Verify Email</title>
</head>
<body>
<!--Navigation and Header Starts -->
        <jsp:include page="/includeFiles/inludeJSPFile.jsp" />
<!--Navigation and Header End -->

<% User user = (User) request.getAttribute("user"); %>

	<p>An email was sent to @email.com <br> Please check your email and enter the code into the dialog box below </p>

	<div>
		<form id="email-validation-form" action="verify-email" method="post">
			<label>Input Code: </label>
	        <input type="text" id="validationCode" name="validationCode" required>
			<input type="submit" class="formButton" value="Submit">
		</form>
	</div>
</body>
</html>