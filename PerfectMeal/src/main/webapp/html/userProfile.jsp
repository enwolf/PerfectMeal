<%
	String firstName = (String) session.getAttribute("firstName");
	String lastName  = (String) session.getAttribute("lastName");	
	String password  = (String) session.getAttribute("password");
%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile page</title>
</head>
<body>
	<h1>Current User Info</h1>
	<form>
		<label>FirstName:</label>
		<input type="text" id="fristName" name="firstName" value="<%= firstName  %>"> 
		<br>
		<br>
		<label>LastName:</label>
		<input id="lastName" name="lastName" value="<%= lastName %>">
		<br>
		<br>
		<label>Password:</label>
		<input id="password" name="password" value="<%= password %>">
	</form>
	<br>
	<br>
	
	
	<form action="userProfile" method="post">
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

