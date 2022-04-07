<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title> 메인 잘 도착</title>
</head>
<body>

	<c:forEach var="list" items="${resultList}" >
		<p>${list.bbsId}</p>
		<p>${list.bbsSj}</p>
	</c:forEach>
	
	<form action="/add" method="post">
		<input type="text" name="title">
		<button type="submit">go</button>
	</form>
	
	<a href="admin">admin</a>
	
	<a href="guest">guest</a>
	<a href="about">about</a>
	
	
</body>
</html>