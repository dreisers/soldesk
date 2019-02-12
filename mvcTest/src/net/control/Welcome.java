package net.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	//���Ȯ�� 
	//http://localhost:9090/mvcTest/wel.do
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method=get���
		try {
			//1) ���ڿ� -> AJAX
//			resp.setContentType("text/plain; charset=UTF-8");
			//2) HTML ���������� ����
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.print(" <!DOCTYPE html>");
			out.print(" <html lang='ko'>");
			out.print(" <head>");
			out.print(" <meta charset='UTF-8'>");
			out.print(" <title>ȯ���մϴ�</title>");
			out.print(" </head>");
			out.print(" <body>");
			out.print(" <strong>���ѹα�</strong>");
			out.print(" <hr>");
			out.print(" <span style='color:red'>���ʽ��ڸ���</span>");
			out.print(" <hr>");
			out.print(" <table border='1'>");
			out.print(" <tr>");
			out.print(" <th>�̸�</th>");
			out.print(" <td>����ȭ</td>");
			out.print(" </tr>");
			out.print(" </table>");
			out.print(" </body>");
			out.print(" </html>");
			
			
		}catch (Exception e) {
			System.out.println("��û���� : " + e);
			
		}//try end
	}//doget end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method=post���
	}//dopost end

	
	
}//class end
