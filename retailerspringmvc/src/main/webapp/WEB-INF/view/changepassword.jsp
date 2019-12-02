
<%@page import="com.ustglobal.retailerspringmvc.bean.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%User user = (User)session.getAttribute("user"); %>

<form action="./changepassword" method="post" style="margin-left: 450px;margin-top: 100px;">
ID:
<br><input type="text" name="id" value="<%=user.getId()%>"><br>
Password:<br>
<input type="text" name="password">
<button type="submit">change</button>
</form>
</body>
</html>