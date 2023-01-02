<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>yahooo from JSP</title>
</head>
<body>
<%
System.out.println(request.getParameter("name"));
java.util.Date date=new java.util.Date();
%>
<div>Current date is<%=date%></div>

<%-- My First JSP ${name}
password is ${password} --%>
<form action="/spring-mvc/login" method="post">
<p><font color="red">${errorMessage}</font></p>
Enter your name<input type="text" name="name"/>
Enter Password<input type="text" name="password"/>
<input type="submit"/>
</form>
</body>
</html>