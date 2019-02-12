package oop1120;

public class WhileTest {

	public static void main(String[] args) {
//			while(조건) {}  먼저 조건 비교
//		 	do~while  나중에 조건 비교
//			초기값이 false일경우 while과 do~while은 차이가 있다.
//			do~while문은 조건과 상관없이 무조건 1번은 수행된다.
/*		int a = 3;
		while(a<=5) {
			System.out.println("JAVA");
			a++;
		}
*/	
/*
		int b = 3;
		do {
			System.out.println("JSP");
			b++;
		}while(b<=5);

		int a=3;
		while(a<1) {
			System.out.println("JAVA");
			a++;
		}
		int b=3;
		do {
			System.out.println("JSP");
			b++;
		}while(b<1);
		
//		무한 loop 
//		for(;;){}	
		int a=1;
		while(true) {
			System.out.println("JAVA");
			a++;
			if(a==5) break;}
		
//		문) 1~1000까지 누적합을 구하는데 합이 10000이 넘으면
//		결과를 출력하고 프로그램 종료
		int a=1, hap=0;
		while(a<=1000) {
		hap= hap + a;
		if(hap>=10000) {
		System.out.println(a);
		System.out.println(hap);
		break;	}
		a++;
 		}
*/		
//		문) 3의 배수의 누적합이 1000을 넘어가면 
//		3부터 어디까지 더해야 하는지 구하시오
//		출력결과) 3+6+9+12+~ = 1000
		int a=0, hap=0;
		String res = ""; //빈문자열 선언
		while(true) {
				a= a + 3 ; 
				hap=hap +a;
				res = res + a + "+";
				if(hap>=1000) break;}
				System.out.println(res + "=" + hap);
				
	}//me
}//ce
