package oop1130;


class Screen {
	public String getDate() {
		return "";
	}
}//class e

class TypeA extends Screen {
	@Override
	public String getDate() {
		return "보헤미안 랩소디";
	}
}//class e

class TypeB extends Screen {

	@Override
	public String getDate() {
		return "국가 부도의 날";
	}
}//class e
	class Picture {

// 		1) Method Overloading
/*
		public static void dispStar(TypeA ta) {
			System.out.println(ta.getDate());
		}
		public static void dispStar(TypeB tb) {
			System.out.println(tb.getDate());
		}
	
	//2) 다형성
	public static void dispStar(Screen scr) {
		System.out.println(scr.getDate());
		}
*/
	//3) 다형성
	public static void dispStar(Object obj) {
		Screen scr = (Screen) obj;
		System.out.println(scr.getDate());
	}
	
}//class e
public class ObjectTest2 {

	public static void main(String[] args) {
		// 상속관계에서의 다형성
		// Object 클래스 : 자바의 최상위 클래스
		/*
		Screen screen = new TypeA();
		System.out.println(screen.getDate());
		screen = new TypeB();
		System.out.println(screen.getDate());
		*/
		TypeA ta =new TypeA();
		TypeB tb =new TypeB();
		Picture.dispStar(ta);
		Picture.dispStar(tb);
		
		// ta = tb; 에러
		Screen scr = ta;
		tb = (TypeB) scr;
		
	}//main e
}// class e
