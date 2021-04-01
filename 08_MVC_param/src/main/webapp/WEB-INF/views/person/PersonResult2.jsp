<%@page import="com.spring.ex.Pbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
id1 : ${pbean.id }<br><!--  class name 의 첫 글자만 소문자로 변경되어 자동으로 setAttribute 됨 -->
id2 : ${requestScope.pbean.id }<br>
id3 : <%=((Pbean)request.getAttribute("pbean")).getId() %><br>
id4 : ${p.id }<br>
id5 : ${id }<br>
<hr>
pw1 : ${pbean.pw }<br>
pw2 : ${requestScope.pbean.pw }<br>
pw3 : <%=((Pbean)request.getAttribute("pbean")).getPw() %><br>
<hr>
name1 : ${pbean.name }<br><!--  class name 의 첫 글자만 소문자로 변경되어 자동으로 setAttribute 됨 -->
name2 : ${requestScope.pbean.name }<br>
name3 : <%=((Pbean)request.getAttribute("pbean")).getName() %><br>
<hr>
addr1 : ${pbean.addr }<br><!--  class name 의 첫 글자만 소문자로 변경되어 자동으로 setAttribute 됨 -->
addr2 : ${requestScope.pbean.addr }<br>
addr3 : <%=((Pbean)request.getAttribute("pbean")).getAddr() %><br>
</body>
</html>