<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script content="text/javascript;charset=UTF-8">

</script>
</head>
<body>
<form action="${pageContext.request.contextPath }/servlet/LoginServlet" method="post">
UserName: 
<input type="text" name="username"/>
<br/>
PassWord:
<input type="text" name="password"/>
<br/>
<select name="type">
    <option value="1">普通用户</option>
    <option value="2">管理员</option>
</select>
<br/>
<input type="submit">
</form>
</body>
</html>