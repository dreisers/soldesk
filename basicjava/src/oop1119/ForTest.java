package oop1119;

public class ForTest {

	public static void main(String[] args) {
//		�ݺ���
		/*
		 * for(���۰� ; ���ᰪ ; ����) { } ���� -> boolean�� Scope : ��ȿ����
		 */
//		1) ������ ���� �ݺ�

//		for (int a = 1; a <= 3; a++) {
//			System.out.println("JAVA");
//		}

//		2) ���ҿ� ���� �ݺ�
		/*
		  int b; //������ scope -> �������� ����Ҽ� �ִ� for(b=3; b>=1; b=b-1) {
		  System.out.println("JSP"); } System.out.println(b);
		  
		  // for(;;) {} ����Loop // break -> �ݺ��� Ż��
		  
		  for(int a=10; a<=100; a=a+10) { System.out.println(a+"JAVA"); }
		  
		  for(int b=100; b>=10; b=b-10) { System.out.println(b+"JSP"); }
		  
		  
		  for(char ch='A'; ch<='Z'; ch=(char)(ch+1)) { System.out.println(ch);}
		  for(char ch='z'; ch>='a'; ch=(char)(ch-1)) { System.out.println(ch);}
		  
		  int dan=4; for(int a= 1 ; a<=9; a++) { System.out.println(dan + "*" + a + "="
		  + dan*a); }
		  
		 
//		1~5�߿��� ¦���� ���
		for (int a = 1; a <= 5; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}

//		��) ���� 1�� ~ ���� 2018�߿��� ���⸸ ���
		for (int y = 1; y <= 2018; y++) {
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
				System.out.println(y);
			}
		}
*/
//		�˰��� ���� : ����, ����
//		1~5�߿��� ¦���� ����? 
/*		int count = 0; 
		for (int a = 1; a <= 5; a++) {
			if (a % 2 == 0) {
				count = count +1;
			}
		}
		System.out.println("¦�� ���� : " + count);
		
		int count = 0;
		for (int y = 1; y <= 2018; y++) {
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			count = count +1;
			}
		}
			System.out.println(count +"��");		
*/		
//		��) ���ĺ��� ���ٿ� 5���� ���
		int count = 0;
		for(char ch = 'A'; ch<='Z';ch= (char)(ch+1)) {
			count = count + 1;
			System.out.print(ch);
//			if(count%5==0) System.out.println();
//-----------------------------------------1)		
		if(count==5) {
			System.out.println();
		count = 0;}						//�ʱⰪ���� ������ 
		}                            			//�ٽ� ī��Ʈ
//	-----------------------------------------2)
	}// me
}// ce
