package oop1120;

public class ArrayTest {

	public static void main(String[] args) {
//		�迭 Array : ������ �ڷ����� ����
//		index, ���� : ��ó���� 0��°, �״��� �ε����� 1�� ����
//		element ���
//		new �޸� �Ҵ� ������
/*		
		int[] kor = new int[3];
		kor[0] = 10;
		kor[1] = 20;
		kor[2] = 30;
//		kor[3] = 40; Exception ����ó��
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		for(int idx=0; idx<=2; idx++) {
			System.out.println(kor[idx]);
		}
//		kor�迭 ����� ����
		System.out.println(kor.length); //3 
*/				
		int[] kor = {10,20,30};
		int size = kor.length;
		for(int idx=0; idx<size; idx++)
			System.out.println(kor[idx]);
		
		
	}
}
