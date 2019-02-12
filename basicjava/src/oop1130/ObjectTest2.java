package oop1130;


class Screen {
	public String getDate() {
		return "";
	}
}//class e

class TypeA extends Screen {
	@Override
	public String getDate() {
		return "����̾� ���ҵ�";
	}
}//class e

class TypeB extends Screen {

	@Override
	public String getDate() {
		return "���� �ε��� ��";
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
	
	//2) ������
	public static void dispStar(Screen scr) {
		System.out.println(scr.getDate());
		}
*/
	//3) ������
	public static void dispStar(Object obj) {
		Screen scr = (Screen) obj;
		System.out.println(scr.getDate());
	}
	
}//class e
public class ObjectTest2 {

	public static void main(String[] args) {
		// ��Ӱ��迡���� ������
		// Object Ŭ���� : �ڹ��� �ֻ��� Ŭ����
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
		
		// ta = tb; ����
		Screen scr = ta;
		tb = (TypeB) scr;
		
	}//main e
}// class e
