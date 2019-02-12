package oop1129;

class AA {
	private void zero() { //private 속성은 상속불가
		System.out.println("zero()...");
	}
	public void one() {
		System.out.println("one");
	}
	public void two() {
		System.out.println("two");
	}
}//c AA e

class BB extends AA {
	public void three() {
		System.out.println("three()...");
	}
}// c BB e

class CC extends AA {
	public void four() {
		System.out.println("four()...");
	}
}// c CC e
class DD extends CC {
	public void five() {
		System.out.println("five()...");
	}
}// c DD e
class EE {}//c EE e
//클래스는 단일상속만 가능하다
//class FF extends DD, EE  다중상속 

public class SangsokTest1 {

	public static void main(String[] args) {
		// 상속 : 재활용
		// 클래스의 상속
		// extends 상속, 확장
		// 계층구조 :	부모, 조상, super
		// 				자식, 후손, sub, 파생
		// super class 부모클래스
		// sub class    자식클래스(파생)
/*		
		AA aa = new AA();
		//aa.zero() → private속성은 클래스내부에서만 접근 가능
		aa.one();
		aa.two();
		
		BB bb = new BB();
		bb .three();
		bb.one();
		bb.two();
		//bb.zero(); 에러
*/		
		CC cc= new CC();
		cc.four();
		cc.one();
		cc.two();
		
		DD dd = new DD();
		dd.five();
		dd.four();
		dd.one();
		dd.two();
		
		
		
	}//main e
}// class e
