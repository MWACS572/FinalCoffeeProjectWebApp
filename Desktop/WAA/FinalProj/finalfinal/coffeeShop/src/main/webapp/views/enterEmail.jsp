<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="user">Return to user Home Page</a>
	<form:form method="post" action="/updateUserPerson" modelAttribute="person">
		
		Email: 
		<form:input path="email"/>
		<br />
		<br />
		
		<input type="Submit" value ="Submit"/>
	</form:form>
</body>
</html>