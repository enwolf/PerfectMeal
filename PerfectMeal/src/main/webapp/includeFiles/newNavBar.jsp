<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

        
<div class="navBarContainer">    
<!-- Nav Bar -->
      <div class="navbar">
        <!--Drop down menu contatiner-->
        <div class="logoHolder ">
            <button class="logoButton"><a href="index.jsp">Perfect Meal</a></button>
            <!--Drop down menu would go here content-->
        </div>
        <div class="buttonHolder active">
            <button class="linkButton"><a class="anchorHover" href="index.jsp"><i class="fa fa-home"></i> Home</a></button>
            <!--Drop down menu would go here content-->
        </div>
        <!--Drop down menu contatiner-->
        <div class="buttonHolder">
            <button class="linkButton"> <a class="anchorHover" href="recipes"><i class="fa fa-calendar" aria-hidden="true"></i> Meal Planner</a> </button>
        </div>
        <div class="buttonHolder">
            <button class="linkButton"><a class="anchorHover" href="#"><i class="fa fa-envelope"></i> Contact Us</a></button>
        </div>

        <div class="buttonHolder">
            <button class="linkButton"><a class="anchorHover" href="#"><i class="fa fa-info-circle"></i> About</a></button>
        </div>

		<div id="sideNavBar">
			<nav class="topnav">
				<div class="search-container">
					<form action="login" method="post">
						<input type="text" placeholder="email.." name="email" required>
						<input type="text" placeholder="password.." name="password" required>
						<button id="loginBtn" type="submit">Login</button>
					</form>
				</div>
			</nav>
			<nav class="topnav">
			  <div class="search-container">
					<div id="signUp">
						<form action="forgot-password" method="get" >
							<button class="noStyleBtn" type="submit">Forgot Password?</button>
						</form>
					</div> 			    
					<div id="forgot">
					    <form action="signup" method="get">
					      <button class="noStyleBtn" type="submit">Don't have an account? | Sign-Up Now</button>
					    </form>
					</div>
			  </div>
			</nav>
		</div>
	</div>	
</div>
<!-- Nav Bar ends-->    