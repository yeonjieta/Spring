<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"/> 

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GoCamping</title>
<style>
	.flex {
		display: flex;
	}
	.description {
		width: 600px;
	}
	.lineIntro {
		display: -webkit-box;
		max-width: 60%;
	    -webkit-line-clamp: 1;
	    -webkit-box-orient: vertical;
	    overflow: hidden;
	    text-overflow: ellipsis;
	}
	.intro {
 	    display: -webkit-box;
		max-width: 60%;
	    -webkit-line-clamp: 3;
	    -webkit-box-orient: vertical;
	    overflow: hidden;
	    text-overflow: ellipsis;
	}
	#boardList {
			width: 900px;
		}
		.item {
			display: flex;
			padding: 5px 10px;
		}
		.columns {
			background-color: #dadada;
		}
		.item > .idx,
		.item > .writer,
		.item > .writeDate,
		.item > .viewCount {
			flex: 1;
		}		
		.item > .title {
			flex: 5;
		}
		.menubar {
			display: flex;
			width: 900px;
			margin: 20px auto;
			justify-content: space-between;
		}
</style>
</head>
<body>

<h1><a href="${cpath }">GoCamping2</a></h1>
<hr>

