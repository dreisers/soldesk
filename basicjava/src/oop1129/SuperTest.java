package oop1129;

import java.util.function.Supplier;

class School {
	String name = "학교";
	public School() {
		System.out.println("School()...");
	}
}//class e

class MiddleSchool extends School{
	String name = "중학교"; // 자신의 멤버변수가 우선순위가 높다
	public MiddleSchool() {
		super() ; //부모 생성자 함수를 호출하는 super()가 생략되어 있음
		System.out.println("MiddleSchool()...");
	}
	public void disp() {
		String name = "자바중학교";
		System.out.println(name);//자바중학교
		System.out.println(this.name);//중학교
		System.out.println(super.name);//학교
	}
}//class e  
public class SuperTest {

	public static void main(String[] args) {
		// 부모 : super
		// super	: 자식클래스가 부모클래스 필드에 접근할때
		// super()	: 자식클래스 생성자함수가 부모클래스 생성자함수 호출할때
		// this		: 필드와 매개변수를 구분하기 위해서
		// this()		: 생성자함수가 자신의 생성자함수를 호출할때		

		//생성자함수 호출순서(부모 → 자식)
		//School() → MiddleSchool()
		MiddleSchool ms = new MiddleSchool();
		
		ms.disp();
		
		
	}//main e
}// class e
