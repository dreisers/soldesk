package oop1121;

public class MathTest {

	public static void main(String[] args) {
//		Math 수학관련 클래스
	
//		절대값
		System.out.println(Math.abs(-3));
		System.out.println(Math.abs(5));
		
//		큰값	
		System.out.println(Math.max(3, 5));
		
//		작은값
		System.out.println(Math.min(2, 4));
		System.out.println(Math.max(2, Math.max(8, 9)));
		System.out.println(Math.ceil(2.4));
		System.out.println(Math.floor(2.7));
		System.out.println(Math.round(3.8));
		System.out.println(Math.PI);
		
//		난수, random값 : 시스템이 발생시킨 수
//		System.out.println(Math.random());
		System.out.println((int)(Math.random()*2)); // 0 1
		
	}
}
