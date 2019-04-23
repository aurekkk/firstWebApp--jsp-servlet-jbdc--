<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Aurek
  Date: 4/22/2019
  Time: 10:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>WebApp</title>
  </head>
  <body>
  <h1>Hello World</h1>
  <p>This is my first JSP page.</p>

  <%
    Date date = new Date();
    out.print("<h2>" + date.toString() + "</h2>");
  %>

  </body>
</html>
