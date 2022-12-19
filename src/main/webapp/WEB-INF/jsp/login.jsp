<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1>Login</h1>
<form action="/auth/login" method="post">
    <label for="email">First name:</label><br>
    <input type="email" name="email" id="email" required><br>
    <label for="password">First name:</label><br>
    <input type="password" name="password" id="password" required><br>
    <input type="submit" value="Log in">
</form>
<c:out value="${errorMessage}"/>