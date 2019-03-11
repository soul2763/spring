<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>userRegist</title>
	</head>
	<body>
		<form action="/ch10/userRegist" method="POST">
			<table border="1">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="uid"/></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="name"/></td>
				</tr>
				<tr>
					<td>휴대폰</td>
					<td><input type="text" name="hp"/></td>
				</tr>
				<tr>
					<td>주소</td>
					<td><input type="text" name="addr"/></td>
				</tr>
				<tr>
					<td>직급</td>
					<td><input type="text" name="pos"/></td>
				</tr>
				<tr>
					<td>부서</td>
					<td>
						<select name="dep">
							<option value="101">총무부</option>
							<option value="102">인사부</option>
							<option value="103">영업부</option>
							<option value="104">개발부</option>
							<option value="105">지원부</option>
						</select>
					</td>
				</tr>
				
			</table>
			<input type="submit" value='등록'/>
		</form>
	</body>
</html>