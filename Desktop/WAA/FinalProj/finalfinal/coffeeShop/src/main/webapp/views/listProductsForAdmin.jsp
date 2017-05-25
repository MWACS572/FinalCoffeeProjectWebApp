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
<h2>Product Information List </h2>
	<a href="admin">Return to Amdin Home Page</a>
	<table width="40%" border="1" cellspacing="3" cellpadding="1">
		<thead>
		<tr>
			<th>ID</th>
			<th>Description</th>
			<th>Price</th>
			<th>Product Name</th>
			<th>Product Type</th>
		</tr>
		</thead>
		<c:forEach var="product" items="${productList}">
			<tr>
				<td style="text-align:center">${product.id}</td>
				<td style="text-align:center">${product.description}</td>
				<td style="text-align:center">${product.price}</td>
				<td style="text-align:center">${product.productName}</td>
				<td style="text-align:center">${product.productType}</td>
				<td><a href="updateProduct/${product.id}">Update Product</a></td>
				<td><a href="deleteProduct/${product.id}">Delete Product</a></td>
				
			</tr>
		</c:forEach>
		
	</table>
</body>
</html>