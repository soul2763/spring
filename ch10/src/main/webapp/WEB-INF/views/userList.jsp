<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>UserList</title>
	</head>
	<body>
			<h1>직원 출력</h1>
			
			<table border="1">
				<tr>
					<td>seq</td>
					<td>아이디</td>
					<td>이름</td>
					<td>hp</td>
					<td>addr</td>
					<td>pos</td>
					<td>dep</td>
					<td>rdate</td>
				</tr>
				<c:forEach var="user" items="${userList}">
				<tr>
					<td>${user.seq}</td>
					<td><a href="/ch10/userView?seq=${user.seq}">${user.uid}</a></td>
					<td>${user.name}</td>
					<td>${user.hp}</td>
					<td>${user.addr}</td>
					<td>${user.pos}</td>
					<td>${user.dep}</td>
					<td>${user.rdate}</td>					
				</tr>
			</c:forEach>
			</table>
	</body>
</html>