package oop1203;

import oop1203.WebProgram.Language;
import oop1203.WebProgram.Smart;

class WebProgram{ //접근제어 
	String title = "Java Programming";
	class Language {
		String basic = "JAVA, HTML, CSS, JavaScript";
		void display() {
			System.out.println("기초수업 : " + basic);
		}
	} //class e
	class Smart {
		String basic = "Objective-C, JavaOOP, C#";
		void display() {
			System.out.println("기초수업 : " + basic);
		}
	} //class e
	
	void print() {
		Language lang = new Language();
		lang.display();
		Smart sm = new Smart();
		sm.display();
	}
}//class e

class R {	//안드로이드OS 자바
	static class id {
		static String btn ="버튼";
	}
} //class e

public class InnerTest {

	public static void main(String[] args) {
		// inner class 내부클래스
		// 클래스 내부에 선언된 클래스
		WebProgram web = new WebProgram();
		web.print();
		
		/* 에러. 내부클래스는 직접 접근할 수 없다.
		 	Language lang = new Language();
		 	Smart sm = new Smart();
		*/
		 //내부클래스는 외부에서 단계적으로 접근할수는 있다.
		Language lang = new WebProgram().new Language();
		Smart sm = new WebProgram().new Smart();
		
		lang.display();
		sm.display();
		
		System.out.println(R.id.btn);
	
	}//main e
}//class e
