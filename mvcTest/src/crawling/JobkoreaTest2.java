package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JobkoreaTest2 {

	public static void main(String[] args) {
		// ���ڸ��ƿ��� frontend�˻���
		// 3�������� �ִ� ȸ��� ũ�Ѹ� �ϱ�
		try {
			// 1) URL����
			String URL = "http://www.jobkorea.co.kr/Search/AjaxSearchList/?";
			// 2) �˻���
			String KEYWORD = "frontend";
			int PAGE = 1;

			// 4) �Ķ����
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
				
				// 5)HTML ���� ���� ��������
				Document doc = Jsoup.connect(URL + params).get();

				// 7) ��ü �̸���
				Elements elements = doc.select("#smGiList .list .detailList li .corpName .giTitle");

				for (Element element : elements) {
					System.out.println(element.text());
				} // for end
			}//for end
				

		} catch (Exception e) {
			System.out.println("ũ�Ѹ� ����");
			
		}

	}// main end

}// class end
