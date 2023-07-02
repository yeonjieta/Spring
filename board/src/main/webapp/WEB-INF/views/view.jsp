<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>

<div id="boardOne">
	<h3>${dto.title }</h3>
	<hr>
	<div id="writer">${dto.writer }    |    ${dto.writeDate }</div>
	<hr>
	<div id="content">${dto.content }</div>

	<a href="${cpath }/modify/${dto.idx}"><button>수정</button></a> 
	<a href="${cpath }/delete/${dto.idx}"><button>삭제</button></a>
</div>
</body>
</html>