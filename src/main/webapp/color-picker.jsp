<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
</head>
<body>
<form action="/pick-color" method="post">
    <label for="color">Whats your favorite color?</label>
    <input type="text" id="color" name="color">
    <input type="submit" value="Submit Color">
</form>


</body>
</html>
