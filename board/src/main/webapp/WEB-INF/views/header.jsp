<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header</title>
<link type="text/css" rel="stylesheet" href="${cpath }/resources/css/style.css"> 
</head>
<body>

<header>
		<nav>
				<a href="${cpath }/list">목록</a>
		</nav>
</header>
