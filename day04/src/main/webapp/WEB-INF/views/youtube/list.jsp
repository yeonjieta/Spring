<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>list.jsp</h1>
	<hr>

	<p>
		<a href="${cpath }/youtube/add"><button>추가</button></a>
	</p>

	<c:forEach var="dto" items="${list }">
		<div>
			<a href="${cpath }/youtube/view/${dto.idx}">
				<div>
					<img src="${dto.thumbnail }" width="250">
			</a>
		</div>
		<div>${dto.title }| ${dto.channel }</div>
		</div>

	</c:forEach>
</body>
</html>