<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체육복 대여 시스템</title>
<style>
* { margin: 0; padding: 0; }
section {
    width: 100%;
    height: calc(100vh - 160px);
    display: flex;
    justify-content: center;
    align-items: center;
    flex-direction: column;
    background-color: #f5f5f5;
}
h1 { margin-bottom: 20px; }
a.btn {
    display: inline-block;
    padding: 10px 20px;
    background-color: #2d89ef;
    color: white;
    text-decoration: none;
    border-radius: 5px;
    margin: 5px;
}
a.btn:hover {
    background-color: #1a5fb4;
}
</style>
</head>
<body>
    <jsp:include page="header.jsp"/>
    <jsp:include page="nav.jsp"/>
    
    <section>
        <h1>체육복 대여 시스템</h1>
        <p>학생 체육복 대여 조회 및 관리 페이지입니다.</p>
        <div style="margin-top:20px;">
            <a href="search.jsp" class="btn">대여 조회</a>
            <!-- 다른 기능이 있다면 버튼 추가 -->
            <a href="insert.jsp" class="btn">대여 등록</a>
        </div>
    </section>
    
    <jsp:include page="footer.jsp"/>
</body>
</html>
