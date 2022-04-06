<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/23
  Time: 20:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <base href="${pageContext.request.contextPath}/">
    <title>hello 测试页</title>
    <link href="static/css/main.css" type="text/css" rel="stylesheet" />
    <script src="static/js/main.js" type="text/javascript"></script>
</head>
<body>
欢迎来到SpringMVC入门
<hr>
<input type="button" onclick="btn(this);" value="测试" />
<hr>
接收到数据为:${message}
</body>
</html>
