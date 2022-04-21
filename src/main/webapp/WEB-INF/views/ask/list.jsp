<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ASK</title>

<style type="text/css">
body {
	margin: 0;
	letter-spacing: -1px;
}

#content-wrap {
	max-width: 900px;
	margin: 0 auto;
}

.question-list {
	list-style: none;
	padding-left: 0px;
}

.question {
	margin-bottom: 10px;
}

.answer {
	resize: none;
	width: 100%;
	height: 70px;
	font-size: 14px;
	line-height: 13px;
	padding: 9px;
}

.btn {
	background-color: none;
}

.btn-wrap {
	float: right;
}

</style>
</head>
<script type="text/javascript">
</script>
<body>
	
	<div id="content-wrap">
        <ul class="question-list">
        	<c:forEach var="list" items="${askList}">
	            <li>
	            	<form method="post" action="list/answer">
		                <div class="question">${list.question}</div>
		                <textarea name="answer" class="answer"></textarea>
		                <div class="btn-wrap">
		                <input type="hidden" name="askNum" value="${list.askNum}">
		                    <button type="submit" class="btn add">답변 등록</button>
		                    <a href="${list.askNum}/question_delete" class="btn del">질문 삭제</a>
		                </div>
	                </form>
	            </li>
            </c:forEach>
        </ul>
    </div>
	
</body>
</html>