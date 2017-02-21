<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set var="context" value="<%=application.getContextPath()%>"/>
<c:set var="img" value="${context}/images"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
<link rel="stylesheet" href="css/hanbit.css" />
</head>
<body>
<div id="wrapper" class="width_full_size" style="height: 100%">
<div id="header" class="width_full_size position_fix" style="height: 100px" >
	<div class="logo_box width_full_size text_center">
		<a href="../index.html"><img src="${img}/index/index_logo.png"></a>
	</div>
	<ul class="gnb width_full_size text_center bg_color_darkgray" style="height: 40px">
		<li><a href="${context}/patient.do?action=move&page=registerForm">회원가입</a></li>
		<li><a href="${context}/patient.do?action=move&page=loginForm">로그인</a><li>
		<li><a href="${context}/board.do?action=move&page=main">게시판</a><li>
		
	</ul>
</div>
<div style="height: 100px"></div>