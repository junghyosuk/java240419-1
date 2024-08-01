package xyz.itwill.mvc;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//컨트롤러(Controller - Servlet) : 클라이언트의 모든 요청을 받아 모델(Model - Class) 역활의
//객체로 요청 처리 메소드를 호출하여 클라이언트의 요청을 처리하고 처리결과를 뷰(View - JSP)에게
//제공하여 응답되도록 프로그램의 흐름을 제어하는 웹프로그램

//1.클라이언트의 모든 요청을 받을 수 있도록 서블릿의 URL 패턴을 설정하여 단일 진입점의 기능 구현
// => Front Controller Pattern
//@WebServlet("url") : 클래스를 서블릿으로 등록하고 서블릿을 요청할 수 있는 URL 주소를 매핑하는 어노테이션
// => 매필 설정할 URL 주소에 패턴문자(* : 전체, ? : 문자 하나)를 사용해 URL 패턴으로 매핑 가능
// => @WebServlet("*.do") : 클라이언트가 [XXX.do] 형식의 URL 주소로 요청한 경우 서블릿 실행
// => @WebServlet 어노테이션 대신 [web.xml] 파일의 엘리먼트를 사용하여 클래스를 서블릿으로
//등록하고 URL 패턴을 매칭 처리 가능
//@WebServlet("*.do")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//클라이언트가 서블릿을 요청할 때마다 자동 호출되는 메소드
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("ControllerServlet 클래스의 service() 메소드 호출");
		
		//2.클라이언트 요청 분석 : 요청 URL 주소 이용 - http://localhost:8000/mvc/XXX.do
		//HttpServletRequest.getRequestURI() : 요청 URL 주소에서 URI 주소를 반환하는 메소드
		String requestURI=request.getRequestURI();
		//System.out.println("requestURI = "+requestURI);//requestURI = /mvc/XXX.do
		
		//HttpServletRequest.getContextPath() : 요청 URL 주소에서 컨텍스트의 최상위 경로를 반환하는 메소드
		String contextPath=request.getContextPath();
		//System.out.println("contextPath = "+contextPath);//contextPath = /mvc
		
		String command=requestURI.substring(contextPath.length());
		//System.out.println("command = "+command);//command = /XXX.do
		
		//3.모델(Model) 객체를 이용하여 요청 처리 메소드를 호출해 클라이언트의 요청을 처리하고
		//뷰(View) 관련 정보를 반환받아 저장
		// => 하나의 요청에 대해 하나의 모델 객체가 요청을 처리할 수 있도록 설정 - Command Controller Pattern
		// => 요청 처리 메소드가 작성된 모델 역활의 클래스 작성 - 인터페이스를 상속받아 작성 
		
		//회원관리 프로그램에서 클라이언트 요청(Command)을 처리하기 위한 모델 클래스(Command Handler) 설정
		// => [/loginform.do]  - LoginFormModel 클래스
		// => [/login.do]      - LoginModel 클래스
		// => [/logout.do]     - LogoutModel 클래스
		// => [/writeform.do]  - WriteFormModel 클래스
		// => [/write.do]      - WriteModel 클래스
		// => [/list.do]       - ListModel 클래스
		// => [/view.do]       - ViewModel 클래스
		// => [/modifyform.do] - ModifyFormModel 클래스
		// => [/modify.do]     - ModifyModel 클래스
		// => [/remove.do]     - RemoveModel 클래스
		// => [/error.do]      - ErrorModel 클래스
		
		//클라이언트 요청정보를 비교하여 요청을 처리하는 모델 역활의 클래스로 객체를 생성하여
		//요청 처리 메소드 호출
		if(command.equals("/loginform.do")) {
			LoginFormModel model=new LoginFormModel();
			model.execute();
		} else if(command.equals("/login.do")) {
			LoginModel model=new LoginModel();
			model.handler();
		}
	}
}















