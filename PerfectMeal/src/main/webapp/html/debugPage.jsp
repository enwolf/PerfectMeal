<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/includeFiles/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
	<title>Error</title>
</head>
<body>
      	
<!--Navigation and Header Starts -->
<jsp:include page="/includeFiles/newNavBar.jsp" />
	<div id="wrapper">
	
		<jsp:include page="/includeFiles/header.jsp" />
		<!--Navigation and Header END-->
<% 
	String errorMessage = (String) session.getAttribute("errorMessage");
%>
	<p><%=errorMessage%></p>
	</div>
</body>
</html>