package oop1205;

public class PrintFormatTest {

	public static void main(String[] args) {
		//출력 서식
		/*
		 	%d 10진 정수형
		 	%f 실수형
		 	%c 문자형
		 	%s 문자열형
		 	\n 줄바꿈
		 	
		 */
		
//		System.out.printf("출력포맷", 값);
		
		System.out.printf("정수형\n%d %d %d\n",10, 20, 30);
		System.out.printf("#%5d# \n", 3); // 오른쪽 정렬
		System.out.printf("#%-5d# \n", 3);// 왼쪽 정렬
		
		System.out.printf("\n실수형\n%f %f %f \n", 1.2, 3.4, 5.6); 
		System.out.printf("#%6.2f# \n", 7.8);
		System.out.printf("#%-6.2f# \n", 7.8);
		System.out.printf("#%.2f# \n", 7.8);
		
		System.out.printf("\n문자형\n%c %c %c \n", 'S', 'K', 'Y'); 
		System.out.printf("#%5c# \n", 'r');
		System.out.printf("#%-5c# \n", 'R');
		
		System.out.printf("\n문자열형\n%s %s %s \n", "Year", "Month", "Date"); 
		System.out.printf("#%8s# \n", "HAPPY");
		System.out.printf("#%-8s# \n", "HAPPY");
		
		
	}// main e
}// classe 
