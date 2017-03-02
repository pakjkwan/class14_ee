<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<ul id="commonGnb">
		<li><a>고객 회원가입</a></li>
		<li><a>고객:로그인</a><li>
		<li><a>스탭:로그인</a><li>
		<li><a>관리자:로그인</a><li>
		<li><a>게시판</a><li>
		<li>
			<div class="tooltip">
				<a class="text_no_underline color_black" href="#">병원소개</a>
					<span class="tooltiptext">구현되지 않았습니다.</span>
			</div>
		</li>
</ul>
<script>
$(function(){
	var $commonGnb=$('#commonGnb');
	$commonGnb.addClass('gnb').addClass('width_full_size')
		.addClass('text_center').addClass('bg_color_darkgray');
    $commonGnb.find('li:nth-child(1)').click(function(){
		goPage('${context}/patient.do','move','registerForm');
	}); 
    $commonGnb.find('li:nth-child(2)').click(function(){
    	goPage('${context}/patient.do','move','loginForm');
	});
    $commonGnb.find('li:nth-child(3)').click(function(){
    	goPage('${context}/staff.do','move','loginForm');
	});
    $commonGnb.find('li:nth-child(4)').click(function(){
    	goPage('${context}/admin.do','move','loginForm');
	});
    $commonGnb.find('li:nth-child(5)').click(function(){
    	goPage('${context}/board.do','move','articleList');
	});
});
</script>