<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<td>First Name : </td>
	<td>${user.firstName}</td>
</tr>
<tr>
	<td>Last Name : </td>
	<td>${user.lastName}</td>
</tr>
<tr>
	<td>Password : </td>
	<td>${user.password}</td>
</tr>
<tr>
	<td>Re-Password : </td>
	<td>${user.repassword}</td>
</tr>
<tr>
	<td>Gender : </td>
	<td>${user.gender}</td>
</tr>
<tr>
	<td>Hobbies : </td>
	<td>${user.hobbies}</td>
</tr>

</table>
</body>
</html>