package oop1128;

import java.util.Calendar;
/*
final class Animal { //종단클래스
							  //상속되지 않음 
							  //자식클래스를 만들 수 없다.
							  //부모클래스가 될 수 없다.
}//class e

class Elephant extends Animal {} 
//에러 final class를 상속받을 수 없다
*/
class Animal{
	public void eat() {}
	public final void breathe() {}
}//class e

class Elephant extends Animal {
	@Override //-> 리폼(상속받은 클래스를 수정할 수 있다)
	public void eat() {
	}
//	@Override // -> 함수에 final이 붙으면 상속받은 클래스를 수정할 수 없다.
//	public void breathe() {} 에러 
}//class e

public class FinalTest {
	
	public static void main(String[] args) {
		// final 변수, 함수, 클래스
		// final
		int a =3;
		a =5;
		final int b =2; //변수를 상수화
		System.out.println(Calendar.HOUR);
		//public static final HOUR = 10
		
	}//main e
}// class e
