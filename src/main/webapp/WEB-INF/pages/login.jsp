<%--
  Created by IntelliJ IDEA.
  User: 93163
  Date: 2018/08/20
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/manage/user/login.do" method="post">
    <label>用户名：
        <input type="text" name="username"/>
    </label>
    <label>密码：
        <input type="password" name="password"/>
    </label>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
