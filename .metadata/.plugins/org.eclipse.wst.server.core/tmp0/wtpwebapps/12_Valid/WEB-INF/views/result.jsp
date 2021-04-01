<%@page import="com.spring.ex.StudentBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
이름 : <%=request.getParameter("name") %><br>
비번 : ${param.pw }<br>
<hr>
이름 : <%=((StudentBean)request.getAttribute("sb")).getName() %><br>
비번 : ${sb.pw }<br>
<hr>
이름 : ${sb.name }<br>
비번 : ${requestScope.sb.pw }<br>
<hr>
</body>
</html>