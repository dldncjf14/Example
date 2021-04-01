<%@page import="com.spring.ex.Pbean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result3</title>
</head>
<body>
id1 : ${pbean.id } <br>
id2 : ${abcd.id }<br>
id3 : ${requestScope.abcd.id }<br>
id4 : <%=((Pbean)request.getAttribute("abcd")).getId() %><br>
<hr>
pw2 : ${abcd.pw }<br>
pw3 : ${requestScope.abcd.pw }<br>
pw4 : <%=((Pbean)request.getAttribute("abcd")).getPw() %><br>
<hr>
NAME2 : ${abcd.name }<br>
NAME3 : ${requestScope.abcd.name }<br>
NAME4 : <%=((Pbean)request.getAttribute("abcd")).getName() %><br>
Name5 : <%=request.getParameter("name") %><br>
<hr>
addr2 : ${abcd.addr }<br>
addr3 : ${requestScope.abcd.addr }<br>
addr4 : <%=((Pbean)request.getAttribute("abcd")).getAddr() %><br>
</body>
</html>