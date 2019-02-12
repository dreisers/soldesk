package oop1126;

public class IntegerTest {

	public static void main(String[] args) {
//		Integer 클래스
/*
		System.out.println(Integer.toBinaryString(13));
		System.out.println(Integer.toOctalString(13));
		System.out.println(Integer.toHexString(13));
		
		System.out.println(Integer.max(3, 5));
		System.out.println(Integer.min(3, 5));
		System.out.println(Integer.sum(3, 5));
*/		
		System.out.println(Integer.parseInt("3")+5); 
									// Integer.parseInt 형변환 함수
//		System.out.println((int)"3"); 에러
		System.out.println(Integer.parseInt("3")+ Integer.parseInt("5"));

	}//main e
}// class e
