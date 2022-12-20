<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ page
contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Users</title>
  </head>
  <style>
    table,
    th,
    td {
      border: 1px solid black;
    }
  </style>

  <body>
    <h1>Users</h1>
    <table>
      <td>name</td>
      <td>email</td>
      <c:forEach items="${users}" var="user">
        <tr>
          <td>${user.name}</td>
          <td>${user.email}</td>
        </tr>
      </c:forEach>
    </table>
    <a href="../main">Main</a>
  </body>
</html>
