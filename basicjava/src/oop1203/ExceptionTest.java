package oop1203;

public class ExceptionTest {

	public static void main(String[] args) {
		//Exception 예외처리
		//자바클래스 실행시 발생하는 오류
		//try ~ catch문, throw문, finally
		
		//1)Exception 처리하지 않은 경우
/*	
		System.out.println(1);
		System.out.println(2/0); 
		System.out.println(3);
*/		
		//2)Exception 처리 한 경우
/*		try {
			System.out.println(1);
			System.out.println(2/0); 
			System.out.println(3);
		}catch(ArithmeticException e) { 
			//예외가 발생되면 처리할 코드를 작성
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
		}finally { //Exception과 상관없이 무조건 실행
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
			System.out.println(2/0);// 에러1
			int[] su = new int[3];
			su[3] = 5; // 에러2
			
			System.out.println(Integer.parseInt("SKY")); // 에러3 
			Integer inte = null;
			System.out.println(7/inte); // 에러4
			
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
			System.out.println(2/0);// 에러1
			int[] su = new int[3];
			su[3] = 5; // 에러2
			
			System.out.println(Integer.parseInt("SKY")); // 에러3 
			Integer inte = null;
			System.out.println(7/inte); //에러4
			
			System.out.println(9);
		}catch(Exception e) {  //다형성
										 //모든 Exception의 부모 : Exception 클래스
			System.out.println(e);
		}
		System.out.println("END");
		
		
		
	}//main e
}//class e
