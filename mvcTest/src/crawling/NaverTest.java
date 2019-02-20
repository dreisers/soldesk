package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class NaverTest {

	public static void main(String[] args) {
		// ���̹� �������� ���� ���� ȣ������ ������ 1~10������ ũ�Ѹ��ϱ�
		try {
			// 1) URL����
			String URL = "https://movie.naver.com/movie/bi/mi/pointWriteFormList.nhn?code=167651&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page=1";
			String params = "code=167651&type=after&isActualPointWriteExecute=false&isMileageSubscriptionAlready=false&isMileageSubscriptionReject=false&page=1";
			
			int PAGE = 1;

			for (PAGE = 1; PAGE <= 3; PAGE++) {

				Document doc = Jsoup.connect(URL + params + PAGE).get();

				
				//Elements elements = doc.select(" .score_reple p");
				Elements elements = doc.select(".scope_reple");
				//class = ico_viewer ��� �����ϱ� 
				elements.select(".ico_viewer").remove();

				for (Element element : elements) {
					System.out.println(element.text());
				} // for end
				
				System.out.println("-------------------------------");
			}//for end
				

		} catch (Exception e) {
			System.out.println("ũ�Ѹ� ����");
			
		}

	}// main end

}// class end
