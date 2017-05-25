<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<a href = "user">Login</a>
<a href = "createAccount">| Create Account</a>
<a href = "/admin"> | Admin Login</a>
<h2>Product Information List </h2>
	
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
				
				
			</tr>
		</c:forEach>
	</table>
</body>
</html>