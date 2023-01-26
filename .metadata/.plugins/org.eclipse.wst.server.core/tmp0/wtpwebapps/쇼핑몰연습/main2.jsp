<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% response.setCharacterEncoding("utf-8"); %>
<%@ page import="productData.outerProduct" %>
<jsp:useBean id="outerProduct" class="productData.outerProductRepository" scope="session"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/shop.css">
</head>
<body>
	<%
		String id = request.getParameter("id");
		outerProduct product = outerProduct.getProductById(id); 
	%>
	<h1>제품 세부정보</h1>
	<div>
		<p>품번 : <%= product.getOuterProductID() %></p>
		<p>제조회사 : <%= product.getOuterProductCompany() %></p>
		<p>가격 : <%= product.getOuterProductCost() %></p>
		<p>설명 : <%= product.getOuterProductDescription() %></p>
		<p>사이즈 : <%= product.getOuterProductSize() %></p>
		<p>제조연도 : <%= product.getOuterProductYear() %></p>
		<p>성별 : <%= product.getOuterProductSex() %></p>
		<a href="javascript:history.back();">목록으로</a>
	</div>
</body>
</html>