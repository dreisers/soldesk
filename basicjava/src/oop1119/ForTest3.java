package oop1119;

public class ForTest3 {

	public static void main(String[] args) {
//		문) x값이 10으로부터 x를 여러 번 뺀후 x=10 -3
//		    결과가 음수 가 되면 x를 몇번 뺐는가를 구하시오
/*
 			int count = 0;
			int x=4; 
			int m=10;
			for(int a=1; a<=10; a++) {
				m = m -x;
				if(m<0) break;
				count = count + 1;
				
	}
			System.out.println(count + "번");
				System.out.println(m);
*/
//		문) 어느 달팽이는 낮에는 3cm올라가고
//			밤에는 2.5cm 내려온다고 할때 
//			달팽이가 13cm의 나무 꼭대기에 올라가려면 
//			며칠이 걸리는지 구하시오
/*	
  			int day = 0;
			double s = 0.0;
					for(;;) {
					day++;
					s = s + 3;
					if(s>=13) { break;
					}else {
						s = s - 2.5;
					}
					}
			System.out.println(s);
			System.out.println(day + "일");

*/		
//		문) 다음식의 결과를 구하시오
//			1 - 2 + 3 - 4 + 5 . . . 100
/*
 		int even = 0; //짝수 
		int odd = 0; //홀수
	
		for(int a=1; a<=100; a++) {
			if(a%2==0) {
				even = even - a;
			}else {
				odd = odd + a;
			}
		}
			System.out.println(odd + even);
*/
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
/*
		int hap = 0;
		boolean flag = false;
		for(int a=1; a<=100; a++) {
			if(flag) {
				flag = false;
				hap = hap - a;
			}else {
				hap = hap + a;
						flag = true;
			}
		}
		System.out.println(hap);
*/
//		문) 1 - 2 + 3 - 4 + 5 		99
//		     ㅡ  ㅡ  ㅡ  ㅡ  ㅡ . . . ㅡㅡ = ?
//			 2	  3    4   5    6 	   100
/*		
		double even = 0.0; //짝수 
		double odd = 0.0; //홀수
	
		for(int a=1; a<=100; a++) {
			if(a%2==0) {
				even = even - a;
			}else {
				odd = odd + a;
			}
		}
*/
/*		
		double hap = 0;
		boolean flag = false;
		for(int a=1; a<100; a++) {
			if(flag) {
				hap = hap - (a/(double)(a+1));
				flag = false;
			}else {
				hap = hap + (a/(double)(a+1));
						flag = true;
			}
		}
		System.out.println(hap);
*/
	//문) 두수사이의 합을 구하시오	
//		3+4+5
		int start=-5, end=7;
		int hap = 0;
//		swap 교환
		if(start>end) {
			int tmp = end;
			end = start;
			start = tmp;
		}
		for(int a=start; a<=end; a++) {
			hap = hap + a;
		}
		System.out.println(hap);
	}//me

}//ce
