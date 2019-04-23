<%--
  Created by IntelliJ IDEA.
  User: Aurek
  Date: 4/21/2019
  Time: 3:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<h1>Welcome, please log in!</h1>

<form action="login" method="post">
    login-name: <input type="text" name="loginname" width="30"/><br>
    password: <input type="password" name="password" width="10"/><br>
    <input type="submit" value="Login">
</form>

<p style="color:red">${errorMessage}</p>

</body>
</html>
