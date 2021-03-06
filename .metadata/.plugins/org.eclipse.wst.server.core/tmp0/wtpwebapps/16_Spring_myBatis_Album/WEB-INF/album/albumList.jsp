<%@page import="java.util.ArrayList"%>
<%@page import="org.springframework.web.servlet.ModelAndView"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="./../common/common.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AlbumList</title>
</head>
<body>
<h1>상품 리스트 화면(레코드갯수: )</h1>
<table border="1">
	<tr>
		<td colspan="7" align="right">
			<input type="button" value="추가">
		</td>
	</tr>
	<tr>
		<th>번호</th>
		<th>노래제목</th>
		<th>가수명</th>
		<th>가격</th>
		<th>출간일</th>
		<th>삭제</th>
		<th>수정</th>
	</tr>
	<c:forEach var="album" items="${albumLists }">
	<tr>
		<td>${album.num }</td>
		<td><c:out value="${album.title }"></c:out> </td>
		<td>${album.singer }</td>
		<td><fmt:formatNumber value="${album.price }" pattern="###,###" /></td>
		<td><fmt:formatDate value="${album.day }" pattern="yyyy-MM-dd" /> </td>
		<td><a>삭제</a></td>
		<td><input type="button" value="수정"></td>
	</tr>
	</c:forEach>
</table>
</body>
</html>