<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<%! int count = 0; %>
	<%! int a = 2;
		int b = 3;
	%>
<body>
	<%
		out.println(++count);
	%>
	<hr>
	<%
		out.println(a + "+" + b + "=" + (a + b));
	%>
	<hr>
	<%!
		String makeItUpper(String data){
			return data.toUpperCase();
		}
	%>
	<%
		out.println(makeItUpper("hello world"));
	%>
	<hr>
	<%
		for(int i = 0; i <= 10; i++){
			if(i % 2 == 0){
				out.println(i + "<br>");
			}
		}
	%>
</body>
</html>