<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.algonquin.PerfectMeal.beans.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
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