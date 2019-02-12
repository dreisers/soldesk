package oop1127;

import java.lang.*; //자바의 기본 패키지
							  //생략 가능

public class WrapperTest {

	public static void main(String[] args) {
		// Wrapper 클래스
		// 기본형 타입을 객체화할 수 있는 클래스
		// boolean, byte, short, int, long, float, double, char 
		// Boolean, Byte, Short, Integer, Long, Float, Double, Character
/*	
		boolean flag = true; //기본형
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("false");
		
		//flag. 에러
		System.out.println(b1.toString()); //"true"
		System.out.println(b2.toString()); // "false"

		
		byte b = 1;
		Byte b1 = new Byte(b);
		Byte b2 = new Byte("5");
		System.out.println(b);
		System.out.println(b1.longValue());
		System.out.println(b2.doubleValue());
		
		int i =3;
		Integer i1 = new Integer(5);
		Integer i2 = new Integer("7");
		System.out.println(i);
		System.out.println(i1.toString()); //"5"
		System.out.println(i2.byteValue());
		
	
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE); 
		System.out.println(Integer.parseInt("9"));
		System.out.println(Integer.valueOf(5)); // -> 5 -> new Interger(5)
		
		double d =1.2;
		Double d1 = new Double(3.4);
		Double d2 = new Double("5.6");
		//문) 세개의 실수형값 중에서 정수만 모두 더하시오
		int hap = (int)d + d1.intValue() + d2.intValue(); 
		System.out.println(hap);

		char c = 'R';
		Character c1 = new Character('B');
		System.out.println(c);
		System.out.println(c1.toString()); // 'B' -> "B"
		
		//static			: 클래스명.field
		//					  클래스명.method
		//method명	: 접두어 is~~
		//								to~~
		//								get~~
		//								set~~
									  
		
		
		System.out.println(Character.isWhitespace(' '));
		System.out.println(Character.isDigit('8'));
		System.out.println(Character.isDigit('#'));
		System.out.println(Character.isUpperCase('R'));
		System.out.println(Character.isLowerCase('R'));
		
		System.out.println(Character.toUpperCase('a'));
		System.out.println(Character.toLowerCase('A'));
*/		
		//문) 대소문자를 서로 바꿔서 출력하시오
//				(단, Character클래스의 메소드를 이용)
		char[] ch = {'h', 'a','p','p','y'};
		int size = ch.length;
		for(int idx=0; idx<size; idx++) {
			char c = ch[idx];
			if(Character.isUpperCase(c)) {
				System.out.println(Character.toLowerCase(c));
			}else if(Character.isLowerCase(c)) {
				System.out.println(Character.toUpperCase(c));
			}else {
				System.out.println(c);
			}
		}//for e
	}//main e
}// class e
