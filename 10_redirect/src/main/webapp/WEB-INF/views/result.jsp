<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
name1 : <%=request.getParameter("name") %><br>
name2 : <%=request.getAttribute("name")%> <br>
<hr>
Mname<br>
name3 : ${mname }<br>
name4ㅇ : ${param.mname }<br>
name5 : ${requestScope.mname }<br>
name6ㅇ : <%=request.getParameter("mname") %><br>
name7 : <%=request.getAttribute("mname") %><br>
<hr>
mapname : ${redmap.hname }<br>
</body>
</html>