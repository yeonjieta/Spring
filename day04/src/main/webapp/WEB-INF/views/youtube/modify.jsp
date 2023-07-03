<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>modify.jsp</h1>
<hr>

<form method="POST">
		<p><input type="text" name="title" value="${dto.title }"></p>
		<p><input type="text" name="channel" value="${dto.channel }"></p>
		<p><input type="text" name="thumbnail" value="${dto.thumbnail }"></p>
		<p><textarea name="iframe">${dto.iframe }</textarea></p>
		<p><input type="submit"></p>
</form>
</body>
</html>