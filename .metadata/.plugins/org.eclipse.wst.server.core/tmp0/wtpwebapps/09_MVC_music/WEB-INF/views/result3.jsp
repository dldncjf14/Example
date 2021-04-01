<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Title1 : <%=((MusicBean)request.getAttribute("mb")).getTitle() %> <br>
Singer1 : ${mb.singer }<br>
Price1 : ${requestScope.mb.price }<br>
</body>
</html>