package oop1205;

public class PrintFormatTest {

	public static void main(String[] args) {
		//��� ����
		/*
		 	%d 10�� ������
		 	%f �Ǽ���
		 	%c ������
		 	%s ���ڿ���
		 	\n �ٹٲ�
		 	
		 */
		
//		System.out.printf("�������", ��);
		
		System.out.printf("������\n%d %d %d\n",10, 20, 30);
		System.out.printf("#%5d# \n", 3); // ������ ����
		System.out.printf("#%-5d# \n", 3);// ���� ����
		
		System.out.printf("\n�Ǽ���\n%f %f %f \n", 1.2, 3.4, 5.6); 
		System.out.printf("#%6.2f# \n", 7.8);
		System.out.printf("#%-6.2f# \n", 7.8);
		System.out.printf("#%.2f# \n", 7.8);
		
		System.out.printf("\n������\n%c %c %c \n", 'S', 'K', 'Y'); 
		System.out.printf("#%5c# \n", 'r');
		System.out.printf("#%-5c# \n", 'R');
		
		System.out.printf("\n���ڿ���\n%s %s %s \n", "Year", "Month", "Date"); 
		System.out.printf("#%8s# \n", "HAPPY");
		System.out.printf("#%-8s# \n", "HAPPY");
		
		
	}// main e
}// classe 
