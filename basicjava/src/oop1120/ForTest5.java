package oop1120;

public class ForTest5 {

	public static void main(String[] args) {
			//이중 반복문
//			for(){
//				for(){
//			}
/*
			int a=0, b=0;
			for(a=1; a<=2; a++) {
				System.out.println("JAVA");
				for(b=1; b<=3; b++) {
					System.out.println("JSP");
				}
			}
		System.out.println(a+b);
*/		
//		문) 구구단 2단 ~ 9단 출력
//												구구단 4단씩 출력해보기
//		int a=0, b=0, c=0;
//		for(a=2; a<=9; a++) {
//			System.out.println("**"+a+"단"+"**");
//			for(b=1; b<=9; b++) {
//			System.out.println(a + "*" + b + "=" + (a*b));
//			}
//		}
/*
		int a=0, b=0;
		for(a=1; a<=4; a++) {
			for(b=1; b<=4; b++) {
				System.out.print("*");
			} 
			System.out.println();
		}
*/		
//		문)
		
		for(int a=1; a<=4; a++) {
			for(int b=1; b<=4; b++) {
				if(a==b) {
					System.out.print("@");
				}else {
					System.out.print("#"); 
				}
			}
			System.out.println();
		}
		
//		문) 12345       
/*			 23456
			 34567
			 45678
*/		     
		for(int a=1; a<=5; a++) {
			for(int b=a; b<=a+4; b++) {
				System.out.print(b);
			}
			System.out.println();
			}
		
		
		
		
		
	}//m
}//c
