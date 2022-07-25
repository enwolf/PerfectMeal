<%@ page language="java" 
		contentType="text/html; charset=ISO-8859-1"
    	pageEncoding="ISO-8859-1"
%>
    
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="utf-8" />
    <script src="https://kit.fontawesome.com/f03a9c5f2e.js" crossorigin="anonymous"></script>
    <!-- incluedCSSFileLinks.jsp hold links to common CSS styles sheets -->
	<jsp:include page="/includeFiles/incluedCSSFile.jsp" />
    <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.0.7/css/all.css">
    <link rel="stylesheet" type="text/css" href="css/main.css">
<title>Home Page</title>
</head>
<body>
<!--Navigation and Header Starts -->
        <jsp:include page="/includeFiles/newNavBar.jsp" />
<!--Navigation and Header End -->
		<div id="wrapper">
			<jsp:include page="/includeFiles/header.jsp" />
			<div id="welcomeCard">                
				<h1>Welcome to Perfect Meal!</h1> 
				<img src="img/pastaDish.png" alt="food"  > 
				<p>Curabitur fringilla molestie nibh at egestas. Praesent et mollis lorem. Duis sit amet ligula sit amet mi hendrerit rutrum ac ut nulla. Sed blandit neque tortor, ac congue orci ullamcorper eu. Duis et urna quis arcu interdum maximus. Suspendisse bibendum, velit eget blandit posuere, nulla quam rhoncus lacus, vel posuere lectus dolor quis magna. Cras eleifend eros ac lacus blandit, nec volutpat urna varius. Mauris ultricies arcu a luctus sagittis.d</p>
			</div>
			<div id="newUserCard">
				<div id="newUserHeader">
					<h1>Join Today </h1><br>
					<br>
			        <h2>Sign up Here!!</h2>
			     </div>
				<form action="signup" method="get">
				    <button id="newUserCallToAction" > Click Here - Join Now!</button>
				</form>
				<img id="newUserCardImage3"src="img/chickenDinner.jpg" alt="food"  >     
		        <img id="newUserCardImage2"src="img/salad.jpeg" alt="food"  > 
		        <img id="newUserCardImage"src="img/tomatoBasil.jpg" alt="food"  > 
			</div>
			<div id="contentCard">
				<h2>Delicious Meals</h2> 
				<img id="contentCardImage"src="img/ingredients.jpg" alt="food"  > 
				<p> Ut finibus urna dui, at suscipit justo sollicitudin ut. Sed sed odio urna. Praesent semper, nisl id tincidunt finibus, nunc est volutpat ligula, ut efficitur velit justo sed turpis. Nam eu auctor arcu. Proin maximus rutrum semper. Proin non mi vel ipsum imperdiet molestie. Phasellus elementum pharetra nibh, id tristique dui imperdiet sed. Quisque non tellus eu leo auctor eleifend et sit amet enim. Proin sed dolor venenatis, sagittis nunc a, congue dolor.</p>
				<p>In pellentesque leo felis, vel pulvinar elit bibendum id. Nam enim leo, ultricies vel est id, dictum consectetur leo. Sed imperdiet pulvinar erat sit amet posuere. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Suspendisse aliquet pharetra imperdiet. Quisque vitae tincidunt nunc. Fusce nibh eros, dignissim ut lectus a, porta imperdiet justo. Praesent consequat mi sagittis, porttitor tortor at, iaculis nisi. In feugiat dictum iaculis. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. </p>
			</div>
		</div>
	</body>
</html>