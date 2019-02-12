package oop1119;

public class BreakTest {

	public static void main(String[] args) {
//		break 문      : 반복문 탈출
//		continue 문 : 반복문 계속
		for(int a=1; a<10; a++) {
		if(a==5) break;
		System.out.print(a);
		}
	 	System.out.println();
	 	
	 	for(int a=1; a<10; a++) {
	 		if(a==5) continue;
	 		System.out.print(a);
	 		}
	
		
	}//m
}//c
