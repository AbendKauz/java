<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>단일 파일 업로드 테스트</h1>
	<form action="partUploadPro1" method="post" enctype="multipart/form-data">
		작성자 : <input type="text" name="writer" id="writer"><br>
		업로드 파일 : <input type="file" name="partFile1" id="partFile1"><br>
		<input type="submit" value="단일업로드">
	</form>
</body>
</html>