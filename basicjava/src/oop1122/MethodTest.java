package oop1122;

public class MethodTest {

	public static void test() { //�Լ�����
		System.out.println("JAVA");
		return;  //ȣ���� ������ �ǵ��� ��
	}//test e
	
	public static void test2() {
	
//		test(); �Լ��� ���� ȣ������̴�
//		test2(); �ڽ��� �Լ� ȣ�� �� �� �ִ�. (����� �Լ�ȣ��)
//		main(); ����. main()�Լ��� JVM�� ȣ���Ѵ�.
		
		System.out.println("JSP");
	} //test2 e
	//return; ������ return�� ���� ���� 
	public static void main(String[] args) {
//		�޼ҵ� method 
//		�Լ�, function, procedure, ���
//		�޼ҵ�� : �ѱ� �Ұ���, ù���� ���� �Ұ���
//		               �ǹ̺ο�
//		�ĺ��� : Ŭ������, ������, �޼ҵ��
//		�޼ҵ� �ۼ� : 1) parameter(argument value ���ް�)
//						   2) ���ϰ� ����  -> �� : void
		
//		���� : ������ �޼ҵ��() {}
//		test ������, test() �޼ҵ�
//		�Լ�����, �Լ�ȣ��
		
		test(); //�Լ�ȣ��
		test();
		test();

		test2();
		test2();
	}//main e
}//class e
