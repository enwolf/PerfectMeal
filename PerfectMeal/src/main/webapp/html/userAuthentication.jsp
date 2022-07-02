<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*"%>
    <%@ page import="java.util.ArrayList"%>
    <%@ page import="com.algonquin.PerfectMeal.beans.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Verify Email</title>
</head>
<body>

<% User user = (User) request.getAttribute("user"); %>

<p>An email was sent to @email.com <br> Please check your email and enter the code into the dialog box below </p>

<div>
	<form id="email-validation-form" action=validateEmail method="post">
		<label>Input Code: </label>
        <input type="text" id="validationCode" name="validationCode" required>
		<input type="submit" class="formButton">Submit
	</form>
</div>
</body>
</html>