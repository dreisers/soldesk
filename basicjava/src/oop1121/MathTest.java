package oop1121;

public class MathTest {

	public static void main(String[] args) {
//		Math ���а��� Ŭ����
	
//		���밪
		System.out.println(Math.abs(-3));
		System.out.println(Math.abs(5));
		
//		ū��	
		System.out.println(Math.max(3, 5));
		
//		������
		System.out.println(Math.min(2, 4));
		System.out.println(Math.max(2, Math.max(8, 9)));
		System.out.println(Math.ceil(2.4));
		System.out.println(Math.floor(2.7));
		System.out.println(Math.round(3.8));
		System.out.println(Math.PI);
		
//		����, random�� : �ý����� �߻���Ų ��
//		System.out.println(Math.random());
		System.out.println((int)(Math.random()*2)); // 0 1
		
	}
}
