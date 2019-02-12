package net.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {
	//결과확인 
	//http://localhost:9090/mvcTest/wel.do
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method=get방식
		try {
			//1) 문자열 -> AJAX
//			resp.setContentType("text/plain; charset=UTF-8");
			//2) HTML 문서구조로 응답
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.print(" <!DOCTYPE html>");
			out.print(" <html lang='ko'>");
			out.print(" <head>");
			out.print(" <meta charset='UTF-8'>");
			out.print(" <title>환영합니다</title>");
			out.print(" </head>");
			out.print(" <body>");
			out.print(" <strong>대한민국</strong>");
			out.print(" <hr>");
			out.print(" <span style='color:red'>오필승코리아</span>");
			out.print(" <hr>");
			out.print(" <table border='1'>");
			out.print(" <tr>");
			out.print(" <th>이름</th>");
			out.print(" <td>무궁화</td>");
			out.print(" </tr>");
			out.print(" </table>");
			out.print(" </body>");
			out.print(" </html>");
			
			
		}catch (Exception e) {
			System.out.println("요청실패 : " + e);
			
		}//try end
	}//doget end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// method=post방식
	}//dopost end

	
	
}//class end
