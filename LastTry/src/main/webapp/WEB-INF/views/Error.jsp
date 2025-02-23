<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exception Page</title>
</head>
<body>
    <center>
        <h1>Error Occurred</h1>
        <h2><%= exception.getMessage() %></h2>
        <p><a href="index.jsp">Go Back to Home</a></p>
    </center>
</body>
</html>
