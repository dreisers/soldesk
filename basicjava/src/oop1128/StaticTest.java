package oop1128;

class Sawon{
	String sabun;
	String buseo;
	int pay;
	static String COMPANY = "(��)�ֵ���ũ"; //static ����
	static double TAX = 0.03;
	static int Sudang = 10;
}//class e

class Write {
	static void line() {  //static �Լ�
		System.out.println("-----------------");
	}
}

public class StaticTest {

	public static void main(String[] args) {
			// static ����, ��������, Ŭ���� ����
			// static �Լ�
			// static : Ŭ���������� ���� ���ٰ����ϴ�
			//			    Ŭ������, ����
			//				Ŭ������, �Լ�()
/*		
		//static ����
		System.out.println(Math.PI);
		System.out.println(Math.E);
		//static �Լ�
		System.out.println(Math.abs(-3));
		System.out.println(Math.min(5, 7));
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.parseInt("123"));
		
		System.out.println(Character.toUpperCase('r'));
		System.out.println(String.valueOf(5));
*/
		// static -> ����, ����
		Sawon kim = new Sawon();
		System.out.println(kim.COMPANY);
		System.out.println(kim.TAX);
		
		Sawon lee = new Sawon();
		System.out.println(lee.COMPANY);
		System.out.println(lee.TAX);
		
		System.out.println(Sawon.COMPANY);
		System.out.println(Sawon.TAX);
		//static : �޸� �ּҰ� �����Ǳ� ������
		//			  �Ҵ絵 1��, �Ҹ굵 1��
		//static ������ ������ continue �ȴ�.
		kim.Sudang = kim.Sudang + 1;
		System.out.println(kim.Sudang);
		
		lee.Sudang = lee.Sudang + 1;
		System.out.println(lee.Sudang);
		
		Sawon.Sudang =Sawon.Sudang + 1;
		System.out.println(Sawon.Sudang);
		System.out.println(kim.Sudang);
		System.out.println(lee.Sudang);
		
	}//main e
}// class e
