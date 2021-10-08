<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Axios 추가 https://wonit.tistory.com/305 참고!!  -->
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script src="https://code.jquery.com/jquery-latest.min.js"></script>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="l" items="${list}">

${l.no} </br>
${l.color} </br>
${l.name} </br>s
	
</c:forEach>

<p> AXIOS 연습하기 </p>

<form>
AXIOS Test
<input type="text" id="id" name="id"/>
<!-- <input type="text" id="pw" name="pw"/> -->
<input type="button" value="Click!!!" onclick="axiosTest()"/>
<input type="button" value="2" onclick="axiosTest1();"/>
</form>

<!-- 임포트 주소 잘못됨. 이거 수정 필요!! 내일하자 내일..... -->
<!-- 이렇게 주지말고
https://changeminor.tistory.com/8  여기참고하여 properties 건드려서 만들기!!!!
절대경로와 상대경로의 차이도 보기!!
 -->
<script type="text/javascript" src="/js/axiosTest.js"></script>

<!-- <script>

let axiosTest = () => {console.log("d");} 

</script> -->
</body>
</html>