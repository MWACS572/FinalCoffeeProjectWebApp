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
<h2>Create Product Form</h2>
	<a href="admin">Return to Amdin Home Page</a>
	<form:form method="post" action="/updatePerson" modelAttribute="person">
		Person Id: 
		<form:input path="id"/>
		<br />
		<br />
		First Name: 
		<form:input path="firstName"/>
		<br />
		<br />
		Last Name: 
		<form:input path="lastName"/>
		<br />
		<br />
		Email: 
		<form:input path="email"/>
		<br />
		<br />
		
		Phone Number:
		<form:input path="phone"/>
		<br />
		<br />
		City
		<form:input path="address.city"/>
		<br />
		<br />
		State
		<form:input path="address.state"/>
		<br />
		<br />
		Country
		<form:input path="address.country"/>
		<br />
		<br />
		Zipcode
		<form:input path="address.zipcode"/>
		<br />
		<br />
		<input type="Submit" value ="Submit"/>
	</form:form>
</body>
</html>