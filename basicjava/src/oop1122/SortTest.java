package oop1122;

import java.util.Arrays;

public class SortTest {

	public static void main(String[] args) {
//		���� Sort
/*		
		�������� 
		-  �������� - ascending sort(ASC) 1��10, A��z, ���椾
	    -  �������� - descending sort(DESC)
	    ���Ĺ��
	    -  insertion sort �������� 
	    -  selection sort ��������
	                                                - 9 7 3 5 1 - 
	   	|  7 9 3 5 1  |			| 1 7 9 5 3	|			| 1 3 7 9 5 	|         	 | 1 3 5 7 9	 |
		|  3 9 7 5 1  | 1ȸ�� | 1 5 9 7 3	|  2ȸ��	| 1 3 5 9 7 	|  3ȸ��	 |               |  4ȸ��    
		|  3 9 7 5 1  |  ---> | 1 3 9 7 5	|  ---> 	|              	|  ---> 	 |   			 |
		|  1 9 7 5 3  |			|				|           |				|		     |				 |
	   
	    -  bubble sort 
	    |  7 9 3 5 1  |			| 3 7 5 1 9	|			| 3 5 1 7 9 	|         	 | 1 3 5 7 9	 |
		|  7 3 9 5 1  | 1ȸ�� | 3 5 7 1 9	|  2ȸ��	| 3 1 5 7 9 	|  3ȸ��	 |               |  4ȸ��    
		|  7 3 5 9 1  |  ---> | 3 5 1 7 9	|  ---> 	|              	|  ---> 	 |   			 |
		|  7 3 5 1 9  |			|				|           |				|		     |				 |
	    
	    -  shell sort
	    -  quick sort
*/
		int[] su = {9, 7, 3, 5, 1};
//		selection sort ������� ��������
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
//		��) bubble sort ������� ��������
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
