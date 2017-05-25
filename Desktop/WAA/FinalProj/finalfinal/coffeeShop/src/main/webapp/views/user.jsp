<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Page!</title>
</head>
<body><h1>User Home Page</h1>
<a href="/personDetail">Select Product</a>
<a href="/findAccountProfileByEmail">Find Account Profile By Email</a>
<a href="<c:url value="/logout" />"> Now logout </a>

</body>
</html>