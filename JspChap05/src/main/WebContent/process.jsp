<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
	%>
	<p>
		이름 : <%=name %><br>
		요청 정보 길이 : <%= request.getContentLength() %><br>
		클라이언트 전송 방식 : <%= request.getMethod() %><br>
		요청 URI : <%= request.getRequestURI() %><br>
		서버 이름 : <%= request.getServerName() %><br>
		서버 포트 : <%= request.getServerPort() %><br>
		요청 URL : <%= request.getRequestURL() %><br>
		클라이언트 호스트 : <%= request.getRemoteHost() %><br>
		클라이언트 IP 주소 : <%= request.getRemoteAddr() %><br>
		프로토콜 : <%= request.getProtocol() %><br>
		컨덱스트 경로 : <%= request.getContextPath() %><br>
	</p>
</body>
</html>
