package xyz.itwill.guest;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//게시글을 전달받아 GUEST 테이블에 저장된 행을 변경하고 게시글 목록페이지(/guest/list.itwill)를
//요청할 수 있는 URL 주소를 응답하는 서블릿
@WebServlet("/guest/modify.itwill")
public class GuestModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
}
