package oop1120;

public class ForTest7 {

	public static void main(String[] args) {
//		�ݺ��� ���� ����
/*		��) 2g, 3g, 5g ¥�� �߰� ���� 5���� ������
  			������ ���� �������� ���԰� 40~45������ ��
  			�� ���� ������ ���Ը� ����ϴ� ���α׷�
  			for if 
  			��°��
  			2g    3g   5g    �� 
*/	
/*
			int a = 1, b = 1, c=1;
			int hap = 0;
			System.out.println("2g" + "3g" + "5g" + " ��");
			for(a=1;a<=5;a++){
				for(b=1;b<=5;b++){
					for(c=1;c<=5;c++){
					hap= (a*2)+(b*3)+(c*5);
					if(hap>=40&&hap<=45){
						System.out.println(a+ " " +b + " "  +c + " " +hap);
					}//ife
			}//fore
				}//fore
					}//fore
*/			
/*		��) ������ ��	
 		1+....+10=55    ȸ���� ����
 		1+....+20=210	
		1+....+30=
 		1+....+100=5050
 
	
		int hap=0;
		for(int a=10; a<=100; a+=10) {
			for(int b=1; b<=a; b++) {
				hap= hap + b;}
				System.out.println("1+...+"+a+"="+ hap);
				hap=0;
			}fore
			
*/		
/*		1+...+10=55	
 		11+...+20=
 		21+...+30=
 		81+...+90= 			
 		91+...+100= 			
*/	
		int hap=0;
			for(int a=10; a<=100; a+=10) {
			for(int b=a-9; b<=a; b++) {
				hap= hap + b;}
				System.out.println((a-9)+ "+...+" +  "=" + hap);
				hap=0;
			}//fore
		
		
	}//m
}//c
