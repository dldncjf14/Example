<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
name1 : ${name }<br>
name2 : ${requestScope.name }<br>
name3 : ${param.name }<br>
name4 : <%=request.getParameter("name") %><br>
name5 : <%=request.getAttribute("name") %><br>
<hr>
pw1 : ${pw }<br>
pw2 : ${requestScope.pw }<br>
pw2 : <%=request.getAttribute("pw") %><br>
</body>
</html>