<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="modify" method="post">
	<table border="1">
		<tr>
			<input type="hidden" name="num" value="${dto.num }">
			<td>아이디</td>
			<td><input type="text" name="id" value="${dto.id }" disabled="disabled"></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" value="${dto.name }"></td>
		</tr>
		<tr>
			<td>나이</td>
			<td><input type="text" name="age" value="${dto.age }"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="수정">
			<a href="list">목록보기</a>
			<a href="delete?num=${dto.num }">삭제</a></td>
		</tr>
	</table>
</form>
</body>
</html>