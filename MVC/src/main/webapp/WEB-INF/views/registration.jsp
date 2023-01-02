<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/spring-mvc/registration" method="post">
<input type="text" name="username"/>
<input type="text" name="password"/>
<input type="text" name="email">
<input type="submit" value="submit"/>
<c:forEach items="${todos}" var="todo">
${todo.desc}
${todo.targetDate }
${todo.done }
</c:forEach>
</form>

</body>
</html>