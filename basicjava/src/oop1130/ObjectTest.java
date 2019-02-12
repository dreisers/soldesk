package oop1130;

class Print {
	//method overloding : 매개변수의 자료형, 갯수
	//static : 클래스명으로 직접 접근 가능, 연산 continue
	/*
	public static void view(Integer a) {
		System.out.println(a.toString());
	}
	public static void view(Double a) {
		System.out.println(a.toString());
	}
	public static void view(String a) {
		System.out.println(a.toString());
	}
*/
	public static void view(Object obj) {
		System.out.println(obj.toString());
	}
	public static Integer disp() {
		return new Integer(7);
	}
	public static Double disp2() {
		return 3.4;	//autoboxing 자동으로 참조형으로 변환
	}
	public static Object disp3() { // 다형성
		return new Integer(9);
	}
	public static Object disp4() {
		return new Double(8.7);
		}
	public static Object disp5() {
		return "SOLEDESK"; //autoboxing 
		}
}//class e
public class ObjectTest {

	public static void main(String[] args) {
			/* Object 클래스
			 	자바클래스 최고 조상 : Object
			 	자바의 모든 클래스는 Object클래스의 후손이다.
			 	자바의 모든 클래스는 Object클래스에 대입가능하다
			 	다형성 
			 */
/*		
			Integer inte = new Integer(3);
			System.out.println(inte);
			System.out.println(inte.toString());
			
			String str = new String("Happy");
			System.out.println(str);
			System.out.println(str.toString());
			
			Object object = new Integer(5);
			System.out.println(object.toString());
			System.out.println(object);
			
			object = new String("Apple");
			System.out.println(object.toString());
			System.out.println(object);
			
			int a = (int)3.4;
			String name = (String)object;
			System.out.println(name.toString());
			System.out.println(name);
*/			
		//1) 메소드와 관련한 Object 클래스
/*			
			Print.view(3); 			 // autoboxing 
			Print.view(3.4);			// 기본형이 전달되면 
			Print.view("Happy"); // 자동으로 참조형이 된다.
		
			Print.view(new Integer(6));
			Print.view(new Double(7.8));
			Print.view(new String("Apple"));
*/			
		//2) 메소드의 리턴형이 Object 클래스
		Object obj = Print.disp3();
		System.out.println(obj.toString()); 
		System.out.println(obj); 
		Print.disp3();
		Integer inte = (Integer) Print.disp3();
		
		Double dou = (Double) Print.disp4();
		
		String str = (String) Print.disp5();
		
		System.out.println(inte.toString());
		System.out.println(dou.toString());
		System.out.println(str.toString());
		
	}//main e
}// class e
