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
    <title>Rejestracja</title>
</head>
<body>
Rejestracja<br>
<form:form modelAttribute="user" method="post">
    Imię: <form:input path="firstName"/><form:errors path="firstName"/><br>
    Nazwisko: <form:input path="lastName"/><form:errors path="lastName"/><br>
    Email: <form:input path="email"/><form:errors path="email"/><br>
    Hasło: <form:password path="password"/><form:errors path="password"/><br>
    <input type="submit" value="Rejestracja"/>


</form:form>

</body>
</html>
