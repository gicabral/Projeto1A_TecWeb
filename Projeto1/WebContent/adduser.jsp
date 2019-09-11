<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adicionar pergunta</title>
</head>
<body>

</body>
</html>

<%@page import="br.edu.insper.DAO"%>  
<jsp:useBean id="u" class="br.edu.insper.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
<%  
int i=DAO.save(u);  
if(i>0){  
response.sendRedirect("adduser-success.jsp");  
}else{  
response.sendRedirect("adduser-error.jsp");  
}  
%>  