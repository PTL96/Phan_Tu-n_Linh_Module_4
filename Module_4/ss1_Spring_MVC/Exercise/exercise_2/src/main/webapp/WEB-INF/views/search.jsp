<%--
  Created by IntelliJ IDEA.
  User: Tuan Linh
  Date: 11/18/2022
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="search.jsp" method="post">
    <span>Nhập từ muốn tìm kiếm:
    </span>
    <input type="text" name="tiengAnh" value="${ketQua}">
    <input type="submit" name="Dịch" value="Translate">

<p>${ketQua}</p>
</form>


</body>
</html>
