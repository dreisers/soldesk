package oop1119;

public class ForTest2 {

	public static void main(String[] args) {
//			 ������, ������
//			1~5���� �߿��� ¦���� ���� ���Ͻÿ�
/*		int hap = 0;
		for(int a=1; a<=5; a++) {
			if(a%2==0) {
				hap = hap + a;
			}
		}
		System.out.println(hap);

//			1~100 Ȧ���� ��
		for(int a=1; a<=100; a++) {
			if(a%2!=0) {
				hap = hap +a;
			}
		}
		System.out.println(hap);
*/
//		��)4���丮�� ���Ͻÿ� 4*3*2*1
/*
  	long gop = 1; int fact =4;
		for(int a=fact; a>=1; a--){
			gop = gop * a;
			}
	System.out.println(gop);
	
*/
//		��)1~100���̿��� ¦���� ��, Ȧ���� ���� ���� ���Ͻÿ�
/*		
 		int even = 0; //¦�� ��
		int odd = 0; //Ȧ�� ��
	
		for(int a=1; a<=100; a++) {
			if(a%2==0) {
				even = even + a;
			}else {
				odd = odd + a;
			}
		}
		System.out.println(even);
		System.out.println(odd);

*/		
//		switch �̷�
		int even=0, odd=0;
		boolean flag =false;
		for(int a=1;a<=100;a++) {
			if(flag) {
				even = even + a;
				flag = false;
			}else {
				odd = odd + a;
				flag=true;
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
		
	}// me
}// ce
