<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Details Portal</title>
</head>
<body>
<div align="center">
<form action="" method="post">
<h1><font color='red'>Welcome to Product Details Portal</font></h1>
Enter product name: <input type="text" name="productName"/><br/><br/>
Enter product color: <input type="text" name="productColor"/><br/><br/>
Enter product price: <input type="text" name="productPrice"/><br/><br/>
<input type="submit" name="register" value="Register Details"/>
</form>
</div>

<%  if(request.getParameter("register")!=null){%>
    <jsp:useBean id="product" class="com.to.Product" scope="request"></jsp:useBean>
    <jsp:setProperty property="*" name="product"/>
    <jsp:forward page="RegisterServlet"></jsp:forward>
<%}%>
</body>
</html>