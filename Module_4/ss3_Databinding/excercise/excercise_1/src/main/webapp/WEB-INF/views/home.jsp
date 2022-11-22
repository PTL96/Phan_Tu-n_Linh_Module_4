<%--
  Created by IntelliJ IDEA.
  User: Tuan Linh
  Date: 11/22/2022
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>$Title$</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<form:form action="/save" method="post" modelAttribute="mailBox">
    <table>
        <tr>
            <td>
                <form:select path="languages" items="${languageList}"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:select path="pageSize" items="${pageList}"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:radiobutton path="spamFilter" value="1" label="True"/>
                <form:radiobutton path="spamFilter" value="0" label="False"/>
            </td>
        </tr>
        <tr>
            <td>
                <form:textarea path="signature"> </form:textarea>
            </td>
        </tr>
    </table>

</form:form>
</body>
</html>
