<%--
  Created by IntelliJ IDEA.
  User: 93163
  Date: 2018/08/20
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>上传文件测试</h2>
<form name="form1" action="${pageContext.request.contextPath}/manage/product/upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="上传"/>
</form>
<h2>富文本上传测试</h2>
<form name="form2" action="${pageContext.request.contextPath}/manage/product/richtext_img_upload.do" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/>
    <input type="submit" value="富文本图片上传"/>
</form>
</body>
</html>
