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
           action="${pageContext.request.contextPath}/create">
    <form:label path="input1">Input1</form:label>
    <form:input path="input1" />
    <form:errors path="input1" />
    <br>
    <form:label path="input2">Input2</form:label>
    <form:input path="input2" />
    <form:errors path="input2" />
    <br>
    <input type="submit" name="confirm" value="Confirm" /> <!-- (1) -->
</form:form>
</body>
</html>
