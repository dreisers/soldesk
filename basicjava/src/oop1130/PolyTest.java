package oop1130;

class School {
	public String name = "�б�";
	public String addr = "�ּ�";
	
	//�⺻������ ���� �� �޴� �� Source �� Generate Constructor
	// �� from Superclass 
	public School() {}
	// �޴� �� Source �� Generate Constructor using Field 
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
		// Polymorphism ���� : ���°� ��������
		// �θ� �������� Ŭ����(��ü)���� ����ȯ
		//static : ���� �����Ҽ��ִ�.(Ŭ������ ,~~
		//			   ������ continue �ȴ�(�ּ� ����)
		// (Ŭ����/�������̽�)��Ӱ��迡���� ������
/*
		School sch = new School();
		sch.disp();
		HighSchool hs = new HighSchool("�ڹٰ���б�", "��ö��");
		hs.disp();
		MiddleSchool ms = new MiddleSchool("�ڹ����б�", "�λ絿");
		ms.disp();
*/		
		//1) �ڽ�Ŭ������ �θ�Ŭ������ ������ �� �մ�.
/*		
		School sch = new HighSchool("�ڹٰ���б�", "��ö��");
		sch.disp();
		sch = new MiddleSchool("�ڹ����б�", "�λ絿");
		sch.disp();
		System.out.println(sch.name);
		System.out.println(sch.addr);
*/		
		//2) �θ�Ŭ������ �ڽ�Ŭ������ ������ �� �ִ�.
		//    ��, �ڽ�Ŭ���� ������� ��ȯ�ؾ� �Ѵ�.
/*		
 		School school = new School();
		HighSchool hs = new HighSchool();
		MiddleSchool ms = new MiddleSchool();
		
		int a = (int)3.4;
		school = (School)hs;
		school = hs;
		school = (School)ms;
		school = ms;
		
		//hs = school; ���� 
		hs = (HighSchool)school;
*/
		//�ڹ�Ŭ���� �ְ� ���� : Object
		//�ڹ��� ��� Ŭ������ Object Ŭ������ �ļ��̴�
		Object obj = new School();
		
	}//main e
}//class e
