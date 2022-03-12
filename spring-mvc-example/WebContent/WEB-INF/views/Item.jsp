<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body> -->
<html>  
<body>  
<form action="servlet/Register" method="post">  
-------------Item Details-------------- 
Name:	<input type="text" name="itemName"/><br/><br/>
Print Price:<input type="text" name="printPrice"/><br/><br/>
Purchase Price:<input type="text" name="purchasePrice"/><br/><br/>
Quantity:<input type="text" name="quantity"/><br/><br/>
Man.Date:<input type="text" name="mgnDate"/><br/><br/>
Exp.Date:<input type="text" name="expDate"/><br/><br/>

<!-- Country:  
<select name="userCountry">  
<option>India</option>  
<option>Pakistan</option>  
<option>other</option>  
</select>  
 -->  
<br/><br/>  
<input type="submit" value="register"/>  
  
</form>  
</body>  
</html>  