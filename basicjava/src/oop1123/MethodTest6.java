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
		System.out.println(Character.isLowerCase('r')); //�ҹ��� ����
		System.out.println(Character.isUpperCase('R')); //�빮�� ����
		System.out.println(Character.toLowerCase('B')); // �ҹ��ڷ�
		System.out.println(Character.toUpperCase('a')); // �빮�ڷ�
		
		System.out.println(Integer.toBinaryString(10)); //2����
		System.out.println(Integer.toOctalString(10)); //16������
		System.out.println(Integer.toHexString(10)); // 10����
*/		
//		is~
//		to~
//		get~
//		set~

//		��) ���밪�� ���ϴ� �Լ��� �ۼ��Ͻÿ�
		int result = abs(-3);
		System.out.println(result);
//		��) ������ ���߿��� �ִ밪�� ����Ͻÿ�
		int m =max(3, 5, 7);
		System.out.println(m);
//		��) ������ ������ ���Ͻÿ�
		int count =0;
		for(int y=1; y<=2018; y++) {
			if(leap(y)) {
				count ++;
			}
		}// for e
		System.out.println(count);
//		��)��ҹ��� �ٲ㼭 ���
		char ch = 'R';
		if(Character.isUpperCase(ch)) {
			System.out.println(Character.toLowerCase(ch));
		}else if(Character.isLowerCase(ch)) {
			System.out.println(Character.toUpperCase(ch));
		}else {
			System.out.println(ch);
		}
//		��) 2������ �ٲ㼭 ���
		String str = toBinary(10);
		System.out.println(str);
		
		//		String str = Integer.toBinaryString(10);
		//		System.out.println(str);
		
		
	}//main e
}// class e
