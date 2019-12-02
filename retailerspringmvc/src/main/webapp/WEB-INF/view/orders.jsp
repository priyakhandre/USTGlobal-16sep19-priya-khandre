<%@page import="com.ustglobal.retailerspringmvc.bean.OrderProduct"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">home</a>
<a href="./logout">Logout</a>

<table>
 <tr>
 <th>Name</th>
 <th>Price</th>
 <th>total price</th>
 </tr>
 <% List<OrderProduct> products =(List<OrderProduct>)request.getAttribute("orders"); %>
 <%for(OrderProduct op:products) {%>
 <tr>
 <td><%=op.getPname() %></td>
 <td><%=op.getPrice() %></td>
 <td><%=op.getTotal() %></td>
 </tr>
 <%} %>
</table>

</body>
</html>