package oop1122;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
//		정렬 Sort
/*		
		정렬유형 
		-  오름차순 - ascending sort(ASC) 1→10, A→z, ㄱ→ㅎ
	    -  내림차순 - descending sort(DESC)
	    정렬방식
	    -  insertion sort 삽입정렬 
	    -  selection sort 선택정렬
	                                                - 9 7 3 5 1 - 
	   	|  7 9 3 5 1  |			| 1 7 9 5 3	|			| 1 3 7 9 5 	|         	 | 1 3 5 7 9	 |
		|  3 9 7 5 1  | 1회전 | 1 5 9 7 3	|  2회전	| 1 3 5 9 7 	|  3회전	 |               |  4회전    
		|  3 9 7 5 1  |  ---> | 1 3 9 7 5	|  ---> 	|              	|  ---> 	 |   			 |
		|  1 9 7 5 3  |			|				|           |				|		     |				 |
	   
	    -  bubble sort 
	    |  7 9 3 5 1  |			| 3 7 5 1 9	|			| 3 5 1 7 9 	|         	 | 1 3 5 7 9	 |
		|  7 3 9 5 1  | 1회전 | 3 5 7 1 9	|  2회전	| 3 1 5 7 9 	|  3회전	 |               |  4회전    
		|  7 3 5 9 1  |  ---> | 3 5 1 7 9	|  ---> 	|              	|  ---> 	 |   			 |
		|  7 3 5 1 9  |			|				|           |				|		     |				 |
	    
	    -  shell sort
	    -  quick sort
*/
		int[] su = {9, 7, 3, 5, 1};
//		selection sort 방식으로 오름차순
/*
		for(int a=0; a<=3; a++) {
			for(int b=a+1; b<=4; b++) {
			if(su[a]>=su[b]) {
			int tmp = su[a];
				su[a] = su[b];
				su[b] = tmp;
			}		
			}
		}//for e
		
		for(int a=0; a<=4; a++) {
			System.out.println(su[a]);
		}
*/		
//		문) bubble sort 방식으로 내림차순
		for(int a=3; a>=0; a--) {
			for(int b=0; b<=a; b++) {
			if(su[a]<su[b+1]) {
			int tmp = su[b+1];
				su[b+1] = su[b];
				su[b] = tmp;
			}		
			}
		}//for e
		
		for(int a=0; a<=4; a++) {
			System.out.println(su[a]);
		}
		
	}//main e
}// class e
