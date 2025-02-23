<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User Management</title>
</head>
<body>
    <form action="${user != null ? 'update' : 'insert'}" method="post">
        <c:if test="${user != null}">
            <input type="hidden" name="id" value="${user.id}" />
        </c:if>
        Name: <input type="text" name="name" value="${user.name}" required /><br>
        Email: <input type="email" name="email" value="${user.email}" required /><br>
        Password: <input type="password" name="password" required /><br>
        Role: <input type="text" name="role" value="${user.role}" required /><br>
        <input type="submit" value="${user != null ? 'Update' : 'Add'} User" />
    </form>
</body>
</html>
