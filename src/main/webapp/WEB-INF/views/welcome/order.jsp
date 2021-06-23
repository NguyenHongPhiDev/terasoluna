<html>
<head>
    <title>Order</title>
</head>
<body>
<div>
    <form:form action="${pageContext.request.contextPath}/Orders/${order.id}">
        <h4>Userid :${session.getAttribute("user_id")}</h4>
        <h4>Product_id : ${order.id}</h4>
        <h4>Name : ${order.name}</h4>
        <h4>Code : ${order.code}</h4>
        <h4>Amount : ${order.amount}</h4>
        <input style="margin-left: 100px" type="submit" name="add" value="add"/>
    </form:form>
</div>
<%--<div id="wrapper"--%>
<%--     style="border: 1px solid black; width:40% ;display: flex; justify-content: space-around;padding-top: 15px">--%>
<%--    <h4>Id : ${order.id}</h4>--%>
<%--    <h4>Name : ${order.name}</h4>--%>
<%--    <h4>Code : ${order.code}</h4>--%>
<%--    <h4>Amount : ${order.amount}</h4>--%>

<%--    <button style="height: 50%; margin-top: 20px ">--%>
<%--        <a style="text-decoration: none; color: black;"--%>
<%--           href="">Add</a>--%>
<%--    </button>--%>
<%--</div>--%>
</body>
</html>
