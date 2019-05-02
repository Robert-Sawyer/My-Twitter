<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: robert
  Date: 12.04.19
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Logowanie</title>
</head>
<body>
Logowanie<br>
<form:form modelAttribute="user" method="post">

    Email: <form:input path="email"/><form:errors path="email"/><br>
    Hasło: <form:password path="password"/><form:errors path="password"/><br>
    <input type="submit" value="Zaloguj"/>


</form:form>

</body>
</html>
