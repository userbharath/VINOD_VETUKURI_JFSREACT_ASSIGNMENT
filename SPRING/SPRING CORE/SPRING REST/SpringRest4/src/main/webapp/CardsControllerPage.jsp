<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Card Number : </h1>

<form action="/login" method="POST">
		Name :      <input name="cNumber" type="text" /><br> 
		  <span style="color: red; "> ${msg}</span><br> 
		 <input type="submit" />
		<br>
		<br>
		
		<h1>${card}</h1>
	</form>
</body>
</html>