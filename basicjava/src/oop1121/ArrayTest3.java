package oop1121;

public class ArrayTest3 {

	public static void main(String[] args) {
//		Array 배열
		int[] su = {-5, 6, 0, 4, 3};
		int size = su.length;
		
/*		//문) su배열 요소 전체의 합을 구하시오 8 
		int hap=0;
		for(int idx=0; idx<size; idx++) {	
			hap = hap + su[idx];
		}//for e
		System.out.println("문제 1번" +"=" + hap);
		//문) 양수중 짝수의 합 10
		int x=0;
		for(int idx=0; idx<size; idx++) {	
		if(su[idx]%2==0&&su[idx]>0){
			x = x + su[idx];
		}
	}//for e
System.out.println("문제 2번" +"=" + x);		
		
		//문) 음수의 갯수 1
		int count=0;
		for(int idx=0; idx<size; idx++) {	
			if(su[idx]<0){
				count = count + 1;
			}
		}//for e
		System.out.println("문제 2번" +"=" + count + "개");		
		
		//문) su[2]의 등수를 구하시오 4
		int rank = 1;
		for(int idx=0; idx<size; idx++) {
			if(su[2]<su[idx]) {
				 rank = rank + 1;
		 	}
		}
		System.out.println("문제 3번="+ rank + "등");
		//최대값, 최소값을 구하시오
		int max = su[0], min = su[0];
		for(int idx=0; idx<size; idx++) {	
			if(max<su[idx]){
				max = su[idx];
			}
			if(min>su[idx]) {
				min = su[idx];
			}
		}//for e
		System.out.println("문제 4번" );
		System.out.println("최대값은" + max);
		System.out.println("최소값은" + min);
*/		
//		문) su배열요소의 각각의 등수를 구하시오
		int[] rank = {1, 1, 1, 1, 1};
		for(int a=0; a<=4; a++) {
			for(int b=0; b<=4; b++) {
				if(su[a]<su[b]) {
					rank[a] = rank[a] +1;
				}
			}
				}//for e
				for(int idx=0; idx<size; idx++)
					
					System.out.print(rank[idx] + "");
	}//main e
}//class e
