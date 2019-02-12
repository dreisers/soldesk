package oop1123;

public class MethodTest6 {
	public static int abs(int result) {
		return Math.abs(result);   //if(a<0) {
	}//abs e 								//return -a;
												//}else {
												//return a;}
	public static int max(int a, int b, int c) {
		return Math.max(a, Math.max(b, c)); //int m = (a<b) ? b: a;
	}//max e												//m = (m<c) ? c: m;
																//return m;
	public static boolean leap(int y) {
		if(y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
		return true;
		}else {
			return false;
		}
	}//leap e
	public static char ch(char ch) {   // public static boolean isLower(char ch) {
		return ch;								//		boolean flag = flase
	}//ch e											//		if(ch>='a' && ch<='z') {
														//		flag = true;
 
//	public static String str(String str) {
//		return str;
//	}//String e
	public static String toBinary(int a) {
		int[] binary = new int[8];
		int idx = 0;
		while(true) {
			binary[idx] = a%2; 
			a= a/2;
			if(a==1) {
				idx++;
				binary[idx] = a;
				break;
			}
			idx++;
	}
	String str = "";
	for(int i=idx; i>=0; i--) {
		str = str + binary[i];
	}//for e
	return str;
	}
		
	public static void main(String[] args) {
/*
		System.out.println(Character.isLowerCase('r')); //소문자 인지
		System.out.println(Character.isUpperCase('R')); //대문자 인지
		System.out.println(Character.toLowerCase('B')); // 소문자로
		System.out.println(Character.toUpperCase('a')); // 대문자로
		
		System.out.println(Integer.toBinaryString(10)); //2진수
		System.out.println(Integer.toOctalString(10)); //16진수로
		System.out.println(Integer.toHexString(10)); // 10진수
*/		
//		is~
//		to~
//		get~
//		set~

//		문) 절대값을 구하는 함수를 작성하시오
		int result = abs(-3);
		System.out.println(result);
//		문) 세개의 수중에서 최대값을 출력하시오
		int m =max(3, 5, 7);
		System.out.println(m);
//		문) 윤년의 갯수를 구하시오
		int count =0;
		for(int y=1; y<=2018; y++) {
			if(leap(y)) {
				count ++;
			}
		}// for e
		System.out.println(count);
//		문)대소문자 바꿔서 출력
		char ch = 'R';
		if(Character.isUpperCase(ch)) {
			System.out.println(Character.toLowerCase(ch));
		}else if(Character.isLowerCase(ch)) {
			System.out.println(Character.toUpperCase(ch));
		}else {
			System.out.println(ch);
		}
//		문) 2진수로 바꿔서 출력
		String str = toBinary(10);
		System.out.println(str);
		
		//		String str = Integer.toBinaryString(10);
		//		System.out.println(str);
		
		
	}//main e
}// class e
