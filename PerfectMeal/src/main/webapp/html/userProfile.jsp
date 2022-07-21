<%
	
	
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
<title>User Profile page</title>
</head>
<body>
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
</body>
</html>

