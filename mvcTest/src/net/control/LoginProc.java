package net.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginProc extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 process(req, resp);
	}//doget end
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 process(req, resp);
	}//dopost end
	
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String uid = req.getParameter("uid").trim();
			String upw = req.getParameter("upw").trim();
			
			//session ��ü ����
			HttpSession session = req.getSession();
			//application��ü ����
			ServletContext application = req.getServletContext();
			
			if(uid.equals("soldesk") && upw.equals("1234")) {
				//�α��� ����
				req.setAttribute("msg", "�α��μ���");
				req.setAttribute("img", "<img src='./images/tube.gif'>");
				
				req.setAttribute("r_uid", uid);
				req.setAttribute("r_upw", upw);
				
				session.setAttribute("s_uid", uid);
				session.setAttribute("s_upw", upw);

				application.setAttribute("a_uid", uid);
				application.setAttribute("a_upw", upw);
				
			}else { 
				//�α��� ����
				req.setAttribute("msg", "�α��ν���");
				req.setAttribute("img", "<img src='./images/tube.gif'>");
				
				req.setAttribute("r_uid", "guest");
				req.setAttribute("r_upw", "guest");
				
				session.setAttribute("s_uid", "guest");
				session.setAttribute("s_upw", "guest");

				application.setAttribute("a_uid", "guest");
				application.setAttribute("a_upw", "guest");
				
			}//if end
			
			//�������� �̵� 
			String view = "control/loginResult.jsp";
			RequestDispatcher rd = req.getRequestDispatcher(view);
			rd.forward(req, resp);
		}catch (Exception e) {
			System.out.println("��û���� : " + e );
		}//try end
		
	}//process end
	
}//class end
