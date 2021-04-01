<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>
<body>
name 1 :${param.name } <br>
name 2 :${name } <br>
name 3 :${requestScope.name } <br>
name 4 :<%=request.getParameter("name") %> <br>
name 5 :<%=request.getAttribute("name") %> <br>

<hr>

name 1 :${param.name2 } <br>
name 2 :${name2 } <br>
name 3 :${requestScope.name2 } <br>
name 4 :<%=request.getParameter("name2") %> <br>
name 5 :<%=request.getAttribute("name2") %> <br>

<hr>

name 1 :${param.name3 } <br>
name 2 :${name3 } <br>
name 3 :${requestScope.name3 } <br>
name 4 :<%=request.getParameter("name3") %> <br>
name 5 :<%=request.getAttribute("name3") %> <br>
</body>
</html>