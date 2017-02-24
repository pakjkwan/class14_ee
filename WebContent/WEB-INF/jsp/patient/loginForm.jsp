<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/top.jsp"/>
<jsp:include page="../common/header.jsp"/>
<div id="container" class="width_full_size" style="height: 200px;position: relative;top: 100px">
<form action="${context}/patient.do" method="post" style="width: 20%;" class="margin_center">
<table>
	<tr>
		<td colspan="3"><span style="font-size: 20px;">로그인 또는
		<a href="join.html"style="text-decoration: none;line-height: inherit;">
			<span class="color_orange">회원가입</span>
			</a></span>
		</td>
	</tr>
	<tr>
		<td colspan="3" class="font_bold" style="font-size: 10px;">ID</td>
	</tr>
	<tr>
		<td colspan="3"> 
			<input type="text" name="id" placeholder="ID" class="width_full_size" style="font-size: 10px;padding: 4px;"/> </td>
	</tr>
	<tr>
		<td colspan="3" class="font_bold" style="font-size: 10px;">비밀번호</td>
	</tr>
	<tr>
		<td colspan="3"> <input type="password" name="password" placeholder="비밀번호" class="width_full_size" style="font-size: 10px;padding: 4px;"/> </td>
	</tr>
	<tr>
		<td colspan="2" class="color_orange" style="font-size: 10px;">비밀번호가 기억나지 않으세요?</td>
		<td style="height: 20px;" class="height_full_size bg_color_orange"></td>
	</tr>
</table>
<input type="hidden" name="action" value="login" />
<input type="hidden" name="page" value="main" />
<input type="submit" value="로그인" />
</form>
</div>
<%-- <jsp:include page="../common/footer.jsp"/> --%>
<script>
$(function() {
	
});
</script>
