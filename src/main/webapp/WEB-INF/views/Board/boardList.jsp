<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
${l.name} </br>
	
</c:forEach>

<p> AXIOS 연습하기 </p>


</body>
</html>