<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>

<p>Input the email address associated with the account: </p>

<div>
	<form id="forgot-password-email-form" action="forgot-password" method="post">
        <input type="text" id="email-address" name="email-address" required>
		<input type="submit" class="formButton" value="Submit">
	</form>
</div>




</body>
</html>