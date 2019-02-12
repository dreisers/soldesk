package oop1203;

import oop1203.WebProgram.Language;
import oop1203.WebProgram.Smart;

class WebProgram{ //�������� 
	String title = "Java Programming";
	class Language {
		String basic = "JAVA, HTML, CSS, JavaScript";
		void display() {
			System.out.println("���ʼ��� : " + basic);
		}
	} //class e
	class Smart {
		String basic = "Objective-C, JavaOOP, C#";
		void display() {
			System.out.println("���ʼ��� : " + basic);
		}
	} //class e
	
	void print() {
		Language lang = new Language();
		lang.display();
		Smart sm = new Smart();
		sm.display();
	}
}//class e

class R {	//�ȵ���̵�OS �ڹ�
	static class id {
		static String btn ="��ư";
	}
} //class e

public class InnerTest {

	public static void main(String[] args) {
		// inner class ����Ŭ����
		// Ŭ���� ���ο� ����� Ŭ����
		WebProgram web = new WebProgram();
		web.print();
		
		/* ����. ����Ŭ������ ���� ������ �� ����.
		 	Language lang = new Language();
		 	Smart sm = new Smart();
		*/
		 //����Ŭ������ �ܺο��� �ܰ������� �����Ҽ��� �ִ�.
		Language lang = new WebProgram().new Language();
		Smart sm = new WebProgram().new Smart();
		
		lang.display();
		sm.display();
		
		System.out.println(R.id.btn);
	
	}//main e
}//class e
