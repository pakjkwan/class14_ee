<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<ul id="ulGnb">
		<li><a id="aJoin">고객 회원가입</a></li>
		<li><a id="aPatLogin" >고객:로그인</a><li>
		<li><a id="aStaffLogin" >스탭:로그인</a><li>
		<li><a id="aAdminLogin" >관리자:로그인</a><li>
		<li><a id="aBoard">게시판</a><li>
		<li>
			<div class="tooltip">
				<a class="text_no_underline color_black" href="#">병원소개</a>
					<span class="tooltiptext">구현되지 않았습니다.</span>
			</div>
		</li>
</ul>
<script>
function goPage(){
	 $('#ulGnb').addClass('gnb').addClass('width_full_size')
		.addClass('text_center').addClass('bg_color_darkgray'); 
	$('#aJoin').click(function(){
		alert('jQuery Test');
		location.href="${context}/patient.do?action=move&page=registerForm";
	});
	document.getElementById('aPatLogin').onclick=function(){
		alert('aPatLogin.onclick');
		location.href="${context}/patient.do?action=move&page=loginForm";
	}
	document.getElementById('aStaffLogin').onclick=function(){
		alert('aStaffLogin.onclick');
		location.href="${context}/Staff.do?action=move&page=loginForm";
	};
	document.getElementById('aAdminLogin').onclick=function(){
		alert('aAdminLogin.onclick');
		location.href="${context}/admin.do?action=move&page=loginForm";
	}
	document.getElementById('aBoard').addEventHandler('click',function(){
		alert('aAdminLogin.onclick');
		location.href="${context}/board.do?action=move&page=articleList";
	});
}
window.onload=goPage();






function goStaflogin(){
	location.href="${context}/patient.do?action=move&page=loginForm";
}
function goAdminlogin(){
	location.href="${context}/patient.do?action=move&page=loginForm";
}
function goBoard(){
	location.href="${context}/board.do?action=move&page=main";
}
</script>