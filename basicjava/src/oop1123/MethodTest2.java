package oop1123;

public class MethodTest2 {
	public static void test1() {
		System.out.println("JAVA");
		return;
	}//test1 e
	
	public static void test2(int a) { //�Ű�����
		System.out.println(a);
		
	}//test2 e
	public static void test3(int a, int b) { //�Ű�������
		System.out.println(a);					  //�ڷ�����
		System.out.println(b);					  //������
	}//test3 e											  //���� �Ұ���
	
	public static void test4(double a) { 
		System.out.println(a);
		
	}//test4 e
	
	public static void test5(char a) { 
		System.out.println(a);
		
	}//test5 e
	
	public static void test6(String a) {
		System.out.println(a);
		
	}//test6 e
	
	public static void test7(int a, double b, char c, String d) { //�Ű�����
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}//test7 e
	
	public static void main(String[] args) {
//		�޼ҵ� ����
//		����� ���� �޼ҵ�(user defined)

//		1) parameter(�Ű�����)�� ���� ���
//		���ް�(argument value)�� ����
//		test1();
//		test1();
		
//		2) parameter(�Ű�����)�� �ִ� ���
//		test2(30);
//		test2(50);
//		test2(70);
		
//		3) parameter�� 2�� �̻� �ִ� ���
//		test3(2, 4);
//		test3(6, 5);
//		test3(7, 8);
		
//		test4(5.6);
//		test5('R');
//		test6("HAPPY");
		
		test7(3, 4.5, 'B', "Hello");
		
	}//main e
}// class e
