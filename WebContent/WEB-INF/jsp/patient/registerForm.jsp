<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/top.jsp"/>
<jsp:include page="../common/header.jsp"/>
<div id="container" class="width_full_size" style="height: 600px">

<form id="registerForm" action="" style="width:40%;margin-top:35px" class="width_full_size margin_center">
<table>
<tr>
       <td class="color_blue">한글 또는 영문으로 입력해 주세요.
       		<input type="text" name="id" value="ID"/>
              <input type="button" name="check out" value="중복확인"/><br />
       
       </td>
</tr>
<tr>
       <td>
              <input type="text" name="email" value="E-mail"/>
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
		      <option value="" selected>생년선택</option>
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
              <select name="telecom" >
              <option value="SKT">SKT</option>
              <option value="KTF">KTF</option>
              <option value="LG">LG</option>
              </select>
              <select name="phoneNo" >
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
       정보수신동의&nbsp;전체선택<input type="checkbox" name="ckbox" value="all select"/>
       </td>
</tr>
<tr>
       <td>
       L.POINT
       <input type="checkbox" name="ckbox" value="lpointEmail"/>E-MAIL
       <input type="checkbox" name="ckbox" value="lpointSms"/>SMS
       <br />
       롯데시네마
       <input type="checkbox" name=ckbox value="lotteEmail"/>E-MAIL
       <input type="checkbox" name="ckbox" value="lotteSms"/>SMS
       <br />
       *정보수신동의를 하시면, 고객혜택 및 이벤트 등 다양한 정보를 받으실 수 있습니다.
       </td>
</tr>
<tr>
       <td>
       개인정보<br />
       유효기간<input type="radio" name="rdBtn" value="del"/>탈퇴 시 파기
       <input type="radio" name="rdBtn" value="1year"  /> 1년<br />
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
<input type="hidden" name="action" value="register" />
<input type="hidden" name="page" value="main" />
 <input type="button" name="submitBtn" value="전송" style=width:200px; />
</form>
</div>
<script>
$(function(){
	var $registerForm=$('#registerForm');
	var tab=$registerForm.find('table');
	$('input[name=submitBtn]').click(function(){
		$registerForm.attr("action", "${context}/patient.do");
		$registerForm.attr("method", "post");
		alert('전송 직전');
		$registerForm.submit();
	});
});
</script>








