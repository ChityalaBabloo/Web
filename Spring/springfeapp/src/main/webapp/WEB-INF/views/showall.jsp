<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
	<thead>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Mail</th>
			<th>City</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="customer" items="${customers}">
			<tr>
				<td>${customer.id}</td>
				<td>${customer.cname}</td>
				<td>${customer.mailId}</td>
				<td>${customer.city}</td>
				<td><a href="update?id=${customer.id}">update</a></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<a href="add">Add customer</a><!-- add is not a file.It will go to controller.
So you should have respective file in views folder -->
</body>
</html>