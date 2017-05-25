<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Person Information</h2>
	<a href="user">Return to User Home Page</a>
	<table width="40%" border="1" cellspacing="3" cellpadding="1">
		<thead>
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>Phone Number</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
			<th>Zip Code</th>
			
		</tr>
		</thead>
		<c:forEach var="person" items="${person}">
			<tr>
				<td style="text-align:center">${person.id}</td>
				<td style="text-align:center">${person.firstName}</td>
				<td style="text-align:center">${person.lastName}</td>
				<td style="text-align:center">${person.email}</td>
				<td style="text-align:center">${person.phone}</td>
				<td style="text-align:center">${person.address.city}</td>
				<td style="text-align:center">${person.address.state}</td>
				<td style="text-align:center">${person.address.country}</td>
				<td style="text-align:center">${person.address.zipcode}</td>
				<td><a href="updatePersonInfo/${person.id}">Update Person's Information</a></td>
				
				
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>