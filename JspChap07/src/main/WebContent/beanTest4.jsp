<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
%>
<jsp:useBean id="beantest" class="test.BeanTest2" scope="page" />
<jsp:setProperty name="beantest" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b>자바빈 전체 속성 값 출력</b>
	<h3>이름 : <%= beantest.getName() %></h3>
	<h3>주소 : <%= beantest.getAddr() %></h3>
	<h3>이메일 : <%= beantest.getEmail() %></h3>
	<h3>생년월일 : <%= beantest.getBirthday() %></h3>
</body>
</html>