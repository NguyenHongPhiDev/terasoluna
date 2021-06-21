<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Home</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>

<div id="wrapper" style="border: 1px solid black; width:40% ;display: flex; justify-content: space-around;padding-top: 15px">
    <h4>Id : ${list.get(0).id}</h4>
    <h4>Name : ${list.get(0).name}</h4>
    <h4>Code : ${list.get(0).code}</h4>
    <h4>Amount : ${list.get(0).amount}</h4>
    <button style="height: 50%; ">
        <a style="text-decoration: none; color: black;"
           href="">Buy</a>
    </button>
</div>
<br/>
<div id="" style="border: 1px solid black; width:40% ;display: flex; justify-content: space-around;padding-top: 15px">
    <h4>Id : ${list.get(1).id}</h4>
    <h4>Name : ${list.get(1).name}</h4>
    <h4>Code : ${list.get(1).code}</h4>
    <h4>Amount : ${list.get(1).amount}</h4>
    <button style="height: 50%;">
        <a style="text-decoration: none; color: black;"
           href="">Buy</a>
    </button>
</div>
</body>
</html>
