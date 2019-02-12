package oop1130;


interface Parent{ // interface는 추상메소드만
							// 사용할 수 있기 때문에 abstract 생략가능
//	void disp() {} 에러. 일반 메소드는 사용 불가
	abstract void kind(); // 추상메소드
	void breathe(); // abstract 생략가능 
}//interface e

class Son implements Parent{

	@Override
	public void kind() {
		System.out.println("아들");
	}

	@Override
	public void breathe() {
	System.out.println("허파 숨쉬기1");	
	}
	
}//class e
	
class Daughter implements Parent{

	@Override
	public void kind() {
		System.out.println("딸");
	}

	@Override
	public void breathe() {
		System.out.println("허파 숨쉬기2");
	}
	
}//class e
public class InterfaceTest {

	public static void main(String[] args) {
		// interface : 추상메소드로만 구성되어 있다
		// interface는 객체생성할 수 없다.
		// interface의 다형성이 가능하다
		// 추상클래스보다 더 추상화 되어 있다.
		// 클래스입장에서 부모가 클래스 		: extends 확장
		// 							    인터페이스 : implements 구현 
		
		
		
		//에러. 객체 생성 X 
		//Parent parent = new Parent(); 
		Son son = new Son();
		son.kind();
		son.breathe();
		
		Daughter daugh = new Daughter();
		daugh.kind();
		daugh.breathe();
		
		//다형성
		Parent parent = new Son();
		parent.kind();
		parent.breathe();
		
		parent = new Daughter();
		parent.kind();
		parent.breathe();
		
		
		
		
	}//main e
}//class e
