<%@page import="com.ustglobal.retailerspringmvc.bean.Product"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./search" method="post" style="margin-left: 450px;margin-top: 100px;">
<input type="text" name="pname" placeholder="enter product name">
<button type="submit" style="color: blue;">search</button>
</form>

<%Product product =(Product)session.getAttribute("product"); %>
<%if(product!=null){ %>
<table>
<tr>
<th>PID</th>
<th>Name</th>
<th>Price</th>
<th>Buy</th>
</tr>
<tr>
<td><%=product.getPid() %></td>
<td><%=product.getPname() %></td>
<td><%=product.getPrice() %></td>
<td><a href="./buy">buy</a></td>
</tr>
</table>

<%} %>
</body>
</html>