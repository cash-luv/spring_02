<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2023-04-21
  Time: PM 2:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.css">
    <script src="/resources/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<h2>hello5.jsp</h2>
<%-- items: 반복된 대상 , var: 반복변수--%>
<%-- for(StudnetDTO s: studentList)--%>
<table class="table table-dark table-hover" >
    <tr>
        <th>id</th>
        <th>이름</th>
        <th>학번</th>
    </tr>
    <tr>
        <c:forEach items="${studentList}" var="s">
        <td> id: ${s.id} </td>
        <td> 이름: ${s.studentName}</td>
        <td> 학번: ${s.studentNumber} </td>
    </tr>
    </c:forEach>
</table>
</body>
<script>

</script>
</html>
