package oop1116;

public class IfTest {

	public static void main(String[] args) {
		// ��� : ���α׷��� �帧 ����
		// ���ǹ�
		// �ݺ���

		/*
		 * if(����) {true�϶�}
		 * 
		 * if(����) {true�϶�} else {false�϶�}
		 * 
		 * if(����) {true�϶�} else if(����) {true�϶�} else if(����) {true�϶�} else {false�϶�}
		 */

//		��) ������ ���� ���, ����, ����?
		/*
		 * int a = 0; if(a==0) { System.out.println("����"); } if(a>0) {
		 * System.out.println("���"); }else { System.out.println("����"); } if(a>0) {
		 * System.out.println("���"); }else if(a<0) { System.out.println("����"); }else
		 * if(a==0) { System.out.println("����"); }else { System.out.println("��Ÿ"); }
		 */
//		��) ���밪�� ���Ͻÿ�(������ ���)
/*		int a = -1;
		if (a > 0) {
			System.out.println(a + "�� ���밪�� " + a);
		} else {
			System.out.println(a + "�� ���밪�� " + -(a));
		}

//		��) �� �� ������ ���̸� ���Ͻÿ�
		int x = 1, y = 5;
		if (x > y) {
			System.out.println("x�� y�� ���̴� " + (x - y));
		} else {
			System.out.println("x�� y�� ���̴� " + (y - x));
		}
		
*/
		
//		��) �����ڵ� 1, 3, 5 -> ����
//		                  2, 4, 6 -> ����
		int code = 2;
				if(code%2==0) {
					System.out.println("����");
				}else {
					System.out.println("����");
				}
	}
}
