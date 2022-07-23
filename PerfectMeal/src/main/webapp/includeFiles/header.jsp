<%@ page language="java" 
		contentType="text/html; charset=UTF-8"
    	pageEncoding="UTF-8"
%>

<%@page import="com.algonquin.PerfectMeal.beans.HeaderTextFactory" %>

<%
	String uri = request.getRequestURI();
	String pageName = uri.substring(uri.lastIndexOf("/")+1);
	HeaderTextFactory headerText = new HeaderTextFactory();
	
%>

<div id="banner">
	<img src="img/foodBanner.jpg" alt="food"  > 
	<div id="textOverly"><%= headerText.getHeaderText(pageName) %> </div>
</div>
