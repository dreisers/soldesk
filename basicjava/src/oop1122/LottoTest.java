package oop1122;

import java.util.Arrays;

public class LottoTest {
	public static void main(String[] args) {
//		Math ���а���Ŭ����
		System.out.println(Math.pow(3, 3)) ;
		
//		����(random) �߻� ���� : 0.0 <= r <1.0
//		System.out.println(Math.random());
//		System.out.println((int)(Math.random()*2)); //0, 1, 
//		System.out.println((int)(Math.random()*3)); //0, 1, 2
//		System.out.println((int)(Math.random()*4)); //0, 1, 2, 3

		
//		��) �ֻ��� ���� 1~6
//		System.out.println((int)(Math.random()*6+1));
		
		
//		��)�ζǹ�ȣ 1~45
/*		
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
		System.out.println((int)(Math.random()*45+1));
*/
//		�ζǹ�ȣ : 1~45 �߿��� ���� �ٸ� �� 6��
		int[] lotto = new int[6];
		int size = lotto.length;
		for(int a=0; a<size; a++) {
			lotto[a] = (int)(Math.random()*45)+1;
			for(int b=0; b<a; b++) { //ȸ���� ���� ���� 
				if(lotto[a]==lotto[b]) {
				a--;
				}
			}
		}
//		���� sort
		Arrays.sort(lotto);
		for(int a=0; a<size; a++) {
			System.out.println(lotto[a]);
		}
	}//main e
}//class e
