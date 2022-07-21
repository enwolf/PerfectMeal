<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/html/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
	<title>Error</title>
</head>
<body>
<!--Navigation and Header Starts -->
        <jsp:include page="/includeFiles/inludeJSPFile.jsp" />
<!--Navigation and Header End -->
<% 
	String errorMessage = (String) session.getAttribute("errorMessage");
%>
	<p><%=errorMessage%></p>

</body>
</html>