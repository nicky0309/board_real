<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file = "../header.jsp"%>

<body>
	<h1>회원가입 페이지</h1>

	<form action="/signUp.do" method="post">
		* 아이디: <input type="text" name="id" id="id" required/> </br>
		* 비밀번호: <input type="password"name="passwd" id="passwd" required/> </br> 
		* 닉네임: <input type="text" name="nickname" id="nickname" required/> </br>
		이메일: <input type="text" name="email" id="email" /> </br>
		연락처: <input type="text" name="phone" id="phone" /> </br>
		<input type="submit" value="등록" />
	</form>
	
</body>
</html>