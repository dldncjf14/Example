<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.err{
		font-size: 10pt;
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
<form:form method="post" action="form" commandName="bb">
	책제목 : <input type="text" name="title" value="${bb.title }"> <form:errors cssClass="err" path="title"></form:errors><br><br>
	저자 : <input type="text" name="author" value="${bb.author }"}> <form:errors cssClass="err" path="author"/><br><br>
	가격 : <input type="text" name="price" value="${bb.price }"> <form:errors cssClass="err" path="price"/><br><br>
	출판사 : <input type="text" name="publisher" value="${bb.publisher }"> <form:errors cssClass="err" path="publisher"/><br><br>
	
	<input type="submit" value="전송">
</form:form>
</body>
</html>