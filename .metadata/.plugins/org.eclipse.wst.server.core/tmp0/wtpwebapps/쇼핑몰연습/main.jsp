<%@page import="productData.outerProductRepository"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="productData.outerProduct" %>
<jsp:useBean id="outerProduct" class="productData.outerProductRepository" scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/shop.css">
</head>
<body>
	<div>
		<h1> 제품 정보 메인 페이지입니다. </h1>
	</div>
	<% ArrayList<outerProduct> list = outerProduct.getAllProducts(); %>
	<% for(int i = 0; i < list.size(); i++){ %>
		<div>
			<h1><%=i+1 %>번째 제품 요약 정보</h1>
			<p>품번 : <%= list.get(i).getOuterProductID() %></p>
			<p>제조사 : <%= list.get(i).getOuterProductCompany() %></p>
			<p>가격 : <%= list.get(i).getOuterProductCost() %></p>
			<a href="./main2.jsp?id=<%= list.get(i).getOuterProductID() %>"><%=i + 1 %>번째 제품 세부정보</a>
		</div>
	<% } %>
</body>
</html>
