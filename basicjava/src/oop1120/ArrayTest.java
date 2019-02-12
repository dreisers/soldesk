package oop1120;

public class ArrayTest {

	public static void main(String[] args) {
//		배열 Array : 동일한 자료형의 집합
//		index, 색인 : 맨처음을 0번째, 그다음 인덱스는 1씩 증가
//		element 요소
//		new 메모리 할당 연산자
/*		
		int[] kor = new int[3];
		kor[0] = 10;
		kor[1] = 20;
		kor[2] = 30;
//		kor[3] = 40; Exception 예외처리
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		for(int idx=0; idx<=2; idx++) {
			System.out.println(kor[idx]);
		}
//		kor배열 요소의 갯수
		System.out.println(kor.length); //3 
*/				
		int[] kor = {10,20,30};
		int size = kor.length;
		for(int idx=0; idx<size; idx++)
			System.out.println(kor[idx]);
		
		
	}
}
