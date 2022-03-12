<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>
	<h1>Hello world!</h1>

	<P>The time on the server is ${serverTime}.</p>

	<form action="user" method="post">
		<input type="text" name="userName"><br> 
		<input type="submit" value="Login">
	</form>
	
	<form action="category" method="post">
		<input type="text" name="categoryName"><br> 
		<input type="submit" value="Login">
	</form>
	
	<form action="item" method="post">	
	-------------Item Details-------------- 
Name:	<input type="text" name="itemName"/><br/><br/>
Print Price:<input type="text" name="printPrice"/><br/><br/>
Purchase Price:<input type="text" name="purchasePrice"/><br/><br/>
Quantity:<input type="text" name="quantity"/><br/><br/>
Man.Date:<input type="text" name="mgnDate"/><br/><br/>
Exp.Date:<input type="text" name="expDate"/><br/><br/>
</form>
			<input type="submit" value="Login">
</body>
</html>