<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
	
	<a href="admin">관리자 페이지로</a>
</body>
</html>