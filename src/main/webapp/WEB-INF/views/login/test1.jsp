<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19/8/2021
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="abcForm" action="${pageContext.request.contextPath}/testInput">
        <input type="text" name="abc" value="${abcForm.abc}">
        <input type="text" name="acb1" value="${abcForm.abc1}">
        <button name="redo">confirm</button>
    </form:form>
</body>
</html>
