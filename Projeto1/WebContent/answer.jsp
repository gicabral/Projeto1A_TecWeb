<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
<style type="text/css">
  <%@include file="./styleform.css" %>
.logout  {
  margin-right: 110px;
  margin-left:-250px;
  margin-bottom:-40px;
}  
</style>
</head>  
<body>  
<%@page import="br.edu.insper.*"%>  
  
<%  
String id=request.getParameter("id"); 
User u=DAO.getRecordById(Integer.parseInt(id));  
%>  

<div class = "login-box">
	<h1>Add answer</h1>  
	<form action="editAnswer.jsp" method="post">  
	<input type="hidden" name="id" value="<%=u.getId() %>"/> 
	<b>Answer:</b>  
	<input type="text" name="answer" value="<%= u.getAnswer()%>"/> 
	<input type="submit" value="Add Answer"/>
	<br>
	<a href="viewusers.jsp">Back</a><br/>  
	</form>  
</div>  
</body>  
</html>  
