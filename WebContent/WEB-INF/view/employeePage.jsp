<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Page</title>
</head>
<body>
	<h1>Welcome to Employee Page</h1>
	
	<h4>User: <security:authentication property="principal.username"/></h4>
	<h4>Role(s): <security:authentication property="principal.authorities"/></h4>
	
	<br></br>
	
	<button onclick="window.location.href='${pageContext.request.contextPath}'">Homa Page</button>
	
	<br></br>
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="LogOut"/>
	</form:form>
</body>
</html>