<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ page
contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
  </head>
  <body>
    <h1>Login</h1>
    <form action="/auth/login" method="post">
      <label for="email">email</label><br />
      <input type="email" name="email" id="email" required /><br />
      <label for="password">password</label><br />
      <input type="password" name="password" id="password" required /><br />
      <input type="submit" value="Log in" />
    </form>
    <p style="color: red"><c:out value="${errorMessage}" /></p>
  </body>
</html>
