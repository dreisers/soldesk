package oop1128;

import java.util.Calendar;
/*
final class Animal { //����Ŭ����
							  //��ӵ��� ���� 
							  //�ڽ�Ŭ������ ���� �� ����.
							  //�θ�Ŭ������ �� �� ����.
}//class e

class Elephant extends Animal {} 
//���� final class�� ��ӹ��� �� ����
*/
class Animal{
	public void eat() {}
	public final void breathe() {}
}//class e

class Elephant extends Animal {
	@Override //-> ����(��ӹ��� Ŭ������ ������ �� �ִ�)
	public void eat() {
	}
//	@Override // -> �Լ��� final�� ������ ��ӹ��� Ŭ������ ������ �� ����.
//	public void breathe() {} ���� 
}//class e

public class FinalTest {
	
	public static void main(String[] args) {
		// final ����, �Լ�, Ŭ����
		// final
		int a =3;
		a =5;
		final int b =2; //������ ���ȭ
		System.out.println(Calendar.HOUR);
		//public static final HOUR = 10
		
	}//main e
}// class e
