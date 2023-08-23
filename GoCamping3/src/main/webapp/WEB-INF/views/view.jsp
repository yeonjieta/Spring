<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<div id="view">
	<h1>${camp }</h1>
</div>


<h3>리뷰작성</h3>
<div id="gocampReviewinput">
<form method="POST">
	<p><input type="text" name="title" placeholder="제목" required autofocus> </p>
	<input type="hidden" name="board" value="${contentId}" />
	<p><input type="text" name="writer" value="${nickname}" readonly> </p>
	<p><textarea name="content" placeholder="리뷰작성" required></textarea> </p>
	<p><input type="submit"></p>
</form>
</div>


	<c:forEach var="review" items="${reviewList }">
		<div id="gocampReview">  
			<hr>
			<h1>${review.title }</h1>
			<h3>${review.writer} | <fmt:formatDate value="${review.reviewdate }"/></h3>                                              
			<h3>${review.review_content }</h3>
			
		</div>
		</c:forEach>



<script>
	async function requestAPI() {
		let url = "https://apis.data.go.kr/B551011/GoCamping/searchList?"
		const keyword = '${camp}'
		const params = {
		 	pageNo: 1,
		 	numOfRows: 5,
		 	_type: 'json',
		 	serviceKey: 'NXleNIUe%2Fm77zJ9SgvX9%2BmbB2KiHMu900jEu%2F1GCGQ%2F3eOQD65jRFFN5l5Qrvw5tumPP0dCi%2BjK75haSrtR9IA%3D%3D',
		 	MobileOS: 'ETC',
		 	MobileApp: 'AppTest',
		 	keyword: keyword
		}
		for (let key in params) {
			url += key + '=' + params[key] + '&'
		}
		const arr = await fetch(url)
						.then(resp => resp.json())
						.then(json => json.response.body.items.item)
		return arr
	}
	
	async function viewHandler() {
		const arr = await requestAPI()
		const contentId = '${contentId}'
		let view = ''
		arr.forEach(ob => {
			if(ob.contentId == contentId) {
				view = ob
			}
		})
		console.log(view)
	}
	
	window.onload = viewHandler()
</script>

</body>
</html>