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
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
<script>
    $(document).ready(function (){
        $("#abc").value = localStorage.getItem('key');
        $("#abc1").value = localStorage.getItem('key1');
        $("#confirm").click(function (e){
            alert("123");
            window.localStorage.setItem('key',$("#abc").val() );
            window.localStorage.setItem('key1',$("#abc1").val() );
            console.log(localStorage.getItem('key'));
            e.preventDefault();
        });
    })
</script>
<body>
    <form:form modelAttribute="abcForm" action="${pageContext.request.contextPath}/testInput">
        <input type="text" id="abc" name="abc">
        <input type="text" id="abc1" name="abc1">
        <button id="confirm" name="confirm">confirm</button>
    </form:form>
</body>
</html>
