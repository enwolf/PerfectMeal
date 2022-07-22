<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script src="https://kit.fontawesome.com/f03a9c5f2e.js" crossorigin="anonymous"></script>
   	<meta charset="ISO-8859-1">
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/html/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
    <link rel="stylesheet" type="text/css" href="css/registration.css">
    <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.0.7/css/all.css"> 
  <title>Registration Form</title>
</head>
<body>
<!--Navigation and Header Starts -->
        <jsp:include page="/includeFiles/newNavBar.jsp" />
<!--Navigation and Header End -->
<div id="wrapper">
<jsp:include page="/includeFiles/header.jsp" />
    

    <div id="header">
        <header>
            <h1>Create your Perfect Meal Account</h1>
        </header>
        
    </div>
        <h2>Please enter your information below to create your account</h2>
    
    <div id="formData">
        <form action="signup" method="post" >
            <fieldset>
                <legend>Sign Up</legend>
                <table id="contactTable">
                    <tbody>
                        <tr>
                            <td><label>First Name: </label></td>
                            <td><input type="text" id="firstName" name="firstName" required></td>
                        </tr>
                        <tr>
                            <td><label>Last Name: </label></td>
                            <td><input type="text" id="lastName" name="lastName"required></td>                            
                        </tr>
                         <tr>
                            <td><label>Email Address: </label></td>
                            <td><input type="text" id="emailAddress" name="emailAddress" required></td>
                        </tr>
                        <tr>
                            <td><label>Password: </label></td>
                            <td><input type="password" id="password" name="password" required></td>
                            
                        </tr>
                        <tr>
                            <td><label>Confirm Password: </label></td>
                            <td><input type="password" id="confirmPassword" name="confirmPassword" required ></td>
                        </tr>
                        <tr>
                        	<td ><input type="submit" class="formButton" value="Submit"></td>
                        	<td><input type="reset" class="formButton" value="Reset"></td>
                        </tr>
                    </tbody>
                </table>
             </fieldset>
        </form>
        
    </div>
</div>



</div>
</body>
</html>
