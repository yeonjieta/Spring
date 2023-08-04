<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>

<h3>day17 - sftp 파일 전송</h3>
<hr>

<form method="POST" action="${cpath }/upload"  enctype="multipart/form-data">
		<p>
			<input type="text" name="title" placeholder="그림 이름" >
			<input type="file" name="upload" accept="image/*" required>
			<input type="submit">
		</p>
</form>

<div id ="root">
		<div class="wrap">
			<c:forEach var="dto" items="${list }">
				<div class="item">
						<div class="image"><img src="${dto.filePath }"></div>
						<div class="title">${dto.title }</div>
				</div>
			</c:forEach>
		</div>
</div>



</body>
</html>