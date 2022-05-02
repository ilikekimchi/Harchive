<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
    <link  href="/css/main.css" rel="stylesheet">
	<script src="/js/main.js" type="text/javascript"> </script>
	<script src="https://kit.fontawesome.com/5ea47adb73.js" crossorigin="anonymous"></script>
<title>H_archive</title>
</head>
<body>

    <div id="page-wrap">

        <header id="header-wrap">
            <h1 id="page-title">H_archive</h1>
            <ul class="header-menu">
                <li class="menu-list"><a href="/" >메인</a></li>
                <li class="menu-list"><a href="ask">질게</a></li>
                <li class="menu-list"><a href="about">소개</a></li>
            </ul>
        </header>

        <div id="content-wrap">

            <div class="search-wrap">
                <form method="post" id="search-form">
                    <span class="search-type-wrap">
                        <select name="" class="search-type">
                            <option value="">제목+내용</option>
                            <option value="">제목</option>
                            <option value="">내용</option>
                            <option value="">태그</option>
                        </select>
                    </span>
                    <span class="search-keyword-wrap">
                        <input type="text" class="search-keyword" placeholder="검색">
                    </span>
                </form>
            </div>

            <div class="post-area">
                <ul class="post-list">
                    <c:forEach var="list" items="${postList}">
	                    <li class="post-info">
	                        <div class="post-date">
	                            <i class="fa-regular fa-calendar-plus"></i>
	                            <span class="date-info">1997.09.04</span>
	                        </div>
	                        <div class="post-title">${list.title}</div>
	                        <div class="post-tag">
	                            <i class="fa-solid fa-tags"></i>
	                            <a href="">일대기</a>
	                        </div>
	                    </li>
                    </c:forEach>
                </ul>
            </div>
        </div>

        <footer class="footer-wrap">
            <span>Copyright ⓒ Kim Seong Hyun</span>
        </footer>

        <a id="return-to-top" href="#page-wrap">
            <i class="fa-solid fa-angles-up"></i>
        </a>

    </div>
	
</body>
</html>