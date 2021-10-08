<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "../header.jsp"%>

<body>
		<input type="hidden" name="boardNo" id="boardNo" value="${boardDetail.boardNo}"/>
		boardNo: ${boardDetail.boardNo}
		제목: ${boardDetail.title}</br>
		<textarea name="content" id="" cols="30" rows="10">
		${boardDetail.content}
		</textarea></br>
		작성일: ${boardDetail.regDate} </br>
		작성자: ${boardDetail.nickname}</br>

<a href="/boardList"> <input type="button" value="목록"/> </a>
<input type="button" value="수정" id="modify" onclick = "goModify()"/>


<script>
let goModify = ()=>{
	var boardno = 
	location.href = "/boardModify?boardNo="+$("#boardNo").val();
}
</script>
</body>
</html>