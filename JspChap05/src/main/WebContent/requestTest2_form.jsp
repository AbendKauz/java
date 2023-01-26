<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body, #submit{
		text-align: center;
	}
	table{
		border: 1px solid black;
		margin: auto;
		padding: 10px;
	}
	
</style>
</head>
<body>
	<h1>회원가입양식</h1>
	<form action="requestTest2.jsp" method="post">
		<table>
			<tr>
				<td>이름</td>
				<td><input type="text" name="name" maxlength="10"></td>
			</tr>
			<tr>
				<td>연락처</td>
				<td>
					<input type="tel" name="tel" id="tel">
				</td>
			</tr>
			<tr>
				<td>이메일</td>
				<td>
					<input type="email" name="email" id="email">
				</td>
			</tr>
			<tr>
				<td>관심분야</td>
				<td>
					운동<input type="checkbox" value="운동" name="hobby" id="hobby">
					독서<input type="checkbox" value="운동" name="hobby">
					게임<input type="checkbox" value="게임" name="hobby">
				</td>
			</tr>
			<tr>
				<td colspan="2" id="submit">
					<input type="submit" value="제출">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>