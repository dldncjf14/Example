<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@include file="./../common/common.jsp"%>

album\ albumList.jsp <br>

<h2>상품 리스트 화면</h2>

<table border="1" align="center">
	<tr>
		<td colspan="7" align="right">
			<input type="button" value="추가하기" onClick="">
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
			<td><c:out value="${album.title }"> </c:out></td>
			<td>${album.singer }</td>
			<td> <fmt:formatNumber value="${album.price}" pattern="#,###"/>원 </td>    
			<td>${album.day }</td>
			<td>삭제</td>
			<td>수정</td>
		</tr>
	</c:forEach>
</table>