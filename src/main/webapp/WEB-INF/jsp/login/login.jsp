<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file = "../header.jsp"%>	

<body>

	<div name="login">
		<form >
			ID: <input type="text" name="id" id="id"/><br/>
			PW: <input type="password" name="passwd" id="passwd"/>
			<input type="button" value="클릭!" onclick="login()"/>
			
		</form>
	</div>


<script type="text/javascript" src="/js/login.js"></script>

<!-- 
1. axios로 패스워드, 아이디 매칭 후,
2. 로그인페이지 돌아와서 맞으면 location.href해서 메인페이지 이동
3. 틀리면 alert 띄우고 return.
 -->



</body>
</html>