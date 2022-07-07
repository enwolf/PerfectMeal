<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Forgot Password</title>
</head>
<body>

<p>Info</p>

<div>
	<form id="forgot-password-form" action="verify-email" method="post">
		<label>Input Code: </label>
		
        <input type="text" id="email-address" name="email-address" required>
		<input type="submit" class="formButton" value="Submit">
		<input type="text" id="empty" name="page" value="forgot-password.jsp" hidden=true>
	</form>
</div>

</body>
</html>