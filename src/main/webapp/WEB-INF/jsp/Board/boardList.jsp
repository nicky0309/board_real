<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file = "../header.jsp"%>

<body>
<form name="boardList" action="/deleteBoard" method="post">
	<table class="table" id="boardList">
	  <thead>
	    <tr>
	    <th>CHECK BOX</th>
	      <th scope="col">글번호</th>
	      <th scope="col">제목</th>
	      <th scope="col">작성자</th>
	      <th scope="col">작성일</th>
	    </tr>
	  </thead>
	  
	  <tbody>   
	    <c:forEach var="b" items="${boardList}">
	    <tr>
	    	<td><input type="checkbox" name="boardRadio" id="boardRadio" value="${b.boardNo}"/></td>
	    	<%-- <th scope="row">${b.boardNo}</th> --%>
	    	<td>${b.boardNo}</td>
	    	<td> <a href="/boardDetail?boardNo=${b.boardNo}"> ${b.title}</a></td>
	        <td>${b.nickname }</td>
	        <td>${b.regDate}</td>
	    </tr>
	    </c:forEach>
	  </tbody>
	</table>
	
		<select name="type" id="type">
			<option selected value="title">제목</option>
			<option value="nickname">작성자</option>
			<option value="boardNo">글번호</option>
			<option value="content">글번호</option>
		</select>
			<input type="text" name="keyword" id="keyword" />
			<input type="button" onclick="searchBoard()" value="검색"/>
		<input type="button" value="글쓰기" onclick="goBoardWrite()"/>
		<input type="submit" value="삭제"/>
		<input type="button" value="회원가입" onclick="goSignUp()"/>
	</form>



<script>
	let goBoardWrite = ()=> {
		location.href = "/boardWrite";
	}
	
	let goSignUp = ()=>{
		location.href="/signUp";
	}
	
	let searchBoard = () =>{
		var params = new URLSearchParams();
		params.append('type', $('#type').val());
		params.append('keyword', $('#keyword').val());
		const url = "/searchBoard"
		axios.post(url, params).then(response=>{
			var len = (Object.keys(response.data.searchList).length);
			$('#boardList > tbody').empty();
			
			console.log(len);
			console.log(response);
			//console.log(response.data.searchList[0].content);

			if(len >=1){
				for(var i=0; i<len; i++){
					console.log("TYPEOF: "+typeof(response.data.searchList[i].boardNo));
					var boardNo = response.data.searchList[i].boardNo;
					console.log("변수타입? : "+typeof(boardNo));
					var title = response.data.searchList[i].title;
					var nickname = response.data.searchList[i].nickname;
					var regDate = response.data.searchList[i].regDate;
					
					//jQUERY 태그추가....????
					//DELETE 에러
					//$('#boardList').after($('<tr><td> </td>'));
										
					str = "<tr>"+
				    	"<td><input type='checkbox' name='boardRadio' id='boardRadio' value='" +
				    	boardNo +"'/></td>"+
				    	"<td>"+boardNo+"</td>"+
				    	"<td><a href='/boardDetail?boardNo="+boardNo+"'>"+title+"</a></td>"+		
				        "<td>"+nickname+"</td>"
				        "<td>"+regDate+"</td>"+
				    	"</tr>" ;
				    
				    $('#boardList').append(str);				    
				}	
			}else{
				str = "<tr><td colspan='5'> 검색된 내용이 없습니다. </td></tr>";
				$('#boardList').append(str);
			} 			
		});
	}

</script>

</body>
</html>