function checkRental() {
	if (frm.rental_no.value == '') {
		alert("대여번호가 입력되지 않았습니다!");
		frm.rental_no.focus();
	} else if (frm.student_no.value == '') {
		alert("학생번호가 입력되지 않았습니다!");
		frm.student_no.focus();
	} else if (frm.rental_date.value == '') {
		alert("대여일자가 입력되지 않았습니다!");
		frm.rental_date.focus();
	} else if (frm.uniform_size.value == '') {
		alert("체육복 사이즈가 입력되지 않았습니다!");
		frm.uniform_size.focus();
	}
	else {
		alert("체육복 대여 정보가 등록되었습니다.");
		frm.submit();
	}
}

function resetRental() {
	alert("정보를 지우고 처음부터 다시 입력합니다.");
	frm.reset();
}

/**
 * 학생 검색 시 체크
 */
function checkStudent() {
	if (sfrm.student_no.value == '') {
		alert("학생번호가 입력되지 않았습니다!");
		sfrm.student_no.focus();
	} else {
		sfrm.submit();
	}
}
