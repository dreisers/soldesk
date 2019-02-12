package oop1129;
class Korea {
	protected String name = "�ѱ�";
	void disp() {
		System.out.println("Korea...");
	}
}// class e
class Seoul extends Korea{
	String name = "����";
	@Override //�� annotation �ּ�
					// �ٽ� ������
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
		return "�λ�";
	}
}//class e
class Suwon extends Object { //extends Object �������� 
	private String id = "webmaster";
	private String password = "1234";
	@Override
	public String toString() {
		return "Suwon id=" + this.id + ", password=" + this.password + "]";
		}
}//class e

class Incheon extends Korea{
	private String name = "�ֵ���ũ";
	private String addr = "���α� ��ö��";
	@Override
	public String toString() {
		return "Incheon [name=" + name + ", addr=" + addr + "]";
	}
	
}//class e

public class OverrideTest {

	public static void main(String[] args) {
			// Method Overide ������ 
			// �� ��Ӱ��� �޼ҵ忡�� �޼ҵ带 �ٽ� ����(����)
			
			// Method Overload �ߺ����� : �Լ��� �ߺ�
	
		//�������̵� ��
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
		//�ڹ��� �⺻ ��Ű�� : java.lang
		//�ڹ��� �ְ����� Ŭ���� : Object
		//�ڹٿ��� Ŭ���� �����Ҷ� ������
		//ObjectŬ������ ��ӹ޴´�
		Busan busan = new Busan();
		System.out.println(busan.toString());
		System.out.println(busan); //��ü�����ε� ȣ�� ����
		
		Suwon suwon = new Suwon();
		System.out.println(suwon.toString());
		System.out.println(suwon);
	
		Incheon incheon = new Incheon();
		System.out.println(incheon.toString());
		System.out.println(incheon);
		
	}//main e
}// class e
