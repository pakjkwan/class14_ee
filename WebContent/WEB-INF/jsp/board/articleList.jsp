<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../common/top.jsp"/>
<jsp:include page="../common/header.jsp"/>
<table id="articleList">
  	<tr><th>총게시글수: ${count} 건</th></tr>
	<tr>
		<th>No</th>
		<th>ID</th>
		<th>제목</th>
		<th>등록일</th>
		<th>조회수</th>
	</tr>
<c:forEach var="article" items="${requestScope.list}">
	<tr>
		<td>${article.seq}</td>
		<td>${article.id}</td>
		<td><a href="${context}/board.do?action=detail&page=articleDetail&seq=${article.seq}">${article.title}</a></td>
		<td>${article.regdate}</td>
		<td>${article.readCount}</td>
	</tr>
</c:forEach>

</table>

<nav id="pagination">
	<ul>
	<c:if test="${requestScope.prevBlock  gt 0}">
	<li>
		<a href="${context}/board.do?action=list&page=articleList&pageNO=${requestScope.prevBlock}">◀PREV</a>
	</li>
	</c:if>
	<c:forEach varStatus="i" begin="${requestScope.blockStart}" end="${requestScope.blockEnd}"
		 step="1" >
		<li>
		<c:choose>
			<c:when test="${i.index eq pageNO}">
				<a href="#"><font style="color:red">${i.index}</font></a>
			</c:when>
			<c:otherwise>
				<a href="${context}/board.do?action=list&page=articleList&pageNO=${i.index}">${i.index}</a>
			</c:otherwise>
		</c:choose>
		</li>
	</c:forEach>
	<c:if test="${requestScope.nextBlock  le pageCount}">
	<li>
		<a href="${context}/board.do?action=list&page=articleList&pageNO=${requestScope.nextBlock}">NEXT▶</a>
	</li>
	</c:if>
	</ul>
</nav> 
<div style="height:200px"></div>
<script>
$(function(){
	var articleList=$('#articleList');
	articleList.addClass('table_default').addClass('margin_center')
		.css('width','500px').css('margin-top','30px');
	articleList.find('tr:nth-child(1)').find('th:nth-child(1)')
	.attr('colspan','5').css('text-align','right');
	var $pagination=$('#pagination');
	$pagination.css('width','500px').css('height','50px').css('margin','0 auto').css('background','gray')
	$pagination.find('ul').addClass('gnb');
	$pagination.find('.gnb').css('width','100%');
});
</script>