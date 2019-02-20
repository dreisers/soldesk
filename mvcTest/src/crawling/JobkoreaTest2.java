package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JobkoreaTest2 {

	public static void main(String[] args) {
		// 잡코리아에서 frontend검색후
		// 3페이지에 있는 회사명 크롤링 하기
		try {
			// 1) URL정보
			String URL = "http://www.jobkorea.co.kr/Search/AjaxSearchList/?";
			// 2) 검색어
			String KEYWORD = "frontend";
			int PAGE = 1;

			// 4) 파라미터
			for (PAGE = 1; PAGE <= 3; PAGE++) {
				String params = "";
				params += "pageType=GI";
				params += "&stext=" + KEYWORD;
				params += "pageSize=10";
				params += "&ord=1";
				params += "&IsCoInfoSC=false";
				params += "&IsRecruit=false";
				params += "&page=" + PAGE;
				params += "&Order=1";
				
				// 5)HTML 문서 내용 가져오기
				Document doc = Jsoup.connect(URL + params).get();

				// 7) 업체 이름만
				Elements elements = doc.select("#smGiList .list .detailList li .corpName .giTitle");

				for (Element element : elements) {
					System.out.println(element.text());
				} // for end
			}//for end
				

		} catch (Exception e) {
			System.out.println("크롤링 실패");
			
		}

	}// main end

}// class end
