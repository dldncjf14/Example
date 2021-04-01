<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	.err{
		font-size: 9pt;
		color: red;
		font-weight: bold;
	}
</style>
<title>Insert title here</title>
</head>
<body>
<form:form commandName="sb" method="post" action="form">
	<table>
		<tr>
			<td>이름</td>
			<td><input name="name" type="text" value="${sb.name }">
			<form:errors cssClass="err" path="name"></form:errors>
			</td>
		</tr>
		<tr>
			<td>비번</td>
			<td><input type="password" name="pw" value="${sb.pw }">
			<form:errors cssClass="err" path="pw"></form:errors>
			</td>
		</tr>
		<tr>
			<td><input type="submit" value="전송"> </td>
		</tr>
	</table>
</form:form>
</body>
</html>