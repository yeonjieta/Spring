<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>view.jsp</h1>
<hr>

<div>${dto.iframe }</div>

<h3>${dto.title }</h3>
<h4>${dto.channel }</h4>

<p><a href="${cpath }/youtube/list"><button> 목록</button></a></p>
<p><a href="${cpath }/youtube/delete/${dto.idx}"><button>삭제</button></a></p>
<p><a href="${cpath }/youtube/modify/${dto.idx}"><button>수정</button></a></p>
</body>
</html>