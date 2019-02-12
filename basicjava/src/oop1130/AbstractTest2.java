package oop1130;

abstract class Travel { //추상클래스
	public void line() {}
	abstract public String travelWhere(); //추상메소드
}//class e
class Atype extends Travel {

	@Override
	public String travelWhere() {
		return "제주도 올레길";
	}
	
}//class e
class Btype extends Travel {

	@Override
	public String travelWhere() {
		return "여의도 불꽃축제";
	}
	
}//class e
class Ctype extends Travel {

	@Override
	public String travelWhere() {
		return "진해 군항제";
	}
	
}//class e
public class AbstractTest2 {

	public static void main(String[] args) {
		
		
		// 추상클래스는 객체 생성 불가능
		// Travel tour = new Travel(); 에러
		
		//추상클래스에서의 다형성
		Travel tour = new Atype();
		System.out.println(tour.travelWhere());
		
		tour = new Btype();
		System.out.println(tour.travelWhere());
		
		tour = new Ctype();
		System.out.println(tour.travelWhere());
		
	}//main e
}// class e
