<%@page import="xyz.itwill.dao.MyReplyDAO"%>
<%@page import="xyz.itwill.dto.MyReplyUser"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<MyReplyUser> replyUserList=MyReplyDAO.getDAO().selectReplyUserList1();
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MYBATIS</title>
<style type="text/css">
table {
	border: 1px solid black;
	border-collapse: collapse;
}

td {
	border: 1px solid black;
	text-align: center;
	padding: 3px;	
}

.no { width: 100px; }
.name { width: 150px; }
.content { width: 300px; }
.date { width: 200px; }
.comment { width: 100px; }
</style>
</head>
<body>
	<h1>댓글 목록</h1>
	<hr>
	<table>
		<tr>
			<td class="no">댓글번호</td>
			<td class="name">댓글작성자</td>
			<td class="content">댓글내용</td>
			<td class="date">댓글작성일</td>
			<td class="comment">게시글번호</td>
		</tr>
		<% for(MyReplyUser replyUser : replyUserList) { %>
		<tr>
			<td class="no"><%=replyUser.getReply().getReplyNo() %></td>
			<td class="name"><%=replyUser.getUser().getUserName() %>
				[<%=replyUser.getUser().getUserId() %>]</td>
			<td class="content"><%=replyUser.getReply().getReplyContent() %></td>
			<td class="date"><%=replyUser.getReply().getReplyDate() %></td>
			<td class="comment"><%=replyUser.getReply().getReplyCommentNo() %></td>
		</tr>
		<% } %>
	</table>
</body>
</html>