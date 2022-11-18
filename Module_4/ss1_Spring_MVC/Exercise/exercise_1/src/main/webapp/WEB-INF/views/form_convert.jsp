<%--
  Created by IntelliJ IDEA.
  User: Tuan Linh
  Date: 11/18/2022
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3 style="text-align: center">Chuyển Đổi Tiền Tệ</h3>
<form action="/result" method="post" style="text-align: center; border: 1px">
<span>Nhập USD:</span>
<input type="text" name="usd" value="${usd}" placeholder="Nhập USD" style="text-align: center"><br><br>
<span>Nhập tỉ giá:</span>
<input type="text" name="rate" value="${rate}" placeholder="Nhập tỉ giá" style="text-align: center"><br>
    <h4>${result}VNĐ</h4>

    <input type="submit" name="result" value="Quy đổi">
</form>
</body>
</html>
