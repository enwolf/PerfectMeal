<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.algonquin.PerfectMeal.servlets.RecipeServlet" %>
<%@page import="com.algonquin.PerfectMeal.beans.Recipe" %>
<%@page import="com.algonquin.PerfectMeal.beans.Recipe" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recipe Page</title>
</head>
<body>
<%
ArrayList<Recipe> recipes = (ArrayList) request.getAttribute("recipe");
Iterator<Recipe> iterator = recipes.iterator();
while (iterator.hasNext()) {
	Recipe recipe = iterator.next();
%>
<tr>
	<td><%=recipe.getId()%></td>
	<td><%=recipe.getName()%></td>
	<td><%=recipe.getDescription()%></td>
	<td><%=recipe.getCookTime()%></td>
	<td><%=recipe.getMealLink()%></td>
</tr>
<%} %>
</body>
</html>