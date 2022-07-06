<!DOCTYPE html>

<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
    <script src="https://kit.fontawesome.com/f03a9c5f2e.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/navBar.css">
    <link rel="stylesheet" type="text/css" href="css/registration.css">
    <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.0.7/css/all.css"> 
  <title>Registration Form</title>
</head>
<body>


<!--	// % String userResponse = (String) (request.getAttribute("userMessage") == null ? "" : request.getAttribute("userMessage")); %> -->
        <!-- Navigation Bar -->
        <div id="topnav">
        <span id="cornerTitle">Perfect Meal</span>
          <!-- Centered links -->
          <div id="topnav-centered">
            <a href="index.html" class="active">Home <i class="fa fa-home"></i> </a>
            <a href="#mealPlanner">Meal Planner  <i class="fa fa-calendar" aria-hidden="true"></i> </a>
            <a href="#contact">Contact  <i class="fa fa-envelope"></i></a>
            <a href="#about">About <i class="fa fa-info-circle"></i></a>
          </div>

          <!-- Right-aligned login lable and input -->
          <div id="topnav-login">
              <lable>Username:<lable>
              <input type="text" /> 
              <lable>Password:<lable>
              <input type="text" /> 
              <button>Login</button>
               <span> | </span>
              <button>Forgot Password?</button>
              
          </div>

        </div>
        
        <!-- Navigation Bar End-->

<div id="wrapper">
    <div id="wrapper2"> <!-- wrapper2 is used to format the text overlaying the image -->
        <div id="banner">
            <img src="img/foodBanner.jpg" alt="food"  > 
        <div id="textOverly">Register Now!</div>
    </div>

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
