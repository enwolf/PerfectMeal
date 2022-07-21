<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <script src="https://kit.fontawesome.com/f03a9c5f2e.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/navBar.css">
    <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.0.7/css/all.css">    
    <link rel="stylesheet" type="text/css" href="css/main.css">
<meta charset="ISO-8859-1">
<title>NavBar</title>
</head>
<body>
 <div id="topnav">
        <span id="cornerTitle">Perfect Meal</span>
          <!-- Centered links -->
          <div id="topnav-centered">
            <a href="index" class="active">Home <i class="fa fa-home"></i> </a>
            <a href="recipes">Meal Planner  <i class="fa fa-calendar" aria-hidden="true"></i> </a>
            <a href="#contact">Contact  <i class="fa fa-envelope"></i></a>
            <a href="#about">About <i class="fa fa-info-circle"></i></a>
          </div>

          <!-- Right-aligned login label and input -->
          <div id="topnav-login">
          <form action="login" method="post" display="inline-block">
              <label>Email:</label>
              <input type="text" id="email" name="email" value="" required/> 
              <label>Password:</label>
              <input type="text" id="password" name="password" value="" required/> 
              
              <button display="inline-block">Login</button>
           </form>
				
			<form action="forgot-password" method="get" display="inline-block">
				<span> | </span>
				<button type=submit>Forgot Password?</button>
            </form>
          </div>

        </div>
</body>
</html>