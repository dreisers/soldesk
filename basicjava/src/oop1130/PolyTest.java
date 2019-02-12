package oop1130;

class School {
	public String name = "학교";
	public String addr = "주소";
	
	//기본생성자 생성 → 메뉴 → Source → Generate Constructor
	// → from Superclass 
	public School() {}
	// 메뉴 → Source → Generate Constructor using Field 
	public School(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.addr);
	}
}//class e

class HighSchool extends School {
	public HighSchool() {}
	public HighSchool(String n, String a) {
		//super.name = n;
		//super.addr = a;
		super(n, a);
	}
	
}//class e

class MiddleSchool extends School {

	public MiddleSchool() {}
	public MiddleSchool(String name, String addr) {
		super(name, addr);
	}
	
}//class e
public class PolyTest {

	public static void main(String[] args) {
		// Polymorphism 다형 : 형태가 여러가지
		// 부모 관점에서 클래스(객체)간의 형변환
		//static : 빨리 접근할수있다.(클래스명 ,~~
		//			   연산이 continue 된다(주소 공유)
		// (클래스/인터페이스)상속관계에서의 다형성
/*
		School sch = new School();
		sch.disp();
		HighSchool hs = new HighSchool("자바고등학교", "관철동");
		hs.disp();
		MiddleSchool ms = new MiddleSchool("자바중학교", "인사동");
		ms.disp();
*/		
		//1) 자식클래스가 부모클래스에 대입할 수 잇다.
/*		
		School sch = new HighSchool("자바고등학교", "관철동");
		sch.disp();
		sch = new MiddleSchool("자바중학교", "인사동");
		sch.disp();
		System.out.println(sch.name);
		System.out.println(sch.addr);
*/		
		//2) 부모클래스도 자식클래스에 대입할 수 있다.
		//    단, 자식클래의 모양으로 변환해야 한다.
/*		
 		School school = new School();
		HighSchool hs = new HighSchool();
		MiddleSchool ms = new MiddleSchool();
		
		int a = (int)3.4;
		school = (School)hs;
		school = hs;
		school = (School)ms;
		school = ms;
		
		//hs = school; 에러 
		hs = (HighSchool)school;
*/
		//자바클래스 최고 조상 : Object
		//자바의 모든 클래스는 Object 클래스의 후손이다
		Object obj = new School();
		
	}//main e
}//class e
