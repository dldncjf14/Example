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
id : <%=request.getParameter("id") %> <br>
id : ${param.id }<br>
pw : ${param.pw }<br>
name : ${param.name }<br>
addr : <%=request.getParameter("addr") %><br>
<hr>
id2 : <%=request.getAttribute("id") %><br>
id3 : ${id }<br>
id4 : ${per.id }<br>
id5 : ${requestScope.per.id }<br>
id6 : <%=request.getAttribute("per") %><br>
id7 : <%=((Pbean)request.getAttribute("per")).getId() %><br>

pw1 : ${per.pw }<br>
pw2 : ${requestScope.per.pw }<br>
pw3 : <%=((Pbean)request.getAttribute("per")).getPw() %><br>

name1 : ${per.name }<br>
name2 : ${requestScope.per.name }<br>
name3 : <%=((Pbean)request.getAttribute("per")).getName() %><br>

addr1 : ${per.addr }<br>
addr2 : ${requestScope.per.addr }<br>
addr3 : <%=((Pbean)request.getAttribute("per")).getAddr() %><br>
</body>
</html>