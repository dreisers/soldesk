package control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginProc_v1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// 1) 한글인코딩
			req.setCharacterEncoding("UTF-8");
			// 2) 사용자가 요청한 정보를 변수에 옮겨담기
			String uid = req.getParameter("uid").trim();
			String upw = req.getParameter("upw").trim();

			// 3) 요청한 사용자에게 응답
			resp.setContentType("text/html; charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.print(" <!DOCTYPE html>");
			out.print(" <html lang='ko'>");
			out.print(" <head>");
			out.print(" <meta charset='UTF-8'>");
			out.println(" <title>로그인결과</title>");
			out.println(" </head>");
			out.println(" <body>");
			out.println(" 아이디 : <strong>" + uid + "</strong>");
			out.println(" <hr>");
			out.println(" 비밀번호 : <strong>" + upw + "</strong>");
			out.println(" </body>");
			out.println(" </html>");
			out.close(); // 자원반납

		} catch (Exception e) {
			System.out.println("요청실패 : " + e);
		}//try end

	}// doget end

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}// dopost end

}// class end
