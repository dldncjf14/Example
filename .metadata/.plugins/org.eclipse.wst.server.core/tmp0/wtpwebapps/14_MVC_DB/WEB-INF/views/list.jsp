<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List</title>
</head>
<body>
<table border="1">
	<tr>
		<td>번호</td>
		<td>아이디</td>
		<td>이름</td>
		<td>나이</td>
	</tr>
	
	<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.num }</td>
			<td>${dto.id }</td>
			<td><a href="content_view?num=${dto.num }">${dto.name }</a></td>
			<td>${dto.age }</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="4">
			<a href="javascript:history.go(-1)">돌아가기</a>
			<a href="form">삽입</a>
		</td>
	</tr>
</table>
</body>
</html>