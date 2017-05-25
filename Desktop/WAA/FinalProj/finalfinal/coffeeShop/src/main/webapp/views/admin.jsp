<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Page!</title>
</head>
<body><h1>Welcome to Admin!</h1>

	<a href="createProduct">Create Product</a>
	<a href="listProduct">| List All Products</a>
	<a href="createPersons">| Create Person</a>
	<a href="listAllPersons">| List Person</a>
	<a href="listAllOrders">| List Order</a>

<a href="<c:url value="/logout" />"> Now logout </a>

</body>
</html>