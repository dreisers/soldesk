package oop1116;

public class OperatorTest5 {

	public static void main(String[] args) {
//		F2 : rename
//		1����, 1���� ������ ����
		/*
		 * int a = 3, b =3; a = a + 1; b = b-1; a += 1; b-= 1; a++; b--; ++a; --b;
		 * System.out.println(a); System.out.println(b);
		 */
		/*
		 * int a = 10, b = 10; int c = a++; // ���߿� 1���� (10) int d = --b; // ���� 1���� (9)
		 * System.out.println(c); System.out.println(d);
		 */
		int a = 3, b = 5;
		int z = ++a + b++;
		System.out.println(z);
		
	}
}
