<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 6/21/2021
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Abc Create Form</h1>
<form:form modelAttribute="abcForm"
           action="${pageContext.request.contextPath}/abc/create">
    <form:label path="input1">Input1</form:label>
    ${f:h(abcForm.input1)}
    <form:hidden path="input1" /> <!-- (1) -->
    <br>
    <form:label path="input2">Input2</form:label>
    ${f:h(abcForm.input2)}
    <form:hidden path="input2" /> <!-- (1) -->
    <br>
    <input type="submit" name="redo" value="Back" /> <!-- (2) -->
    <input type="submit" value="Create" /> <!-- (3) -->
</form:form>
</body>
</html>
