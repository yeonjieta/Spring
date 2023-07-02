<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<h3>글 수정</h3>

<form method="POST">
		<p><input type="text" name="title" value="${dto.title }"></p>
		<p><input type="text" name="writer" value="${dto.writer }" readonly></p>
		<p><input type="date" name="writeDate" value="${dto.writeDate }" readonly></p>
		<p><textarea name="content" value="${dto.content }"></textarea></p>
		<p><input type="submit"</p>
		</form>
</body>
</html>