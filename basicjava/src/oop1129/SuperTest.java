package oop1129;

import java.util.function.Supplier;

class School {
	String name = "�б�";
	public School() {
		System.out.println("School()...");
	}
}//class e

class MiddleSchool extends School{
	String name = "���б�"; // �ڽ��� ��������� �켱������ ����
	public MiddleSchool() {
		super() ; //�θ� ������ �Լ��� ȣ���ϴ� super()�� �����Ǿ� ����
		System.out.println("MiddleSchool()...");
	}
	public void disp() {
		String name = "�ڹ����б�";
		System.out.println(name);//�ڹ����б�
		System.out.println(this.name);//���б�
		System.out.println(super.name);//�б�
	}
}//class e  
public class SuperTest {

	public static void main(String[] args) {
		// �θ� : super
		// super	: �ڽ�Ŭ������ �θ�Ŭ���� �ʵ忡 �����Ҷ�
		// super()	: �ڽ�Ŭ���� �������Լ��� �θ�Ŭ���� �������Լ� ȣ���Ҷ�
		// this		: �ʵ�� �Ű������� �����ϱ� ���ؼ�
		// this()		: �������Լ��� �ڽ��� �������Լ��� ȣ���Ҷ�		

		//�������Լ� ȣ�����(�θ� �� �ڽ�)
		//School() �� MiddleSchool()
		MiddleSchool ms = new MiddleSchool();
		
		ms.disp();
		
		
	}//main e
}// class e
