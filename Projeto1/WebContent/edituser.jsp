<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@page import="br.edu.insper.DAO"%>  
<jsp:useBean id="u" class="br.edu.insper.User"></jsp:useBean>  

<jsp:setProperty property="*" name="u"/>  
<%  
int i=DAO.update(u);  
response.sendRedirect("viewusers.jsp");  
%>  
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

</body>
</html>