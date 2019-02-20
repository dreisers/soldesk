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
		//������ �̵�
		//1) ����� �̵�
		//   ������������ �̵��� �������� ����
		//resp.sendRedirect("control/loginForm.jsp");
		
		//2) �������������� �߻��� ��û(req), ����(resp)��ü�� ������ �̵� ����
		String view = "control/loginForm.jsp";
		RequestDispatcher rd = req.getRequestDispatcher(view);
		rd.forward(req, resp);
	}//doGet end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}//doPost end
	//���Ȯ��
	//http://localhost:9090/mvcTest/login.do 	
	
	
}//class end
