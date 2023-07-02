<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="header.jsp"%>


<form method="GET" action="${cpath }/searchList">
		<p><input type="search" name="search" value="${param.search }" placeholder="제목에서 찾기">
		<input type="submit" value="검색"></p>
</form>

<table>

		<tr>
			<th>no.</th>
			<th>제목</th>
			<th>글쓴이</th>
			<th>날짜</th>
		</tr>



	
		<c:forEach var="dto" items="${list }">
			<tr>
				<td>${dto.idx }</td>
				<td><a href="${cpath }/view/${dto.idx }">${dto.title }</a></td>
				<td>${dto.writer }</td>
				<td>${dto.writeDate }</td>
			</tr>
		</c:forEach>
</table>

	<a href="${cpath }/add"><button>새 글 작성</button></a>
</body>
</html>