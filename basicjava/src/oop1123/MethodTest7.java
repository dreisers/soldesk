package oop1123;

public class MethodTest7 {
		public static void test(){
			test(); //����Լ�
//			main(); ����ڰ� ȣ���Ҽ� ����.
		}//test e
		public static int fact(int a) {
			if(a==0) {
				return 1;
			}else {
				return a*fact(a-1);
			}
		}//fact e
	public static void main(String[] args) {
//		����� �Լ� ȣ��
//		�ڽ��� �ڽ��� �Լ� ȣ��
		
		int result = fact(4);
		System.out.println(result);
		
	}//main e
}// class e
