<%@page import="xyz.itwill.dao.MyMemberXMLDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id=request.getParameter("id");
	
	MyMemberXMLDAO.getDAO().deleteMyMember(id);
	
	response.sendRedirect("member_display.jsp");
%>