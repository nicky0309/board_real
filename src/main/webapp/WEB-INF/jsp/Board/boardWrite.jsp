<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "../header.jsp"%>

<body>
<h2> BoardWrite 페이지입니다.</h2>


	<input type="hidden" id="wou" name="wou" value="${WOU}"/>
	 <h1>${WOU}</h1>

	<form name="postContent">
		<input type="hidden" id="boardNo" name="boardNo" value = "${boardDetail.boardNo}"/>
		유저번호 <input type="text" name="userNo" id="userNo" value="${boardDetail.userNo}"/>
		제목 <input type="text" name="title" id="title" value="${boardDetail.title}"/> 
		글내용 
		<textarea rows="10" cols="50" id="content" name="content">
		${boardDetail.content}
		</textarea>
		</br>
		<input type="button" value="등록" onclick="updateContent()"/>
		<input type="button" value="취소" onclick="goBack()"/>
		<input type="button" id="delBtn" value="삭제" onclick="delBoard()"/>
	</form>
	
	<script>
	console.log($("#wou").val());
	var value = $("#wou").val();
	
	$(document).ready(function(){
			//alert($("#wou").val());
			console.log($("#wou").val());
			
			if($('#wou').val() == 0){
				$('#delBtn').hide();	
				$('#userNo').val("");
				$('#title').val("");
				$('#content').val("");
			}
		});
			
	
/*	function updateContent(){
		alert();
	}
	*/
	
	function updateContent(){
		//alert("컨텐트탐");
		var frm = document.postContent;
		if($("#wou").val() == 0){
			frm.action = "/insertBoard";
			frm.method="post";
			frm.submit();
		}else {
			frm.action = "/updateBoard";
			frm.method="post";
			frm.submit();
		}
	}
	
	function delBoard(){
		var frm = document.postContent;
		frm.action="/deleteBoard";
		frm.method="post";
		frm.submit();
	}
	/*	
	let postContent = ()=>{
			alert("컨텐트탐");
			var frm = document.postContent;
			if($("#wou").val() == 0){
				frm.action = "/insertBoard";
				frm.method="post";
				frm.submit();
			}else {
				frm.action = "/updateBoard";
				frm.method="post";
				frm.submit();
			}
		}*/
		

	</script>
	
	
</body>
</html>