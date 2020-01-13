<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Security Home Page</title>
</head>
<body>
	<h1> Security Home Page</h1>
	
	
	
	<security:authorize access="hasRole('ADMIN')">
	<button onclick="window.location.href='admin'">Admin Page</button>
	</security:authorize>
		
	<br></br>
	
	<security:authorize access="hasAnyRole('ADMIN', 'MANAGER')">
	<button onclick="window.location.href='manager'">Manager Page</button>
	</security:authorize>
		
	<br></br>
	
	<security:authorize access="hasAnyRole('ADMIN', 'MANAGER', 'EMPLOYEE' )">
	<button onclick="window.location.href='employee'">Employee Page</button>
	</security:authorize>
		
	<br></br>
	
	<c:if test="${pageContext.request.userPrincipal.name == null}">
	<button onclick="window.location.href='showMyLoginPage'">LogIn</button>
	</c:if>
		
	<br></br>
	
	<c:if test="${pageContext.request.userPrincipal.name != null}">
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<input type="submit" value="LogOut"/>
	</form:form>
	</c:if>
</body>
</html>