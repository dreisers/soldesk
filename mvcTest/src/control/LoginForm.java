package control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginForm extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//페이지 이동
		//1) 제어권 이동
		//   현재페이지와 이동한 페이지가 별개
		//resp.sendRedirect("control/loginForm.jsp");
		
		//2) 현재페이지에서 발생한 요청(req), 응답(resp)객체를 가지도 이동 전진
		String view = "control/loginForm.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(view);
		rd.forward(req, resp);
	}//doGet end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}//doPost end
	//결과확인
	//http://localhost:9090/mvcTest/login.do 	
	
	
}//class end
