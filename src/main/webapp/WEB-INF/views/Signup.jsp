<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
   
  
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
	
		color: red
	
	}

</style>

</head>
<body>

<f:form action="signupdata" method="post" enctype="multipart/form-data" commandName="user">


	<table border="2">
	<tr>
	
	<td>First Name : </td>
	<td><f:input path="firstName"/><f:errors cssClass="error" path="firstName"></f:errors></td>
	
	</tr>
	<tr>
		<td>Last Name : </td>
		<td><f:input path="lastName"/><f:errors cssClass="error" path="lastName"></f:errors></td>
		
	</tr>
	<tr>
		<td>Password : </td>
		<td><f:input path="password"/><f:errors cssClass="error" path="password"></f:errors></td>
		
	</tr>
	<tr>
		<td>Re-Password : </td>
		<td><f:input path="repassword"/><f:errors cssClass="error" path="repassword"></f:errors></td>
		
	</tr>
	<tr>
		<td>Gender : </td>
		<td><f:radiobutton path="gender" value="Male"/>Male <f:radiobutton path="gender" value="Female"/>Female<f:errors cssClass="error" path="gender"></f:errors></td>
		
	</tr>
	<tr>
		<td>Hobbies : </td>
		<td><f:checkbox value="Reading" path="hobbies"/>Reading<f:checkbox value="Traveling" path="hobbies"/>Traveling<f:checkbox value="Writing" path="hobbies"/>Writing<f:errors cssClass="error" path="hobbies"></f:errors></td>
		
	</tr>
		
		<tr>
			<td>Upload profile picture</td>
			<td><input type="file" name="imgs"></td>
		
		</tr>
		
		
	<tr>
	
		<td colspan="2" align="center"><input type="submit" value="Signup">
		</td>
	</tr>
	
	</table>
	

	
	
	
</f:form>




</body>
</html>