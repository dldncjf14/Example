<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	String[] winarr = {"한국", "러시아", "독일", "스페인"};
	String[] roundarr = {"한국", "멕시코", "독일", "브라질", "스위스", "잉글랜드"};
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="modify" method="post">
		<table width="700" height="200" cellpadding="0" cellspacing="0" border="1" >
			<tr>
				<td>번호</td>
				<td>
				${dto.num }
				<input type="hidden" name="num" value="${dto.num }">
				</td>
			</tr>
			<tr>
				<td>아이디</td>
				<td>
				${dto.id }
				<input type="hidden" name="id" size="50" value="${dto.id }">
				</td>
			</tr>
			<tr>
				<td>비번</td>
				<td><input type="text" name="pw" size="50" value="${dto.pw }"></td>
			</tr>
			<tr>
				<td>우승예상국가</td>
				<td>
				<%-- <c:set var="nation" value="<%=winarr %>"/>
				<c:forEach var="win" items="${nation }">
					<input type="radio" name="win" value="${win }" <c:if test="${dto.win==win }">checked</c:if>>${win }</input>
				</c:forEach>
				<br> --%>
				<c:forEach var="i" items="<%=winarr %>">
					<input type="radio" name="win" value="${i }" <c:if test="${dto.win==i }">checked</c:if>>${i }</input>
				</c:forEach>
<%-- 				<input type="radio" name="win" value="한국" <c:if test="${dto.win=='한국' }">checked</c:if>>한국</input>
					<input type="radio" name="win" value="러시아" <c:if test="${dto.win=='러시아' }">checked</c:if>>러시아</input>
					<input type="radio" name="win" value="독일" <c:if test="${dto.win=='독일' }">checked</c:if>>독일</input>
					<input type="radio" name="win" value="스페인" <c:if test="${dto.win=='스페인' }">checked</c:if>>스페인</input> --%>
				</td>
			</tr>
			<tr>
				<td>16강예상국가</td>
				<td>
				<c:forEach var="i" items="<%=roundarr %>">
					<input type="checkbox" name="round16" value="${i }"  <c:if test="${fn:contains(dto.round16, i) }">checked</c:if> >${i }</input>
				</c:forEach>
					<%-- <input type="checkbox" name="round16" value="한국"  <c:if test="${fn:contains(dto.round16,'한국') }">checked</c:if> >한국</input>
					<input type="checkbox" name="round16" value="멕시코" <c:if test="${fn:contains(dto.round16,'멕시코') }">checked</c:if> >멕시코</input>
					<input type="checkbox" name="round16" value="독일" <c:if test="${fn:contains(dto.round16,'독일') }">checked</c:if> >독일</input>
					<input type="checkbox" name="round16" value="브라질" <c:if test="${fn:contains(dto.round16,'브라질') }">checked</c:if> >브라질</input>
					<input type="checkbox" name="round16" value="스위스" <c:if test="${fn:contains(dto.round16,'스위스') }">checked</c:if> >스위스</input>
					<input type="checkbox" name="round16" value="잉글랜드" <c:if test="${fn:contains(dto.round16,'잉글랜드') }">checked</c:if> >잉글랜드</input> --%>
				</td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="수정">
					&nbsp;&nbsp; <a href="list">목록보기</a>
					&nbsp;&nbsp; <a href="delete?num=${dto.num }">삭제</a></td>
			</tr>
		</table>
	</form>
</body>
</html>