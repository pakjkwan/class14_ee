<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="util.Ssn" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<%!
public String getGender(String param) {
	return new Ssn().getGender(param);
}
%>	
<%= this.getGender(request.getParameter("ssn"))%>
</body>
</html>	