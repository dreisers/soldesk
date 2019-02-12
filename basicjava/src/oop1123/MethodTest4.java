package oop1123;

public class MethodTest4 {
	public static int test1(int a, int b) {
		int hap = a+b;
		return hap; //리턴값은 오로지 1개만 올수있다.
	}//test1 e
	
	public static double test2(double a, double b) {
		return a+b;
	}//test2 e
	
	public static char test3(char ch) {
		return (char)(ch+32);
	}//test3 e
	public static String test4(String a, String b) {
		return a+b;
	}//test4 e
	public static void main(String[] args) {
//		리턴값이 있는 경우 (리턴형)
//		리턴값이 없다 void
		int result = test1(3, 5);
		System.out.println(result);
		double sum = test2(3.4, 5.6);
		System.out.println(sum);
		System.out.println(test3('R'));
		String str = test4("Hello", "World");
		System.out.println(str);
	}//main e
}// class e
