package oop1123;

public class MethodTest3 {
	
	public static void abstest(int a) {
		System.out.println(Math.abs(a));
	}//abstest e
	
	public static void facttest(int b) {
		long gop = 1; 
		for(int a=b; a>=1; a--){
			gop = gop * a;
			
			}
		System.out.println(gop);
	}//facttest e
	
	public static void leaptest(int a) { //2018 �����̳� ����̳�
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("����");
		}else {
			System.out.println("���");
		}
	}//leaptest e
	
	public static void graphtest(char ch, int a) {
		for(int b=1; b<a; b++) {
			System.out.print(ch);
		}
		
		
	}//graphtest e
	
	
	public static void main(String[] args) {
//		�޼ҵ� ��������

		
//		��) ���밪�� ���Ͻÿ�
		abstest(-3);
		
		
//		��) ���丮���� ���Ͻÿ�
//		fact(4);
		
		facttest(4);
//		��) ����, ����� �����ؼ� ����Ͻÿ�
		leaptest(2018);
		
		
//		��) �׷����� ����Ͻÿ� ##########
		graphtest('#', 10);
		
		
	}//main e
}// class e
