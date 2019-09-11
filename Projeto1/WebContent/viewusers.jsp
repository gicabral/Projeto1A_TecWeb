<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
  h1{
    margin: 0;
    padding: 0 0 20px;
    text-align: center;
    font-size: 50px;
    color:#000;
    
  }  
  .botao{
  background: #1c8adb;
  color: #fff;
  padding: 14px 25px;
  height:50px;
  width:200px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  border-radius:7px;
}


  .botao:hover, .botao:active {
  cursor: pointer;
  background: #39dc79;
  color:#000;
}
  .botao2{
  background: #1c8adb;
  color: #fff;
  padding: 14px 25px;
  height:50px;
  width:200px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  border-radius:7px;
  margin-left:1065px;
}


  .botao2:hover, .botao:active {
  cursor: pointer;
  background: #39dc79;
  color:#000;
}
</style>
</head>
<body>  
  
<%@page import="br.edu.insper.DAO,br.edu.insper.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  
<h1>List of Questions</h1>  
  
<%  
List<User> list=DAO.getAllRecords();  
request.setAttribute("list",list);  
%>  

<div class="w3-container">

	<table border="1" class="w3-table-all w3-card-4">  
	<tr class = "w3-blue"><th>Id</th><th>Name</th><th>Question</th><th>Importance</th>  
	<th>Answer</th><th>Add answer</th><th>Edit</th><th>Delete</th></tr>  
	<c:forEach items="${list}" var="u">  
	<tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getQuestion()}</td>  
	<td>${u.getImportance()}</td><td>${u.getAnswer()}</td>
	<td><a href="answer.jsp?id=${u.getId()}">Answer</a></td>  
	<td><a href="editform.jsp?id=${u.getId()}">Edit</a></td>  
	<td><a href="deleteuser.jsp?id=${u.getId()}">Delete</a></td></tr>  
	</c:forEach>  
	</table>  
	<br/><a class = "botao" href="adduserform.jsp">Add New Question</a>  
	<a class = "botao2" href="index.html">Log out</a>  
	
</div>
  
</body>  
</html>  