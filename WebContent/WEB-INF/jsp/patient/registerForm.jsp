<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link rel="stylesheet" href="../css/hanbit.css" />
</head>
<body>
<div id="wrapper" class="width_full_size" style="height: 100%">
<div id="header" class="width_full_size position_fix" style="height: 100px" >
	<div class="logo_box width_full_size text_center">
		<a href="../index.html"><img src="../images/index/index_logo.png"></a>
	</div>
	<ul class="gnb width_full_size text_center bg_color_darkgray" style="height: 40px">
		<li><a href="join.html">회원가입</a></li>
		<li><a href="login.html">로그인</a><li>
		<li><a href="board.html">게시판</a><li>
		<li><a href="admin.html">관리자</a><li>
	</ul>
</div>
<div style="height: 100px"></div>
<div id="container" class="width_full_size" style="height: 600px">
<div style="margin-top:35px" class="width_full_size">
<form action="" style="width:40%;" class="margin_center">
<table>
<tr>
       <td class="color_blue">한글 또는 영문으로 입력해 주세요.</td>
</tr>
<tr>
       <td>
              <input type="text" name="E-MAIL" value="E-MAIL"/>
              <input type="button" name="check out" value="중복확인"/><br />
              LPOINT 아이디는 자주 사용하시는 이메일 주소로 이력해 주세요.     
       </td>
</tr>
<tr>
       <td>
              <input type="text" name="password" value="비밀번호"/>
              8~15자의 영문자,숫자,특수문자를 함께 입력해주세요.
       </td>
</tr>
<tr>
       <td>
              <input type="text" name="confirm" value="비밀번호 확인"/>
       </td>
</tr>
<tr>
       <td>
       <select name="birth" >
              <option value="1985">1985</option>
              <option value="1986">1986</option>
              <option value="1987">1987</option>
              <option value="1988">1988</option>
       </select>
       <select name="month" >
              <option value="1">1월</option>
              <option value="2">2월</option>
              <option value="3">3월</option>
              <option value="4">4월</option>
              <option value="5">5월</option>
              <option value="6">6월</option>
              <option value="7">7월</option>
              <option value="8">8월</option>
              <option value="9">9월</option>
              <option value="10">10월</option>
              <option value="11">11월</option>
              <option value="12">12월</option>
              </select>
              <select name="date">
              <option value="1">1일</option>
              <option value="2">2일</option>
              <option value="3">3일</option>
              <option value="4">4일</option>
              <option value="5">5일</option>
              <option value="6">6일</option>
              <option value="7">7일</option>    
              <option value="8">8일</option>
              <option value="9">9일</option>
              <option value="10">10일</option>
              </select>
       </td>
</tr>
<tr>
       <td>
              <select name="pcom" >
              <option value="SKT">SKT</option>
              <option value="KTF">KTF</option>
              <option value="LG">LG</option>
              </select>
              <select name="NUM" >
              <option value="SKT">010</option>
              <option value="KTF">019</option>
              <option value="LG">017</option>
              </select>-
              <input type="text" />
              -
              <input type="text" />
       </td>
</tr>
<tr>
       <td>
       정보수신동의&nbsp;전체선택<input type="checkbox" name="select" value="all select"/>
       </td>
</tr>
<tr>
       <td>
       L.POINT
       <input type="checkbox" name="lp.email" value="e-mail"/>E-MAIL
       <input type="checkbox" name="sms" value="sms"/>SMS
       <br />
       롯데시네마
       <input type="checkbox" name=lp.email value="e-mail"/>E-MAIL
       <input type="checkbox" name="sms" value="sms"/>SMS
       <br />
       *정보수신동의를 하시면, 고객혜택 및 이벤트 등 다양한 정보를 받으실 수 있습니다.
       </td>
</tr>
<tr>
       <td>
       개인정보<br />
       유효기간<input type="radio" name="out" value="del"/>탈퇴 시 파기
       <input type="radio" name="year" value="1year"  /> 1년<br />
       *개인정보 유효기간 경과 이후 개인정보를 분리 저장관리 또는 파기 합니다.
       </td>
</tr>
<tr>
       <td>
       <p class="color_blue">*선택항목에 동의하지 않으셔도 정상적인 서비스를 이용하실 수 있습니다.</p>
       </td>
</tr>
<tr>
       <td>
       <input type="button" name="back" value="이전" style=width:200px; />
       <input type="button" name="back" value="다음" style=width:200px; />
       
       </td>
</tr>
</table>
</form>
</div>
</div>
<div id="footer" class="width_full_size" style="height: 80px; border-top: 2px solid #5a5a5a;">
	<dl class="notice" style="margin-left: 40px">
		<dt><a href="/NOTICE" class="h_notice">공지사항</a></dt>
	</dl>
	<dl class="policy">
		<dd class="f"><a href="http://www.navercorp.com/" target="_blank" id="plc.intronhn">회사소개</a></dd>
		<dd><a href="http://mktg.naver.com/" id="plc.adinfo">광고</a></dd>
		<dd><a href="https://submit.naver.com/" id="plc.search">마이비즈니스</a></dd>
		<dd><a href="https://www.navercorp.com/ko/company/proposalGuide.nhn" target="_blank" id="plc.contact">제휴제안</a></dd>
		<dd><a href="rules/service.html" id="plc.service">이용약관</a></dd>
		<dd><a href="rules/privacy.html" id="plc.privacy"><strong>개인정보처리방침</strong></a></dd>
		<dd><a href="rules/youthpolicy.html" id="plc.youth">청소년보호정책</a></dd>
		<dd><a href="https://help.naver.com/" id="plc.helpcenter">네이버 고객센터</a></dd>
	</dl>
	<address>&copy; <strong><a href="http://www.navercorp.com/" target="_blank">NAVER Corp.</a></strong></address>
	</div>
</div>
</body>
</html>