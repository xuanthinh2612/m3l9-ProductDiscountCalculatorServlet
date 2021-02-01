<%--
  Created by IntelliJ IDEA.
  User: xuant
  Date: 2/1/2021
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="/display-discount" method="get">
    <label style="size: 500px">Product Description: </label>
    <input type="text" name="description">
    <br>
    <br>
    <label style="size: 500px" >List Price: </label>
    <input type="text" name="price">
    <br>
    <br>
    <label style="size: 500px">Discount Percent: </label>
    <input type="text" name="discount">
    <input type="submit" id="submit" size="50" value="Calculate Discount">
</form>
</body>
</html>
