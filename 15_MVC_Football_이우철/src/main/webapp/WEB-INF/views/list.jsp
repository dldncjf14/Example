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
<form>
<table border="1">
	<tr>
		<td>번호</td>
		<td>아이디</td>
		<td>패스워드</td>
		<td>우승예상</td>
		<td>16강 예상</td>
	</tr>
	<c:forEach var="dto" items="${list }">
		<tr>
			<td>${dto.num }</td>
			<td><a href="content?num=${dto.num }">${dto.id }</a></td>
			<td>${dto.pw }</td>
			<td>${dto.win }</td>
			<td>${dto.round16 }</td>
	</tr>
	</c:forEach>
	<tr>
		<td colspan="5">
		<a href="javascript:history.go(-1)">돌아가기</a>
		<a href="form">삽입</a>
		</td>
	</tr>
</table>
</form>
</body>
</html>