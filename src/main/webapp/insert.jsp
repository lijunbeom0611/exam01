<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>체육복 대여 등록</title>
<style>
	*{margin:0;padding:0;}
	section{width:100%;height:calc(100vh - 160px);background-color:lightgray;}
	section h2{text-align:center;padding:20px;}
	section form{display:flex;justify-content:center;}
</style>
</head>
<body>
	<jsp:include page="header.jsp"/>
	<jsp:include page="nav.jsp"/>
	<section>
		<h2> 체육복 대여 등록 </h2>
		<form method="post" action="insertRental">
			<table border="1">
				<tr>
					<td>대여번호</td>
					<td><input type="text" name="rental_no"></td>
					<td>예)R20230001</td>
				</tr>
				<tr>
					<td>학생번호</td>
					<td><input type="text" name="student_no"></td>
					<td>예)S1001</td>
				</tr>
				<tr>
					<td>대여일자</td>
					<td><input type="text" name="rental_date"></td>
					<td>예)20230901</td>
				</tr>
				<tr>
					<td>체육복 사이즈</td>
					<td><input type="text" name="uniform_size"></td>
					<td>예)M, L, XL</td>
				</tr>
				<tr>
					<td colspan="3" style="text-align:center">
						<input type="submit" value="대여등록">
						<input type="reset" value="다시쓰기">
					</td>
				</tr>
			</table>
		</form>
	</section>
	<jsp:include page="footer.jsp"/>
	<script type="text/javascript" src = "script.js"></script>
</body>
</html>