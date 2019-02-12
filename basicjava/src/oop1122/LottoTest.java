package oop1122;

import java.util.Arrays;

public class LottoTest {
	public static void main(String[] args) {
//		Math 수학관련클래스
		System.out.println(Math.pow(3, 3)) ;
		
//		난수(random) 발생 범위 : 0.0 <= r <1.0
//		System.out.println(Math.random());
//		System.out.println((int)(Math.random()*2)); //0, 1, 
//		System.out.println((int)(Math.random()*3)); //0, 1, 2
//		System.out.println((int)(Math.random()*4)); //0, 1, 2, 3

		
//		문) 주사위 범위 1~6
//		System.out.println((int)(Math.random()*6+1));
		
		
//		문)로또번호 1~45
/*		
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
*/
//		로또번호 : 1~45 중에서 서로 다른 수 6개
		int[] lotto = new int[6];
		int size = lotto.length;
		for(int a=0; a<size; a++) {
			lotto[a] = (int)(Math.random()*45)+1;
			for(int b=0; b<a; b++) { //회전수 증가 패턴 
				if(lotto[a]==lotto[b]) {
				a--;
				}
			}
		}
//		정렬 sort
		Arrays.sort(lotto);
		for(int a=0; a<size; a++) {
			System.out.println(lotto[a]);
		}
	}//main e
}//class e
