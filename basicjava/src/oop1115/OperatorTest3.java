package oop1115;

public class OperatorTest3 {

	public static void main(String[] args) {
//			������ ����
//		������ ���� ¦���ΰ�?
/*
		  int a= 4; System.out.println(a%2 == 0); // ��) �ش� �⵵�� ��������? int year = 2018;
		  System.out.println(year%4==0); // ��)������ ���� 2�� ����̸鼭 5�� �������? int b = 20;
		  System.out.println(b%2==0 && b%5==00); // ��)���������� 80~89 ��������? int kor = 85;
		  System.out.println(kor>=80 && kor<=89);
 */
//		���� ���ϴ� ����
/*		int year = 2016;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
*/
//		������ ���ڰ� ���ĺ� R, r ����?	
		char a = 'R';
		System.out.println((a=='R')||(a=='r'));
//		������ ���� 2�� ����̰ų� 3�� �������?
		int b = 7;
		System.out.println(b%2==0||b%3==0);
//		������ ���ڰ� �빮������?
		System.out.println(a>='A'&&a<='Z');
//		������ ���� 3�� ����� �ƴ϶��
		System.out.println(!(a%3==0));
		
		
	}
}