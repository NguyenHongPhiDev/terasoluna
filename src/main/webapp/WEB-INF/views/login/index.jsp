<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<div style="width: 50%; margin: auto; margin-top:100px; ">
    <form:form modelAttribute="loginForm"
               action="${pageContext.request.contextPath}/login1/">
        <form:label path="username">UserName :</form:label>
        <form:input path="username"/>
<%--        <p style="color:red;">${errorUn}</p>--%>
        <form:label path="password">Password :</form:label>
        <form:input type="password" path="password"/>
<%--        <p style="color:red;" >${errorPw}</p>--%>
<%--        <p style="color:red;" >${wrong}</p>--%>
        <input style="margin-left: 100px" type="submit" name="confirm" value="Login"/>
    </form:form>
</div>
</body>
</html>
