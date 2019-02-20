package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ChoongangTest {

	public static void main(String[] args) {
		
		try {
			// 중앙정보처리학원 공지사항 제목 크롤링하기
			// 1) 공지사항 1페이지 크롤링 ----
			/*
			String URL = "http://www.choongang.co.kr/html/sub07_01.php";
			Document doc =  Jsoup.connect(URL).get();
		
			//System.out.println(doc.toString());
			
			// 요소를 개별적으로 접근
			//class="default_title"
			Elements elements = doc.select(".default_title");
			
			  
			 	//for(개별값:전체값)
				//int[] params = {1, 3, 5}
				//for(int param:params)
			
			for(Element element:elements) {
				//System.out.println(element.toString());
				//System.out.println(element.tagName());
				System.out.println(element.text());
			}//for end
			*//////////////////// 
			
			// 2) 공지사항 제목 1~5페이지 크롤링
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
			System.out.println("크롤링 실패");
		}//try end
		
	}//main end

}//class end
