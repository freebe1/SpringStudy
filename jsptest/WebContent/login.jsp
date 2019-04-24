<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="user" class="jsptest.User"></jsp:useBean>
<jsp:setProperty property="*" name="user"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Login</title>
</head>
<body>
<br>
	<%=user.isOK() %>
	err	
</body>
</html>