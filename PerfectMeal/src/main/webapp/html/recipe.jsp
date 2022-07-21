<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.algonquin.PerfectMeal.servlets.RecipeServlet" %>
<%@page import="com.algonquin.PerfectMeal.beans.Recipe" %>
<%@page import="com.algonquin.PerfectMeal.dao.RecipeDAO" %>
<%@page import="com.algonquin.PerfectMeal.dao.DBConnection" %>
<%@ page import="java.util.*"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en" xmlns="http://www.w3.org/1999/xhtml">
<html>
<head>
    <script src="https://kit.fontawesome.com/f03a9c5f2e.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" type="text/css" href="css/navBar.css">
    <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.0.7/css/all.css">    
    <link rel="stylesheet" type="text/css" href="css/main.css">
<meta charset="utf-8" />
    <style>
      table,
      table td {
        border: 1px solid #cccccc;
      }
      td {
        height: 80px;
        width: 160px;
        text-align: center;
        vertical-align: middle;
      }
    </style>
<title>Recipe Page</title>
</head>
<body>
<!--         Navigation Bar -->
        <jsp:include page="/html/nav.jsp" />
        <!-- Navigation Bar End-->
        
                <div id="wrapper">
            <div id="banner">
                <img src="img/foodBanner.jpg" alt="food"  > 
            <div id="textOverly">Start Planning!</div>
        </div>
<h1>Recipes: </h1>
    <div>

        	<table id="recipe">
        		<tr>
        			<th>RecipeID</th>
        			<th>Name</th>
        			<th>Description</th>
        			<th>Cook Time</th>
        			<th>Meal Link</th>
        		</tr>
        		<%
        	
        			DBConnection myDBConn = new DBConnection();
		myDBConn.getConnectionToDatabase();		
		RecipeDAO myDAO = new RecipeDAO();
		List<Recipe> recipeList = new ArrayList<Recipe>();
		recipeList = myDAO.allLogs();
		for (int i = 0; i < recipeList.size(); i++) {
        		%>
        		<tr>
        			<td>
        				<%=recipeList.get(i).getId()%>
        			</td>
        			<td>
        				<%=recipeList.get(i).getName()%>
        			</td>
        			<td>
        				<%=recipeList.get(i).getDescription()%>
        			</td>
        			<td>
        				<%=recipeList.get(i).getCookTime()%>
        			</td>
        			<td>
        				<%=recipeList.get(i).getMealLink()%>
        			</td>
        		</tr>

        		<%}%>
        	</table>

    </div>  
</body>
</html>