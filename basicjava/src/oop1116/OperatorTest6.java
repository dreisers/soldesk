package oop1116;

public class OperatorTest6 {

	public static void main(String[] args) {
//		����, ����
/*		int a = 3;
		a = a * 2; // ����
		a = a * -1;
		a = -a;  //����
		System.out.println(a);
*/
//		���׿����� (����) ? : 
//		���� : boolean��
//		������ ���� ���, ���� ? 
/*		int a = 2018;
		String str = (a>=1) ? "���"  : "����";
		System.out.println(a + "�� " + str + " �Դϴ�.");
//		��)������ ���� ¦��, Ȧ��?
		String h = (a%2==0) ? "¦��" : "Ȧ��";
		System.out.println(a + "�� " + h + " �Դϴ�.");
//		��)������ ���� 2�� ����̸鼭 5�� �������?
		String b = (a%2==0 && a%5==0) ? "true" : "false";
		System.out.println(b);
//		��)������ �⵵�� ����, ���?
		String y = (a%4==0 || a%100!=0 && a%400==0) ? "����" : "���";
		System.out.println(a + "���� " + y + " �Դϴ�.");
*/
//		��) ������ ���ڸ� ��ҹ��� ���� �ٲ㼭 ���
		char ch = 'b';
		char r = (ch>='a' && ch<='z') ? (char)(ch-32) : (char)(ch+32);
		System.out.println(r);
//		��) ������ ���߿��� �ִ밪 ���
		int a = 3, b=6, c=8;
		int m = (a>b) ? a : b;
		m = (m>c) ? m : c;
		System.out.println(m);
		
		
	}
}
