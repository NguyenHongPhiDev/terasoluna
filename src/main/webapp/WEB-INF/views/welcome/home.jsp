<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--    <c:forEach var="product" items="${session.id}">--%>
<%--        <h4>${product}</h4>--%>
<%--    </c:forEach>--%>
<html>
<head>
    <title>Home</title>
</head>
<body>
<div id="wap">
    <div id="wrapper"
         style="border: 1px solid black; width:40% ;display: flex; justify-content: space-around">
        <h4>Id : ${list.get(0).id}</h4>
        <h4>Name : ${list.get(0).name}</h4>
        <h4>Code : ${list.get(0).code}</h4>
        <h4>Amount : ${list.get(0).amount}</h4>
        <button style="height: 50%;margin-top: 18px ">
            <a style="text-decoration: none; color: black;"
               href="Orders">Buy</a>
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
               href="Orders">Buy</a>
        </button>
    </div>
</div>

</body>
</html>
