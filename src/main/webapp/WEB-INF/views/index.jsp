<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: robert
  Date: 12.04.19
  Time: 12:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tweeter = strona główna</title>
</head>
<body>
    <c:choose>
        <c:when test="${empty userId}">
            <button onclick="javascript:document.location.href='/user/login'">Logowanie</button>
            <button onclick="javascript:document.location.href='/user/register'">Rejestracja</button>
        </c:when>
        <c:otherwise>
            <button onclick="javascript:document.location.href='/user/logout'">Wyloguj</button>

        </c:otherwise>
    </c:choose>



</body>
</html>
