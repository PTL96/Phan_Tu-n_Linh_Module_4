<%--
  Created by IntelliJ IDEA.
  User: Tuan Linh
  Date: 11/21/2022
  Time: 2:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <input type="checkbox" name="spice" value="Lettuce">Lettuce
    <input type="checkbox" name="spice" value="Tomato">Tomato
    <input type="checkbox" name="spice" value="Mustard">Mustard
    <input type="checkbox" name="spice" value="Sprouts">Sprouts<br>
    <input type="submit" value="Save">
</form>

</body>
</html>
