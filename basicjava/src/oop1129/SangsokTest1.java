package oop1129;

class AA {
	private void zero() { //private �Ӽ��� ��ӺҰ�
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
//Ŭ������ ���ϻ�Ӹ� �����ϴ�
//class FF extends DD, EE  ���߻�� 

public class SangsokTest1 {

	public static void main(String[] args) {
		// ��� : ��Ȱ��
		// Ŭ������ ���
		// extends ���, Ȯ��
		// �������� :	�θ�, ����, super
		// 				�ڽ�, �ļ�, sub, �Ļ�
		// super class �θ�Ŭ����
		// sub class    �ڽ�Ŭ����(�Ļ�)
/*		
		AA aa = new AA();
		//aa.zero() �� private�Ӽ��� Ŭ�������ο����� ���� ����
		aa.one();
		aa.two();
		
		BB bb = new BB();
		bb .three();
		bb.one();
		bb.two();
		//bb.zero(); ����
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
