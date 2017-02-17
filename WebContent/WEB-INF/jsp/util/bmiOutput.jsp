<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="util.Bmi" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>BMI 측정</title>
</head>
<body>
<div>
<%
	int age=Integer.parseInt(request.getParameter("age"));
	double kg=Double.parseDouble(request.getParameter("kg"));
	double cm=Double.parseDouble(request.getParameter("cm"));
%>
나이 : <%= age %> 세<br />
몸무게 : <%= kg %> kg<br />
키 : <%= cm %> cm
</div>
BMI 결과 : <%= new Bmi().getBmi(kg, cm) %>
</body>
</html>	