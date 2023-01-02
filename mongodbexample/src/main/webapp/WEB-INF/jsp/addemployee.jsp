<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="/addemployee" method="post" modelAttribute="employee">
EmployeeId :<form:input path="id"/><br><br>
Employee Name:<form:input path="name"/><br><br>
Employee Department<form:input path="depart"/><br><br>
Employee Designation<form:input path="disgn"/><br><br>
Employee Salary<form:input path="salary"/><br><br>
<input type="submit" value="Add Employee"/>
</form:form>



</body>
</html>