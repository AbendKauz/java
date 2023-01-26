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
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("admin") && pw.equals("1234")){
			session.setAttribute("id", id);
			session.setAttribute("pw", pw);
			out.println("로그인 되었습니다.");
			/* 세션 10초동안 유지 */
			session.setMaxInactiveInterval(10);	
		} else{
			out.println("<script>alert('아이디나 비밀번호를 잘못 입력하셨습니다.');</script>");
			out.println("<script>location.href='session01.jsp'</script>");
		}
	%>
</body>
</html>