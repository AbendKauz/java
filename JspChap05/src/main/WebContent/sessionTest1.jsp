<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.setMaxInactiveInterval(10);	// 작업이 없어도 세션 유지되는 시간
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>세션 테스트</h2>
	새로운 세션 여부 : <%= session.isNew() %><br>
	생성시간 : <%= session.getCreationTime() %><br>
	최종접속시간 : <%= session.getLastAccessedTime() %><br>
	세션ID : <%= session.getId() %>
</body>
</html>
