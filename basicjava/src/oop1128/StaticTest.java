package oop1128;

class Sawon{
	String sabun;
	String buseo;
	int pay;
	static String COMPANY = "(주)솔데스크"; //static 변수
	static double TAX = 0.03;
	static int Sudang = 10;
}//class e

class Write {
	static void line() {  //static 함수
		System.out.println("-----------------");
	}
}

public class StaticTest {

	public static void main(String[] args) {
			// static 변수, 정적변수, 클래스 변수
			// static 함수
			// static : 클래스명으로 직접 접근가능하다
			//			    클래스명, 변수
			//				클래스명, 함수()
/*		
		//static 변수
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//static 함수
		System.out.println(Math.abs(-3));
		System.out.println(Math.min(5, 7));
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("123"));
		
		System.out.println(Character.toUpperCase('r'));
		System.out.println(String.valueOf(5));
*/
		// static -> 접근, 연산
		Sawon kim = new Sawon();
		System.out.println(kim.COMPANY);
		System.out.println(kim.TAX);
		
		Sawon lee = new Sawon();
		System.out.println(lee.COMPANY);
		System.out.println(lee.TAX);
		
		System.out.println(Sawon.COMPANY);
		System.out.println(Sawon.TAX);
		//static : 메모리 주소가 공유되기 때문에
		//			  할당도 1번, 소멸도 1번
		//static 변수의 연산은 continue 된다.
		kim.Sudang = kim.Sudang + 1;
		System.out.println(kim.Sudang);
		
		lee.Sudang = lee.Sudang + 1;
		System.out.println(lee.Sudang);
		
		Sawon.Sudang =Sawon.Sudang + 1;
		System.out.println(Sawon.Sudang);
		System.out.println(kim.Sudang);
		System.out.println(lee.Sudang);
		
	}//main e
}// class e
