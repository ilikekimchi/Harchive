<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>메인</h1>
	<p>추가</p>
	<p>추가</p>
	<p>추가</p>
	<p>추가</p>
	<p>추가</p>
	<p>추가</p>
	<c:forEach var="list" items="${resultList}" >
		<p>${list.bbsId}</p>
		<p>${list.bbsSj}</p>
	</c:forEach>
</body>
</html>