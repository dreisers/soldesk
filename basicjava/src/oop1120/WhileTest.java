package oop1120;

public class WhileTest {

	public static void main(String[] args) {
//			while(����) {}  ���� ���� ��
//		 	do~while  ���߿� ���� ��
//			�ʱⰪ�� false�ϰ�� while�� do~while�� ���̰� �ִ�.
//			do~while���� ���ǰ� ������� ������ 1���� ����ȴ�.
/*		int a = 3;
		while(a<=5) {
			System.out.println("JAVA");
			a++;
		}
*/	
/*
		int b = 3;
		do {
			System.out.println("JSP");
			b++;
		}while(b<=5);

		int a=3;
		while(a<1) {
			System.out.println("JAVA");
			a++;
		}
		int b=3;
		do {
			System.out.println("JSP");
			b++;
		}while(b<1);
		
//		���� loop 
//		for(;;){}	
		int a=1;
		while(true) {
			System.out.println("JAVA");
			a++;
			if(a==5) break;}
		
//		��) 1~1000���� �������� ���ϴµ� ���� 10000�� ������
//		����� ����ϰ� ���α׷� ����
		int a=1, hap=0;
		while(a<=1000) {
		hap= hap + a;
		if(hap>=10000) {
		System.out.println(a);
		System.out.println(hap);
		break;	}
		a++;
 		}
*/		
//		��) 3�� ����� �������� 1000�� �Ѿ�� 
//		3���� ������ ���ؾ� �ϴ��� ���Ͻÿ�
//		��°��) 3+6+9+12+~ = 1000
		int a=0, hap=0;
		String res = ""; //���ڿ� ����
		while(true) {
				a= a + 3 ; 
				hap=hap +a;
				res = res + a + "+";
				if(hap>=1000) break;}
				System.out.println(res + "=" + hap);
				
	}//me
}//ce
