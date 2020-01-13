<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- Add for Spring Security  -->    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!-- Add for error message -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Login Page</title>
<style>
	.failed {
		color:red;
	}
</style>
</head>
<body>
	<h3>My Custom Login Page</h3>
	
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
		
		<!-- Check for login error -->
		<c:if test="${param.error != null}">
				<i class="failed"> You entered invalid username or password! </i>
		</c:if>
		
		<p>
			User Name: <input type="text" name="username"/>
		</p>
		
		<p>
			Password: <input type="password" name="password"/>
		</p>
		
		<input type="submit" value="LogIn"/>
		
	</form:form>
</body>
</html>