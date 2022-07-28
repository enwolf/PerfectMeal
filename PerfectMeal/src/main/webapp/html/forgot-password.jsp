<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/includeFiles/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
	<title>Forgot Password</title>
</head>
<body>
      	
<!--Navigation and Header Starts -->
<jsp:include page="/includeFiles/newNavBar.jsp" />
	<div id="wrapper">
	
		<jsp:include page="/includeFiles/header.jsp" />
		<!--Navigation and Header END-->
		<p>Input the email address associated with the account: </p>
	
		<div>
			<form id="forgot-password-email-form" action="forgot-password" method="post">
		        <input type="text" id="email-address" name="email-address" required>
				<input type="submit" class="formButton" value="Submit">
			</form>
		</div>
	</div>
</body>
</html>