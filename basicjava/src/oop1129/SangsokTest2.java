package oop1129;

class Fruit {
	public Fruit() {
		System.out.println("Fruit()...");
	}
}//class e
class Apple extends Fruit {
	public Apple() {
		System.out.println("Apple()...");
	}
	
	@Override
	public String toString() {
		return "Apple 클래스 객체 생성!!";
	}
}//class e
class PineApple extends Apple {
	public PineApple() {
		//부모생성자함수 호출하는 super() 가 생략되어있음
		//super(); 
		System.out.println("PineApple()...");
	}
	@Override
	public String toString() {
		return "PineApple 객체";
	}
	
}//class e
public class SangsokTest2 {
	public static void main(String[] args) {
		//상속관계에서의 생성자 호출 순서
		
		//부모생성자() → 자신의 생성자() 호출
/*		Apple apple = new Apple();
		//Fruit() → Apple()
		System.out.println(apple.toString());
		System.out.println(apple);
*/		
		
		PineApple pine = new PineApple();
		
/*		
		int a =3;
		System.out.println(a);
		System.out.println(pine);
*/		
		
	}//main e
}// class e
