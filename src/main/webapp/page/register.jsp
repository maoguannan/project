<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>springMVC</title>
 <%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<% String imgpath= request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+"/";
			%>
<!-- 在所有的链接前面加上动态获取的绝对全路径 -->
<base href="<%=basePath%>">
</head>
<body>
  <div align="center">
 		<form action="user/register.lovo" method="post" enctype="multipart/form-data">
         <span>用户：</span><input type="text" name="userName"><p/>
         <span>密码：</span><input type="text" name="passWord"><p/>
         <span>性别：</span><input type="text" name="sex"><p/>
         <span>年龄：</span><input type="text" name="age"><p/>
         <span>籍贯：</span><input type="text" name="address"><p/>
         <input type="submit" value="注册">
       </form>
  </div>
</body>
</html>