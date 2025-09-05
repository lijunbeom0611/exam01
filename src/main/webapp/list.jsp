<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체육복 대여 목록</title>
<style>
* {margin:0;padding:0;}
section {width:100%;height:calc(100vh - 160px);background-color:lightgray;}
section h2 {text-align:center;padding:20px;}
section div {display:flex;justify-content:center;}
td {text-align:center;}
</style>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<jsp:include page="nav.jsp"/>
	<section>
		<h2>체육복 대여 목록</h2>
		<div>
			<table border="1">
				<tr>
					<th>대여번호</th>
					<th>학생번호</th>
					<th>대여일</th>
					<th>사이즈</th>
				</tr>
				<c:forEach var="dto" items="${list}">
					<tr>
						<td>${dto.rentalNo}</td>
						<td>${dto.studentNo}</td>
						<td>${dto.rentalDate}</td>
						<td>${dto.uniformSize}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</section>
	<jsp:include page="footer.jsp"/>
</body>
</html>