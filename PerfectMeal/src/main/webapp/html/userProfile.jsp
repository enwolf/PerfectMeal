<%

	//	Passes HTML and new values as strings on 
	//	updated by user requests.
	//  HTML is loaded into updateMessage
	//  The rest of the variables are updated passed values from the
	//  Seassion object
		
	String updateMessage = "<h2> Update Sucessful! <h2>";
	String firstName = (String) session.getAttribute("firstName");
	String lastName  = (String) session.getAttribute("lastName");	
	String password  = (String) session.getAttribute("password");
	String email = (String) session.getAttribute("loginEmail");
	int isUpdated = 0;
	
	if(session.getAttribute("isUpdated")!= null){	
		isUpdated = (int) session.getAttribute("isUpdated");
		
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/includeFiles/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
	<title>User Profile</title>
</head>
<body>
      	
<!--Navigation and Header Starts -->
<jsp:include page="/includeFiles/newNavBar.jsp" />
	<div id="wrapper">
	
		<jsp:include page="/includeFiles/header.jsp" />
		<!--Navigation and Header END-->
		<h1>Current User Info</h1>
		<%
			if(isUpdated == 1)
				out.println(updateMessage);		
		%>
		<form action="update" method="post">
			<label>FirstName:</label>
			<input type="text" id="fristName" name="firstName" value="<%= firstName %>"> 
			<br>
			<br>
			<label>LastName:</label>
			<input id="lastName" name="lastName" value="<%= lastName %>">
			<br>
			<br>
			<label>Password:</label>
			<input id="password" name="password" value="<%= password %>">
			<br>
			<br>
			<button>Update</button>
		</form>
		<br>
		<br>
		<form action="delete" method="post">
	 	   <button>Delete User</button>
	    </form>
	    <br>
	    <br>
	    <form action="logout" method="post">
	 	   <button>Logout</button>
	    </form>
	</div>
</body>
</html>

