package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SoldeskTest {

	public static void main(String[] args) {
		
		try {
			// 솔데스크 공지사항 제목 크롤링하기
			
			String URL = "http://soldesk.com/board/board_bagic/board_list.asp?scrID=0000000173&pageNum=9&subNum=1&ssubNum=1";
			for(int page=1; page<=5; page++) {
				String params = "";
				params += "page=" + page;
				params += "&page=2&bd_num=&act=list&s_string=";
				
				Document doc = Jsoup.connect(URL).get();
				Elements elements = doc.select(".table.t_sty01 .td_left");
				for(Element element:elements) {
					
					System.out.println(element.text());
					//System.out.println(element.toString());
				}//for end
				
			}//for end
			
			
			
		}catch (Exception e) {
			System.out.println("크롤링 실패");
		}//try end
		
	}//main end

}//class end
