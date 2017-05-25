<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Product</title>
</head>
<body>
	<h2>Create Product Form</h2>
	<a href="admin">Return to Amdin Home Page</a>
	<form:form method="post" action="/updateProduct" modelAttribute="command">
		Product Id: 
		<form:input path="id"/>
		<br />
		<br />
		Product Name: 
		<form:input path="productName"/>
		<br />
		<br />
		Description: 
		<form:input path="description"/>
		<br />
		<br />
		Price: 
		<form:input path="price"/>
		<br />
		<br />
		Product Type
		<form:input path="productType"/>
		<br />
		<br />
		<input type="Submit" value ="Submit"/>
	</form:form>
</body>
</html>