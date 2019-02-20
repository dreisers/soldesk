package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ChoongangTest {

	public static void main(String[] args) {
		
		try {
			// �߾�����ó���п� �������� ���� ũ�Ѹ��ϱ�
			// 1) �������� 1������ ũ�Ѹ� ----
			/*
			String URL = "http://www.choongang.co.kr/html/sub07_01.php";
			Document doc =  Jsoup.connect(URL).get();
		
			//System.out.println(doc.toString());
			
			// ��Ҹ� ���������� ����
			//class="default_title"
			Elements elements = doc.select(".default_title");
			
			  
			 	//for(������:��ü��)
				//int[] params = {1, 3, 5}
				//for(int param:params)
			
			for(Element element:elements) {
				//System.out.println(element.toString());
				//System.out.println(element.tagName());
				System.out.println(element.text());
			}//for end
			*//////////////////// 
			
			// 2) �������� ���� 1~5������ ũ�Ѹ�
			String URL = "http://www.choongang.co.kr/html/sub07_01.php?";
			for(int page=1; page<=5; page++) {
				String params = "";
				params += "page=" + page;
				params += "&mod=&idx=";
				
				Document doc = Jsoup.connect(URL+params).get();
				//Elements elements = doc.select(".default_title");
				Elements elements = doc.select(".board_default_list .default_title");
				for(Element element:elements) {
					
					System.out.println(element.text());
				}//for end
				
			}//for end
			
			
			
		}catch (Exception e) {
			System.out.println("ũ�Ѹ� ����");
		}//try end
		
	}//main end

}//class end
