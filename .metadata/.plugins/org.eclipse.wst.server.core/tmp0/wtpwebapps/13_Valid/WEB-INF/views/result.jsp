<%@page import="com.spring.ex.BookBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
제목 : ${bb.title } <br>
작가 : ${bb.author } <br>
가격 : ${bb.price } <br>
출판사 : ${bb.publisher } <br>
${requestScope.bookBean.title }<br>
<%=((BookBean)request.getAttribute("bb")).getPrice() %><br>
${param.publisher }<br>
</body>
</html>