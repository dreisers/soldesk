package oop1119;

public class ForTest3 {

	public static void main(String[] args) {
//		��) x���� 10���κ��� x�� ���� �� ���� x=10 -3
//		    ����� ���� �� �Ǹ� x�� ��� ���°��� ���Ͻÿ�
/*
 			int count = 0;
			int x=4; 
			int m=10;
			for(int a=1; a<=10; a++) {
				m = m -x;
				if(m<0) break;
				count = count + 1;
				
	}
			System.out.println(count + "��");
				System.out.println(m);
*/
//		��) ��� �����̴� ������ 3cm�ö󰡰�
//			�㿡�� 2.5cm �����´ٰ� �Ҷ� 
//			�����̰� 13cm�� ���� ����⿡ �ö󰡷��� 
//			��ĥ�� �ɸ����� ���Ͻÿ�
/*	
  			int day = 0;
			double s = 0.0;
					for(;;) {
					day++;
					s = s + 3;
					if(s>=13) { break;
					}else {
						s = s - 2.5;
					}
					}
			System.out.println(s);
			System.out.println(day + "��");

*/		
//		��) �������� ����� ���Ͻÿ�
//			1 - 2 + 3 - 4 + 5 . . . 100
/*
 		int even = 0; //¦�� 
		int odd = 0; //Ȧ��
	
		for(int a=1; a<=100; a++) {
			if(a%2==0) {
				even = even - a;
			}else {
				odd = odd + a;
			}
		}
			System.out.println(odd + even);
*/
//�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�
/*
		int hap = 0;
		boolean flag = false;
		for(int a=1; a<=100; a++) {
			if(flag) {
				flag = false;
				hap = hap - a;
			}else {
				hap = hap + a;
						flag = true;
			}
		}
		System.out.println(hap);
*/
//		��) 1 - 2 + 3 - 4 + 5 		99
//		     ��  ��  ��  ��  �� . . . �Ѥ� = ?
//			 2	  3    4   5    6 	   100
/*		
		double even = 0.0; //¦�� 
		double odd = 0.0; //Ȧ��
	
		for(int a=1; a<=100; a++) {
			if(a%2==0) {
				even = even - a;
			}else {
				odd = odd + a;
			}
		}
*/
/*		
		double hap = 0;
		boolean flag = false;
		for(int a=1; a<100; a++) {
			if(flag) {
				hap = hap - (a/(double)(a+1));
				flag = false;
			}else {
				hap = hap + (a/(double)(a+1));
						flag = true;
			}
		}
		System.out.println(hap);
*/
	//��) �μ������� ���� ���Ͻÿ�	
//		3+4+5
		int start=-5, end=7;
		int hap = 0;
//		swap ��ȯ
		if(start>end) {
			int tmp = end;
			end = start;
			start = tmp;
		}
		for(int a=start; a<=end; a++) {
			hap = hap + a;
		}
		System.out.println(hap);
	}//me

}//ce
