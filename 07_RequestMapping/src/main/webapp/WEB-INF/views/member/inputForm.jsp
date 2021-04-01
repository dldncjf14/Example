<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
member/inputForm.jsp<br>
ID : model<br>
id1 : ${id }<br>
id2 : ${requestScope.id }<br>
id3 : <%=request.getAttribute("id") %><br>
id4 : <%=request.getParameter("id") %><br>
id5 : ${param.id }<br>
<hr>
PW : Request<br>
pw1 : ${pw }<br>
pw2 : ${requestScope.pw }<br>
pw3 : <%=request.getAttribute("pw") %><br>
pw4 : <%=request.getParameter("pw") %><br>
pw5 : ${param.pw }<br>
</body>
</html>