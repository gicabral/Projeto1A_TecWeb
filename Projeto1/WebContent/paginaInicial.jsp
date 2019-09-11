<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  

<title>Lista de dúvidas</title>  

<style>
body{
    margin: 0;
    padding: 0;
    background: url(./degrade.jpg);
    background-size: cover;
    backgroud-position:center;
    font-family: sans-serif;
}
.botao {
  background: #1c8adb;
  color: #fff;
  padding: 14px 25px;
  height:30px;
  width:200px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  border-radius:10px;
}

.logout  {
  margin-right: 110px;
  margin-left:-150px;
  margin-bottom:-40px;
}

.botao:hover, .botao:active {
  cursor: pointer;
  background: #39dc79;
  color:#000;
}

.login-box{
    width: 800px;
    height:300px;
    background: rgba(0, 0, 0, 0.5);
    color: #fff;
    top: 50%;
    left: 50%;
    text-align:center;
    position: absolute;
    transform: translate(-50%,-50%);
    box-sizing: border-box;
    padding: 30px 30px;
       
}    
.back {
	width:40px;
	height:40px;
}
   
</style>
</head>  
<body> 
	<div class = "login-box"> 
		<h1>LIST OF QUESTIONS</h1>
		<a class="botao" href="adduserform.jsp">Add question</a> 
		<br> 
		<br>	
	    <a class="logout" href="index.html"><img src="back.png" class="back"></a> 
		<a class="botao" href="viewusers.jsp">See all questions</a>
		
		 
	</div>	

		
		
		
		
		 
  	
</body>  
</html>  