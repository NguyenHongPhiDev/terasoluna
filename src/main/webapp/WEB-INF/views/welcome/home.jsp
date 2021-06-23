<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div id="wap">
<%--    <c:forEach var="product" items="${list}">--%>
<%--        <h4>${product.id}</h4>--%>
<%--    </c:forEach>--%>
    <h1>Đây là session: </h1>
    <h4>${session.getAttribute("user_id")}</h4>
    <div id="wrapper"
         style="border: 1px solid black; width:40% ;display: flex; justify-content: space-around">
        <h4>Id : ${list.get(0).id}</h4>
        <h4>Name : ${list.get(0).name}</h4>
        <h4>Code : ${list.get(0).code}</h4>
        <h4>Amount : ${list.get(0).amount}</h4>
        <button style="height: 50%;margin-top: 18px ">
            <a style="text-decoration: none; color: black;"
               href="Orders/${list.get(0).id}">Buy</a>
        </button>
    </div>
    <br/>
    <div id=""
         style="border: 1px solid black; width:40% ;display: flex; justify-content: space-around">
        <h4>Id : ${list.get(1).id}</h4>
        <h4>Name : ${list.get(1).name}</h4>
        <h4>Code : ${list.get(1).code}</h4>
        <h4>Amount : ${list.get(1).amount}</h4>
        <button style="height: 50%;margin-top: 18px">
            <a style="text-decoration: none; color: black;"
               href="">Buy</a>
        </button>
    </div>
</div>

</body>
</html>
