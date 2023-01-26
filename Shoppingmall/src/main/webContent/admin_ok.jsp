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
	%>
		<h1><%=request.getParameter("id") %>님 환영합니다.</h1>
	<%	} else { %>
			<%-- response.sendRedirect("welcome.jsp");
		}
	%> --%>
		<script>
			alert('잘못 입력하셨습니다. 초기화면으로 돌아갑니다.');
			location.href='welcome.jsp';
		</script>
	<%	}%>
</body>
</html>
