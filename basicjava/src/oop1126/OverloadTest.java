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
//	에러, 함수의 리턴형은 오버로딩의 대상이 아니다.
	
	public static void main(String[] args) {
		
		// method overloading 메소드 오버로딩(중복정의)
		// 함수이름을 중복해서 사용할 수 있다. 
		// 전제조건 : 매개변수의 자료형이 달라야 한다 
//			             : 매개변수의 갯수가 달라야 한다.
		//	중복재정의 : overriding 상속관계
		
//		print(3);
//		print(2.4);
//		print("JAVA");
		print(5, 7);
		print(2.5, 7.3);
		print("Hello","world");
		
	}//main e
}// class e
