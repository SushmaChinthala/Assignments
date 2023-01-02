<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<br><br>
<h1><a href="showAddPage">Add Employee</a></h1>
<h1>Employee List</h1>
<table border="1">

<tr>
<th>EID</th>
<th>NAME</th>
<th>DEPARTMENT</th>
<th>DESIGNATION</th>
<th>SALARY</th>
</tr>
<c:forEach var="e" items="${employeelist}">
<tr>
<td><a href="/${e.id}">${e.id}</a></td>
<td>${e.name}</td>
<td>${e.depart}</td>
<td>${e.disgn}</td>
<td>${e.salary}</td>
<td><a href="/showUpdatePage/${e.id}">Update</a></td>
<td><a href="/Delete/${e.id}">Delete</a></td>
</tr>
</c:forEach>
</table>
</body>
</html>