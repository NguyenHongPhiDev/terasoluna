<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% response.setStatus(HttpServletResponse.SC_BAD_REQUEST); %>
<html>
<head>
    <title>Title</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <script>
        // function view(){
        //     var reader = new FileReader();
        //     reader.onload = function (e) {
        //         document.getElementById("image").src = e.target.result;
        //     };
        //     reader.readAsDataURL(document.getElementById("file").files[0]);
        // }
        function view(){
            let img = document.getElementById("file");
            let input1 = document.getElementById("abc").value;
            let data = new FormData()
                data.append("img",img.files[0]);
            // $.ajax({
            //     url : 'http://localhost:8080/data1/upload',
            //     data: data,
            //     processData: false,
            //     dataType: 'multipart/form-data',
            //     method : 'POST',
            //     success : function (){
            //         alert("success");
            //     },
            //     error : function (){
            //         alert("fail");
            //     }
            // });
            var reader = new FileReader();
            reader.onload = function (e) {
                document.getElementById("image").src = e.target.result;
            };
            reader.readAsDataURL(document.getElementById("file").files[0]);
            $.ajax({
                url: 'http://localhost:8080/data1/upload',
                type: "POST",
                iframe: true,
                cache: false,
                contentType:false,
                processData:false,
                data: data,
                success : function(response) {
                    alert("succes")
                    console.log("success");
                },
                error: function(){
                    console.log("error");
                }
            });
            // var request = new XMLHttpRequest();
            // request.open("POST", "http://localhost:8080/data1/upload");
            // request.send(data);
        }
    </script>
<body>
<form:form modelAttribute="abcForm" id="update-form" name="update-form" enctype="multipart/form-data">
    <input type="text" id="abc" name="abc">
    <label></label>
    <br>
    <input type="text" id="abc1" name="abc1">
    <label></label>
    <img id="image" src="" alt="" multipart>
    <input type="file" onchange="view()" name="img" id="file">
</form:form>
<button id="update" onclick="update()">Update</button>
</body>
</html>
