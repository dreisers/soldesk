package oop1126;

public class OverloadTest {
	public static void print(int a) {
		System.out.println(a);
	}//print e
		
	public static void print(double a) {
		System.out.println(a);
	}//print e
	public static void print(String a) {
		System.out.println(a);
	}//print e
	public static void print(int a, int b) {
		System.out.println(a+b);
	}//print e
	public static void print(double a, double b) {
		System.out.println(a+b);
	}//print e
	public static void print(String a, String b) {
		System.out.println(a+b);
	}//print e
	
//	public static String print(String a, String b) {} 
//	����, �Լ��� �������� �����ε��� ����� �ƴϴ�.
	
	public static void main(String[] args) {
		
		// method overloading �޼ҵ� �����ε�(�ߺ�����)
		// �Լ��̸��� �ߺ��ؼ� ����� �� �ִ�. 
		// �������� : �Ű������� �ڷ����� �޶�� �Ѵ� 
//			             : �Ű������� ������ �޶�� �Ѵ�.
		//	�ߺ������� : overriding ��Ӱ���
		
//		print(3);
//		print(2.4);
//		print("JAVA");
		print(5, 7);
		print(2.5, 7.3);
		print("Hello","world");
		
	}//main e
}// class e
