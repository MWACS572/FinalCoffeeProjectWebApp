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
<a href="<c:url value="/logout" />"> Now logout </a>
<h2>Person Information List </h2>
	<a href="admin">Return to Amdin Home Page</a>
	<table width="40%" border="1" cellspacing="3" cellpadding="1">
		<thead>
		<tr>
			<th>ID</th>
			<th>Order Date</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
			<th>City</th>
			<th>State</th>
			<th>Country</th>
			<th>Zip Code</th>
			
			
		</tr>
		</thead>
		<c:forEach var="order" items="${orderList}">
			<tr>
				<td style="text-align:center">${order.id}</td>
				<td style="text-align:center">${order.orderDate}</td>
				<td style="text-align:center">${order.person.firstName}</td>
				<td style="text-align:center">${order.person.lastName}</td>
				<td style="text-align:center">${order.person.email}</td> 
				<td style="text-align:center">${order.person.address.city}</td>
				<td style="text-align:center">${order.person.address.state}</td>
				<td style="text-align:center">${order.person.address.country}</td>
				<td style="text-align:center">${order.person.address.zipcode}</td>
				
<%-- 				<td><a href="updatePersonInfo/${person.id}">Update Person's Information</a></td> --%>
<%-- 				<td><a href="deletePersonInfo/${person.id}">Delete Person's Information</a></td> --%>
				
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>