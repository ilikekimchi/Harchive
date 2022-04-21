<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
	<link  href="/css/ask.css" rel="stylesheet">
	<script src="/js/ask.js" type="text/javascript"> </script>
<title>사용자 페이지</title>
</head>
<body>
    <div class="content-wrap">
        <div>
            <form method="post" action="/ask/question">
                <textarea name="question" id="question" cols="20" rows="1"></textarea>
                <button type="submit">전송</button>
            </form>
            <!-- <button onclick="submit">전송</button> 비동기처리 -->
        </div>
		

        <ul id="qna-list">
            <li class="qna">
                <div class="q-wrap">
                    <span class="q text-box">지금 어디 살고 있나요? 정확한 위치좀<span>
                </div>

                <div class="a-wrap">
                    <span class="a text-box">안녕하세요 분당구 정자동 삽니다.</span>
                </div>
            </li>
            
            <li class="qna">
                <div class="q-wrap">
                    <span class="q text-box">키 몇임?<span>
                </div>

                <div class="a-wrap">
                    <span class="a text-box">178 이다</span>
                </div>
            </li>

        </ul>

    </div>
    
    <c:forEach var="list" items="${askList}">
    		<p>${list.askNum}</p>
			<p>${list.question}</p>
		</c:forEach>

</body>
</html>