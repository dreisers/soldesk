package oop1119;

public class ForTest2 {

	public static void main(String[] args) {
//			 누적합, 누적곱
//			1~5사이 중에서 짝수의 합을 구하시오
/*		int hap = 0;
		for(int a=1; a<=5; a++) {
			if(a%2==0) {
				hap = hap + a;
			}
		}
		System.out.println(hap);

//			1~100 홀수의 합
		for(int a=1; a<=100; a++) {
			if(a%2!=0) {
				hap = hap +a;
			}
		}
		System.out.println(hap);
*/
//		문)4팩토리얼값 구하시오 4*3*2*1
/*
  	long gop = 1; int fact =4;
		for(int a=fact; a>=1; a--){
			gop = gop * a;
			}
	System.out.println(gop);
	
*/
//		문)1~100사이에서 짝수의 합, 홀수의 합을 각각 구하시오
/*		
 		int even = 0; //짝수 합
		int odd = 0; //홀수 합
	
		for(int a=1; a<=100; a++) {
			if(a%2==0) {
				even = even + a;
			}else {
				odd = odd + a;
			}
		}
		System.out.println(even);
		System.out.println(odd);

*/		
//		switch 이론
		int even=0, odd=0;
		boolean flag =false;
		for(int a=1;a<=100;a++) {
			if(flag) {
				even = even + a;
				flag = false;
			}else {
				odd = odd + a;
				flag=true;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
		
	}// me
}// ce
