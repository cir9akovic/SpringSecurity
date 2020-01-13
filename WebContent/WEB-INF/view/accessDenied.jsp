<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Access Denied</title>
</head>
<body>
	<h1>Access Denied</h1>
	<h4>Please go back to HomePage</h4>
	<button onclick="window.location.href='${pageContext.request.contextPath}'">Homa Page</button>
</body>
</html>