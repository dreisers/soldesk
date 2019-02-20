package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverTest {

	public static void main(String[] args) {
		// 네이버 극한직업 평점 제목 호감도순 정렬후 1~10페이지 크롤링하기
		try {
			// 1) URL정보
			String URL = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=167651&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page=1";
			String params = "code=167651&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page=1";
			
			int PAGE = 1;

			for (PAGE = 1; PAGE <= 3; PAGE++) {

				Document doc = Jsoup.connect(URL + params + PAGE).get();

				
				//Elements elements = doc.select(" .score_reple p");
				Elements elements = doc.select(".scope_reple");
				//class = ico_viewer 요소 제거하기 
				elements.select(".ico_viewer").remove();

				for (Element element : elements) {
					System.out.println(element.text());
				} // for end
				
				System.out.println("-------------------------------");
			}//for end
				

		} catch (Exception e) {
			System.out.println("크롤링 실패");
			
		}

	}// main end

}// class end
