<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	body{
		text-align: center;
	}
	table{
		margin: auto;
	}
</style>
</head>
<body>
	<table>
		<tr>
			<td>이름</td>
			<td><%= request.getParameter("name") %> </td>
		</tr>
		<tr>
			<td>연락처</td>
			<td><%= request.getParameter("tel") %></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><%= request.getParameter("email") %></td>
		</tr>
		<tr>
			<td>관심분야</td>
			<td>
				<% String[] str = request.getParameterValues("hobby");
					for(int i = 0; i < str.length; i++){
						out.println(str[i] + " ");
					}
				%>
			</td>
		</tr>
	</table>
</body>
</html>