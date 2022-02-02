<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <div align="center">
 
  <h1>Now you can add the product details</h1>
  
  <form action="<%= request.getContextPath() %>/register" method="post">
  
   <table style="with: 80%">
   
    <tr>
     <td>Product Name</td>
     <td><input type="text" name="productName" /></td>
    </tr>
    <tr>
     <td>Product Quantity</td>
     <td><input type="text" name="productQuantity" /></td>
    </tr>
    <tr>
     <td>Product Bill</td>
     <td><input type="text" name="productBill" /></td>
    </tr>
    
   </table>
   
   <input type="submit" value="Submit" />
   
  </form>
 </div>
</body>
</html>