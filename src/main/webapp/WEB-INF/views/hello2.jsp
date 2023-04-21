<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: AM 8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <button onclick="param1()">파라미터보내기</button>

</body>
<script>
    const param1 = () => {
      // location.href = "/hello-param1?name=최민호&age=28";
        const name = "최민호";
        const age = 28;
        location.href = "/hello-param1?name=" + name +"&age="+age;
    }
</script>
</html>
