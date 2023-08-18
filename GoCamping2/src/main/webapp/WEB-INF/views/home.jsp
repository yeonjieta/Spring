<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>${version }</h3>
<hr>

<ol>
	<li><a href="${cpath }/freeBoard">자유게시판 + 댓글</a></li>
	<li><a href="${cpath }/noticeBoard">공지게시판</a></li>
	<li><a href="${cpath }/eventBoard">이벤트게시판</a></li>
</ol>

</body>
</html>