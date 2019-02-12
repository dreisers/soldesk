package oop1123;

public class MethodTest2 {
	public static void test1() {
		System.out.println("JAVA");
		return;
	}//test1 e
	
	public static void test2(int a) { //매개변수
		System.out.println(a);
		
	}//test2 e
	public static void test3(int a, int b) { //매개변수의
		System.out.println(a);					  //자료형이
		System.out.println(b);					  //같더라도
	}//test3 e											  //생략 불가능
	
	public static void test4(double a) { 
		System.out.println(a);
		
	}//test4 e
	
	public static void test5(char a) { 
		System.out.println(a);
		
	}//test5 e
	
	public static void test6(String a) {
		System.out.println(a);
		
	}//test6 e
	
	public static void test7(int a, double b, char c, String d) { //매개변수
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}//test7 e
	
	public static void main(String[] args) {
//		메소드 연습
//		사용자 정의 메소드(user defined)

//		1) parameter(매개변수)가 없는 경우
//		전달값(argument value)이 없다
//		test1();
//		test1();
		
//		2) parameter(매개변수)가 있는 경우
//		test2(30);
//		test2(50);
//		test2(70);
		
//		3) parameter가 2개 이상 있는 경우
//		test3(2, 4);
//		test3(6, 5);
//		test3(7, 8);
		
//		test4(5.6);
//		test5('R');
//		test6("HAPPY");
		
		test7(3, 4.5, 'B', "Hello");
		
	}//main e
}// class e
