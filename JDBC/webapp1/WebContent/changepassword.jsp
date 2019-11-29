<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class= "java.lang.String" scope="request"/>
<body>
<a href = "#">Home</a>
<a  style = "float:right" href = "./logout"> Logout </a>
<h4><%=msg %></h4>
	<fieldset align="center">
		<legend> change password</legend>
		<form action="./changepassword" method="post">


			<table align="center">
				<tr>
					<td>New password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>confirm password:</td>
					<td><input type="password" name="confirmpassword"></td>
				</tr>
				<tr>
					<td><input type="reset" value="Reset"></td>
					<td><input type="submit" value="change password"></td>
				</tr>
			</table>
</body>
</html>