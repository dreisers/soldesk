package oop1203;

public class ExceptionTest {

	public static void main(String[] args) {
		//Exception ����ó��
		//�ڹ�Ŭ���� ����� �߻��ϴ� ����
		//try ~ catch��, throw��, finally
		
		//1)Exception ó������ ���� ���
/*	
		System.out.println(1);
		System.out.println(2/0); 
		System.out.println(3);
*/		
		//2)Exception ó�� �� ���
/*		try {
			System.out.println(1);
			System.out.println(2/0); 
			System.out.println(3);
		}catch(ArithmeticException e) { 
			//���ܰ� �߻��Ǹ� ó���� �ڵ带 �ۼ�
			System.out.println(e);
		}
		System.out.println("END");
*/
		//3)
/*		System.out.println(1);
		try {
			int[] su = new int[3];
			su[3] = 5; 
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
			System.out.println("END");
*/
		//4)
/*		try {
			System.out.println(1);
			int su = Integer.parseInt("SKY");
			System.out.println(2);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}finally { //Exception�� ������� ������ ����
			System.out.println(5);
		}
		System.out.println("END");
*/		
		//5)
/*		try {
			System.out.println(1);
			Integer inte = null;
			int su = 3/inte;
			System.out.println(2);
		}catch(NullPointerException e) {
			System.out.println(e);
		}finally {
			System.out.println(5);
		}
			System.out.println("END");
*/
		//6)
/*		try {
			System.out.println(1);
			System.out.println(2/0);// ����1
			int[] su = new int[3];
			su[3] = 5; // ����2
			
			System.out.println(Integer.parseInt("SKY")); // ����3 
			Integer inte = null;
			System.out.println(7/inte); // ����4
			
			System.out.println(9);
		}catch(ArithmeticException e) {  //1
			System.out.println(e);
		}catch(ArrayIndexOutOfBoundsException e) { // 2
			System.out.println(e);
		}catch(NumberFormatException e) { // 3
			System.out.println(e);
		}catch(NullPointerException e) { // 4
			System.out.println(e);
		}
		System.out.println("END");
*/		
		
		//7)
		try {
			System.out.println(1);
			System.out.println(2/0);// ����1
			int[] su = new int[3];
			su[3] = 5; // ����2
			
			System.out.println(Integer.parseInt("SKY")); // ����3 
			Integer inte = null;
			System.out.println(7/inte); //����4
			
			System.out.println(9);
		}catch(Exception e) {  //������
										 //��� Exception�� �θ� : Exception Ŭ����
			System.out.println(e);
		}
		System.out.println("END");
		
		
		
	}//main e
}//class e
