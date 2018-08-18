<%--
  Created by IntelliJ IDEA.
  User: Jan
  Date: 2018/8/13
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>chat</title>
    <script src="../../../asserts/js/jquery-2.1.1.min.js">
    </script>

</head>
<body>
<p>${msg}</p>

<form action="chat" method="post">
    <input name="info" type="text">
    <input type="submit" value="submit">
</form>

</body>
</html>
