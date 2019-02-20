package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class MywebTest {

	public static void main(String[] args) {
		
		try {
			//1) URL ����
			String URL = "http://172.16.10.22:9090/myweb/myhome.jsp";
			
			
			//2) myhome.jsp�� HTML���� ���� ��������
			//   -> ���������� ������ �ҽ������ ����
			Document doc =  Jsoup.connect(URL).get();
			
			//3) ������ 2)�� ���� ����ϱ�
			//System.out.println(doc.toString());
			//System.out.println(doc.text());
			//System.out.println(doc.title());
			System.out.println(doc.body());
		}catch (Exception e) {
			System.out.println("ũ�Ѹ� ����");
		}//try end
		
	}//main end

}//class end
