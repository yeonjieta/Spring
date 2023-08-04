<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day17</title>
<style>
		#root {
			width: 800px;
			margin: auto;
			border: 2px solid black;
		}
		.wrap {
			display: flex;
			flex-flow: wrap;
		}
		.item {
			width: 200px;
		}
		.image > img {
			width: 180px;
			margin: 10px;
		}
</style>
</head>
<body>

<h1><a href="${cpath }">day17</a></h1>

