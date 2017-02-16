<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="service.BoardService" %>
<%@ page import="serviceImpl.BoardServiceImpl" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@page import="domain.ArticleBean"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<link rel="stylesheet" href="../../css/hanbit.css" />
</head>
<body>
<div style="width:90%">
<table class="table_default margin_center" 
  style="width: 500px; margin-top: 200px">
	<tr>
		<th>No</th>
		<th>ID</th>
		<th>제목</th>
		<th>등록일</th>
		<th>조회수</th>
	</tr>
<% 
	BoardService service=BoardServiceImpl.getInstance();
	List<ArticleBean> list=service.list();
	int cardinality=5;
	int articleCount=service.count();
	int pageCount=0,blockSize=5,blockCount=0;
	if(articleCount%cardinality==0){
		pageCount=articleCount/cardinality;
	}else{
		pageCount=articleCount/cardinality+1;
	}
	if(pageCount%blockSize==0){
		blockCount=pageCount/blockSize;
	}else{
		blockCount=pageCount/blockSize+1;
	}
	int blockNo=0;
	int blockStart=0;
	int blockEnd=0;
	for(int i=0;i<cardinality;i++){
%>
	<tr>
		<td><%=list.get(i).getSeq()%> </td>
		<td><%=list.get(i).getId()%></td>
		<td><%=list.get(i).getTitle()%></td>
		<td><%=list.get(i).getRegdate()%></td>
		<td><%=list.get(i).getReadCount()%></td>
	</tr>
<% 
	}
%>
	<tr>
	<td>
	<div>
		<%="◀" %>
		
		 <%=blockStart %>
		 
		 <%=blockEnd %>   
		 
		<%="▶" %>
		
	</div>
	</td>
	</tr>
</table>
</div>    

</body>
</html>	