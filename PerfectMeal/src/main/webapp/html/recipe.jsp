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
<head>
    <script src="https://kit.fontawesome.com/f03a9c5f2e.js" crossorigin="anonymous"></script>
	<meta charset="ISO-8859-1">
	<!-- CSS style for Navigation and Header Starts -->
	<jsp:include page="/html/incluedCSSFile.jsp" />
	<!-- CSS style for Navigation and Header End -->
    <link rel="stylesheet" href="//use.fontawesome.com/releases/v5.0.7/css/all.css">    
    <link rel="stylesheet" type="text/css" href="css/main.css">
<meta charset="utf-8" />
<style>
      table, th, td {
        border: 1px solid #c0f7b2;
      }
      td {
        height: 80px;
        width: 160px;
        text-align: center;
        vertical-align: middle;
      }
      
#recipe {  	
				margin-left: auto;
  				margin-right: auto;
 }
      
.randomButton {
	background-color: #c0f7b2;
	border: 2px solid ##555555;
	border-radius: 12px;
	color: black;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 20px;
	font-weight: bold;
	margin: 4px 2px;
	cursor: pointer;
}
.randomButton:hover {background-color: #3e8e41}
.randomButton:active {
  background-color: #3e8e41;
  box-shadow: 0 5px #666;
  transform: translateY(4px);
}

div.recipeTable {
	text-align: center;
}

div.randomizeButton {
	text-align: center;
}


    </style>
<title>Recipe Page</title>
</head>
<body>
<!--Navigation and Header Starts -->
	<jsp:include page="/includeFiles/newNavBar.jsp" />
<!--Navigation and Header End -->

        <!--  DEFINE DAY OF WEEK -->
            <script type="text/javascript">
        var myDate = new Date();
        var myDay = myDate.getDay();
        
        // Array of days.
        var weekday = ['Sunday', 'Monday', 'Tuesday',
            'Wednesday', 'Thursday', 'Friday', 'Saturday'
        ];
        </script>
        <!--  DAY OF WEEK END -->

	<div id="wrapper">
			<jsp:include page="/includeFiles/header.jsp" />
    <div class="recipeTable">

        	<table id="recipe">
        		<tr>
        			<th>RecipeID</th>
        			<th>Name</th>
        			<th>Description</th>
        			<th>Cook Time</th>
        			<th>Meal Link</th>
        			<th>Day Of Week</th>
        		</tr>
        		<%
        	
        			DBConnection myDBConn = new DBConnection();
		myDBConn.getConnectionToDatabase();		
		RecipeDAO myDAO = new RecipeDAO();
		List<Recipe> recipeList = new ArrayList<Recipe>();
		recipeList = myDAO.randomRecipes();
		for (int i = 0; i < recipeList.size(); i++) {
//			if { i/2==0 
        		%>
        		<tr class="tableRow">		
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
        			<td>
        			<script type="text/javascript">       			
        			document.write(weekday[myDay]);
        			</script>
        			</td>
        		</tr>

        		<%}%>
        	</table>
        	    </div> 
        	    
        	<div class="randomizeButton">
        	<button class="randomButton" onClick="window.location.reload();">Randomize Recipes!</button>
			</div> 
</body>
</html>