package crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JobkoreaTest {

	public static void main(String[] args) {
		// ���ڸ��ƿ��� frontend�˻���
		// 3�������� �ִ� ȸ��� ũ�Ѹ� �ϱ�
		try {
			// 1) URL����
			String URL = "http://www.jobkorea.co.kr/Search/AjaxSearchList/?";
			// 2) �˻���
			String KEYWORD = "frontend";
			// 3) ��û������
			 int PAGE = 3;

			// 4) �Ķ����
				String params = "";

				params += "pageType=GI&stext=frontend&pageSize=10&ord=1&IsCoInfoSC=false&IsRecruit=false&page=1&Order=1";

				// 5)HTML ���� ���� ��������
				Document doc = Jsoup.connect(URL + params).get();
				// System.out.println(doc.toString());
				// System.out.println(params);

				/* �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ� */

				// 6) ��Һ� ���� <li>
				// Elements elements = doc.select("li");

				// <ul class=detailList>
				// Elements elements = doc.select(".detailList li");

				// <div class=list>
				// Elements elements = doc.select(".list .detailList li");

				// <article id="smGiList">
				// Elements elements = doc.select("#smGiList .list .detailList li");

				// 7) ��ü �̸���
				Elements elements = doc.select("#smGiList .list .detailList li .corpName .giTitle");

				for (Element element : elements) {
					System.out.println(element.text());
				} // for end
				

		} catch (Exception e) {
			System.out.println("ũ�Ѹ� ����");
		}

	}// main end

}// class end
