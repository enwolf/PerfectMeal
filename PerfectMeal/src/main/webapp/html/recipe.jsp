<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.algonquin.PerfectMeal.servlets.RecipeServlet" %>
<%@page import="com.algonquin.PerfectMeal.beans.Recipe" %>
<%@page import="com.algonquin.PerfectMeal.dao.RecipeDAO" %>
<%@page import="com.algonquin.PerfectMeal.beans.RecipeLog" %>
<%@ page import="java.util.*"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Recipe Page</title>
</head>
<body>
<h1>Recipes: </h1>
    <div>

        	<table id="recipe">
        		<tr>
        			<th>RecipeID</th>
        			<th>Name</th>
        			<th>Description</th>
        			<th>Cook time</th>
        			<th>Meal Link</th>
        		</tr>
        		<%

        	ArrayList<Recipe> recipes = (ArrayList) request.getAttribute("recipe"); 
        		Iterator<Recipe> iterator = recipes.iterator(); 
        		while
        			(iterator.hasNext()) { Recipe recipe =
        			iterator.next();
        		%>
        		<tr>
        			<td>
        				<%=recipe.getId()%>
        			</td>
        			<td>
        				<%=recipe.getName()%>
        			</td>
        			<td>
        				<%=recipe.getDescription()%>
        			</td>
        			<td>
        				<%=recipe.getCookTime()%>
        			</td>
        			<td>
        				<%=recipe.getMealLink()%>
        			</td>
        		</tr>

        		<%}%>
        	</table>

    </div>  
</body>
</html>