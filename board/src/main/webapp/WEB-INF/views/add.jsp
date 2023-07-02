<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<h3>새 글 작성</h3>
<hr>


<form method="POST">
		<p><input type="text" name="title" placeholder="글제목"></p>
		<p><input type="text" name="writer" placeholder="작성자"></p>
		<p><textarea name="content" placeholder="내용"></textarea></p>
		<p><input type="submit"></p>
</form>


</body>
</html>