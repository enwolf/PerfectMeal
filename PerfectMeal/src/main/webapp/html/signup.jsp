<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">

    <script src="https://kit.fontawesome.com/f03a9c5f2e.js" crossorigin="anonymous"></script>

    <link rel="stylesheet" type="text/css" href="css/navBar.css">
    <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.0.7/css/all.css">    
    <link rel="stylesheet" type="text/css" href="css/main.css">

	<title>Sign Up: Perfect Meal</title>

</head>
<body>
<form action="signup" method="post">
    <div class="container">
      <h1>Sign Up</h1>
      <p>Please fill in this form to create an account.</p>
      <hr>
      <label for="email"><b>Email</b></label>
      <input type="text" placeholder="Type your email address" name="email" required>

      <label for="password"><b>Password</b></label>
      <input type="password" placeholder="Type a unique password" name="password" required>

      <label for="password-repeat"><b>Repeat Password</b></label>
      <input type="password" placeholder="Repeat your Password" name="password-repeat" required>

        <button type="submit" class="signupbtn">Sign Up</button>
      </div>
  </form>
</body>
</html>