package control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LifeCycle extends HttpServlet {

	//���Ȯ��
	//http://localhost:9090/mvcTest/life.do
	
	/* HttpServlet �����ֱ� 
	   init() : ������ ���۵Ǹ� 1���� ȣ��
	   		  -> service() : ����ڰ� ��û�Ҷ��� ȣ��
	   		  -> service()
	   		  -> service()
	   		  -> service()
	   		  			   -> destory() : ������ �����Ǹ� 1���� ȣ��
	   
	   
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//method=get ��� ��û�� ���ö� 
		super.doGet(req, resp);
		System.out.println("doget() ȣ��...");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//method=post ��� ��û�� ���ö� 
		super.doPost(req, resp);
		System.out.println("dopost() ȣ��...");
	}
	
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		//method=get ������� ��ö�Ǹ� doGet() ȣ�� 
		//method=post ������� ��ö�Ǹ� doPost() ȣ��
		//�����ؼ� ȣ���ϴ� ��Ȱ
		super.service(arg0, arg1);
		System.out.println("service() ȣ��...");
	}
	
	@Override
	public void destroy() {
		//������ �����ɶ� �ѹ��� �ڵ� ����
		super.destroy();
		System.out.println("destroy() ȣ��...");
	}
	
	@Override
	public void init() throws ServletException {
		//���� ���ʷ� ȣ��ɶ� �ѹ��� �ڵ� ����
		//�ʱ�ȯ�� �����Ҷ� ���
		super.init();
		System.out.println("init() ȣ��...");
	}
	   
	   
}//class end
