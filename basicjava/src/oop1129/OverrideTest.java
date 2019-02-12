package oop1129;
class Korea {
	protected String name = "한국";
	void disp() {
		System.out.println("Korea...");
	}
}// class e
class Seoul extends Korea{
	String name = "서울";
	@Override //← annotation 주석
					// 다시 재정의
	void disp() {
		System.out.println("Seoul...");
	}
}//class e
class Jeju extends Korea{
	@Override
	void disp() {
		System.out.println("Jeju...");
	}
}//class e

class Busan extends Korea {
	@Override
	public String toString() {
		return "부산";
	}
}//class e
class Suwon extends Object { //extends Object 생략가능 
	private String id = "webmaster";
	private String password = "1234";
	@Override
	public String toString() {
		return "Suwon id=" + this.id + ", password=" + this.password + "]";
		}
}//class e

class Incheon extends Korea{
	private String name = "솔데스크";
	private String addr = "종로구 관철동";
	@Override
	public String toString() {
		return "Incheon [name=" + name + ", addr=" + addr + "]";
	}
	
}//class e

public class OverrideTest {

	public static void main(String[] args) {
			// Method Overide 재정의 
			// → 상속관계 메소드에서 메소드를 다시 수정(리폼)
			
			// Method Overload 중복정의 : 함수명 중복
	
		//오버라이딩 전
/*
		Seoul seoul = new Seoul();
		System.out.println(seoul.name);
		seoul.disp();
*/				
/*		
		Seoul seoul = new Seoul();
		System.out.println(seoul.name);
		seoul.disp();
		
		Jeju jeju = new Jeju();
		System.out.println(jeju.name);
		jeju.disp();
*/	
		//자바의 기본 패키지 : java.lang
		//자바의 최고조상 클래서 : Object
		//자바에서 클래스 생성할때 무조건
		//Object클래스를 상속받는다
		Busan busan = new Busan();
		System.out.println(busan.toString());
		System.out.println(busan); //객체명으로도 호출 가능
		
		Suwon suwon = new Suwon();
		System.out.println(suwon.toString());
		System.out.println(suwon);
	
		Incheon incheon = new Incheon();
		System.out.println(incheon.toString());
		System.out.println(incheon);
		
	}//main e
}// class e
