<%--
  Created by IntelliJ IDEA.
  Project name(项目名称)：Spring_MVC_data_verification
  File name(文件名): addUser
  Author(作者）: mao
  Author QQ：1296193245
  GitHub：https://github.com/maomao124/
  Date(创建日期)： 2022/3/10
  Time(创建时间)： 20:27
  Description(描述)： 无
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/validate" method="post">
    用户id：<input type="text" name="id"/>
    <br>
    用户名：<input type="text" name="name"/>
    <br>
    邮箱：<input type="text" name="email"/>
    <br>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
