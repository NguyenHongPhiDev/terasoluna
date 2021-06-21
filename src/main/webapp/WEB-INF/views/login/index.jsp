<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 6/21/2021
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div style="width: 50%; margin: auto; margin-top:100px; ">
    <form:form modelAttribute="loginForm"
               action="${pageContext.request.contextPath}/login1">
        <form:label path="username">UserName :</form:label>
        <form:input path="username"/>
        <form:errors path="username"/>
        <br/>
        <br>
        <form:label path="password">Password :</form:label>
        <form:input path="password"/>
        <form:errors path="password"/>
        <br/>
        <br>
        <input style="margin-left: 100px" type="submit" name="confirm" value="Login"/>
    </form:form>
</div>
</body>
</html>
