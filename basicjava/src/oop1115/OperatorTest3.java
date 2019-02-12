package oop1115;

public class OperatorTest3 {

	public static void main(String[] args) {
//			연산자 연습
//		임의의 수가 짝수인가?
/*
		  int a= 4; System.out.println(a%2 == 0); // 문) 해당 년도가 윤년인지? int year = 2018;
		  System.out.println(year%4==0); // 문)임의의 수가 2의 배수이면서 5의 배수인지? int b = 20;
		  System.out.println(b%2==0 && b%5==00); // 문)국어점수가 80~89 사이인지? int kor = 85;
		  System.out.println(kor>=80 && kor<=89);
 */
//		윤년 구하는 공식
/*		int year = 2016;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
*/
//		임의의 문자가 알파벳 R, r 인지?	
		char a = 'R';
		System.out.println((a=='R')||(a=='r'));
//		임의의 수가 2의 배수이거나 3의 배수인지?
		int b = 7;
		System.out.println(b%2==0||b%3==0);
//		임의의 문자가 대문자인지?
		System.out.println(a>='A'&&a<='Z');
//		임의의 수가 3의 배수가 아니라면
		System.out.println(!(a%3==0));
		
		
	}
}