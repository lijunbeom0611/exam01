<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체육복 대여 조회</title>
<style>
* { margin: 0; padding: 0; }
section { width: 100%; height: calc(100vh - 160px); background-color: lightgray; }
section h2 { text-align: center; padding: 20px; }
section div { display: flex; justify-content: center; }
td { text-align: center; padding: 8px; }
input[type=text] { padding: 5px; }
</style>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<jsp:include page="nav.jsp"/>
	<section>
		<h2>체육복 대여 조회</h2>
		<div>
			<form method="post" action="${pageContext.request.contextPath}/rentalDetail">
				<table border="1">
					<tr>
						<td>대여번호</td>
						<td><input type="text" name="rental_no" placeholder="예) R20230001"></td>
						<td><input type="submit" value="조회"></td>
					</tr>
				</table>
			</form>
		</div>
		
		<c:if test="${not empty dto}">
		<div style="margin-top:20px;">
			<table border="1">
				<tr>
					<th>대여번호</th>
					<th>학생번호</th>
					<th>대여일자</th>
					<th>사이즈</th>
				</tr>
				<tr>
					<td>${dto.rentalNo}</td>
					<td>${dto.studentNo}</td>
					<td>${dto.rentalDate}</td>
					<td>${dto.uniformSize}</td>
				</tr>
			</table>
		</div>
		</c:if>
		<c:if test="${empty dto}">
    <p style="text-align:center; color:red;">조회된 데이터가 없습니다.</p>
</c:if>
	</section>
	<jsp:include page="footer.jsp"/>
</body>
</html>