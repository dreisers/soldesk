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
		return "Apple Ŭ���� ��ü ����!!";
	}
}//class e
class PineApple extends Apple {
	public PineApple() {
		//�θ�������Լ� ȣ���ϴ� super() �� �����Ǿ�����
		//super(); 
		System.out.println("PineApple()...");
	}
	@Override
	public String toString() {
		return "PineApple ��ü";
	}
	
}//class e
public class SangsokTest2 {
	public static void main(String[] args) {
		//��Ӱ��迡���� ������ ȣ�� ����
		
		//�θ������() �� �ڽ��� ������() ȣ��
/*		Apple apple = new Apple();
		//Fruit() �� Apple()
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
