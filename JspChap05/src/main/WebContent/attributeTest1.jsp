<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>영역과 속성 테스트</h2>
	<%
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		if(name.equals("") || id.equals("")){ %>
			<!-- response.sendRedirect("attributeError.jsp"); -->
			<jsp:forward page='attributeError.jsp' />
			<!-- forward : html태그 (값을 가지고 넘기는 것도 가능함) -->
		<% }else {
			application.setAttribute("name", name);
			application.setAttribute("id", id);
		}
	%>
	<h3><%= name %>님 반갑습니다.</h3>
	<h3><%= name %>님의 아이디는 <%= id %>입니다.</h3>
	<form action="attributeTest2.jsp" method="post">
		<table border="1">
			<tr><td colspan="2">Session 영역에 저장할 내용들</td></tr>
			<tr>
				<td>e-mail 주소</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>집 주소</td>
				<td><input type="text" name="addr"></td>
			</tr>
			<tr>
				<td>전화번호</td>
				<td><input type="text" name="tel"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="전송"></td>
			</tr>
		</table>
	</form>
</body>
</html>