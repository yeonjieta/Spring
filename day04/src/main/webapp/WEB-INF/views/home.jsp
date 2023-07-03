<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="cpath" value="${pageContext.request.contextPath }" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day04</title>
</head>
<body>

<h1>home.jsp</h1>
<hr>

<h3>대문페이지</h3>

<ul>
		<li><a href="${cpath }/test">버전 테스트</a></li>
		<li><a href="${cpath }/youtube/list">유투브 리스트</a></li>  
<!-- 		최상위인 yourube 안 list -->
</ul>
</body>
</html>