<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
<form method="POST" action="/login.jsp">
    <div class="mb-3">
        <label class="form-label">Username</label>
        <input type="text" name="username" placeholder="Username">
    </div>
    <div class="mb-3">
        <label class="form-label">Password</label>
        <input type="password" name="password" placeholder="Password">
    </div>
    <button type="submit" class="btn btn-primary">Submit</button>
</form>

<%--<h1>${param}</h1>--%>
<%--<h1>${param.username}</h1>--%>
<%--<h1>${param.password}</h1>--%>

<c:choose>
    <c:when test='${param.username.equals("admin") && param.password.equals("password")}'>
        <%--    This code will run the condition exlauated if true    --%>
        <%response.sendRedirect("/profile.jsp");%>
    </c:when>
    <c:otherwise>
        <c:if test="${param.username != null && param.password != null}">
            <%response.sendRedirect("/login.jsp");%>
        </c:if>
    </c:otherwise>
</c:choose>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
        crossorigin="anonymous"></script>
</body>
</html>
