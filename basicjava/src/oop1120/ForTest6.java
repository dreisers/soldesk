package oop1120;

public class ForTest6 {

	public static void main(String[] args) {
//			회전수 증가
/*	
 			int a=0, b=0;
			for(a=1; a<=4; a++) {
				for(b=1; b<=a; b++) {
						System.out.print("*");
				}
				System.out.println();
			}
			System.out.println(a+b);
//		 	회전수 감소
		  for(a=4; a>=1; a--) {
			  for(b=1; b<=a; b++) {
				  System.out.print("*");
			  }
			  System.out.println();
		  }
		 System.out.println(a+b);
*/		 
		 
		for(char a='A'; a<='Z'; a++) {
			for(char b='A'; b<=a; b++) {
				System.out.print(b);		
			}
			System.out.println();
		}
		
		for(char a='Z'; a<='a'; a--) {
			for(char b='A'; b<=a; b++) {
				System.out.print(b);		
			}
			System.out.println();
		}
	}//m
}//c
