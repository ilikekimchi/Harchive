<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>POSTING</title>
</head>
<body>
	<form method="post" action="/post/add">
		<input type="text" name="title">
		<textarea name="content"></textarea>
		<button type="submit">upload!</button>
	</form>
</body>
</html>