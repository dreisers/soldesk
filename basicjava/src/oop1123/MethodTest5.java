package oop1123;

public class MethodTest5 {
	
	public static void test1(String a, String b) {
		System.out.println(a);
		System.out.println(b);
	}//test1 e
	public static void test2(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}//test2 e
	public static void test3(double a, double b) {
		System.out.println(a);
		System.out.println(b);
	}//test3 e
	public static void test4(char a, char b) {
		System.out.println(a);
		System.out.println(b);
	}//test4 e
	
	public static void test5(String[] a) {
		for(int idx=0; idx<a.length; idx++) {
			System.out.println(a[idx]);
		}
	}//test5 e
	public static void test6(int[] a) {
		for(int idx=0; idx<a.length; idx++){
		System.out.println(a[idx]);
		}
	}//test6 e
	public static void test7(double[] a) {
		for(int idx=0; idx<a.length; idx++){
		System.out.println(a[idx]);
		}
	}//test7 e
	public static void test8(char[] a) {
		for(int idx=0; idx<a.length; idx++){
		System.out.println(a[idx]);
		}
	}//test8 e
	
	public static void test9(char a, char b) {
		System.out.println(a);
		System.out.println(b);
	}//test9 e
	public static void test10(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}//test10 e
	public static void test11(char[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}//test11 e
	public static void test12(int[][] a) {
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]);
			}
		}
	}//test12 e
	
	public static void main(String[] args) {
//		전달값이 배열!
/*		
  		String[] name = {"홍길동", "무궁화", "라일락"};
		int[] kor = {10,30,50};
		double[] aver = {1.2, 3.4, 5.6};
		char[] word = {'S', 'K', 'Y'};
		
//		함수 호출 방식
//		1) Call By Value (값에 의한 호출)
		test1(name[0], name[2]);
		test2(kor[0], kor[2]);
		test3(aver[0], aver[2]);
		test4(word[0], word[2]);
		
//		2) Call By Reference (참조에 의한 호출)	
		test5(name);
		test6(kor);
		test7(aver);
		test8(word);
		*/
	
		char[][] ch = { {'H','E','L','L','O'},
							 {'H','A','P','P','Y'} };
		int[][] su = { {10, 20, 30},
						   {40, 50, 60} };
		
		test9(ch[0][0],ch[1][4]); // call by value
		test10(su[0][0], su[1][2]); // call by value
		test11(ch); // call by reference
		test12(su); // call by reference
		
		
		
	}//main e
}// class e
