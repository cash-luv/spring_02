<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: AM 8:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/hello1">hello1으로 이동</a>
<button onclick="fun1()">hello2로 이동</button>
</body>
<script>
    const fun1 = () =>{
    location.href ="/hello2"
    }
</script>
</html>
