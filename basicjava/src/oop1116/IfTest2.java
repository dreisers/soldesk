package oop1116;

public class IfTest2 {

	public static void main(String[] args) {
//		if���ǹ�
//		�������α׷�
		String name = "ȫ�浿";
		int kor=39, eng=100, mat=80;
		int aver = (kor+eng+mat)/3;
		
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("��� : " + aver);
//		��) ��� 95 �̻��̸� ���л�
			if(aver>=95) {
				System.out.println("���л�");}
			
				
				
//		��) ���� 90�̻��̸� "A"
				if(kor>=90) {
					System.out.println("A");	
			}else if(kor>=80) {
				System.out.println("B");
			}else if(kor>=70) {
				System.out.println("C");
			}else if(kor>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");	}
//		��) ��� 70�� �̻��̸� �հ� 
//		    ��, �������߿��� �� ���� �̶� 40�̸��̸� "�����" 
//			��� 70�� �̸��̸� "���հ�"
				if(aver>=70) {
						if(kor< 40 || eng< 40 || mat< 40) {
		//					40 < 40 
							System.out.println("�����");
						}else  {
							System.out.println("�հ�");
						}
				}else {
					System.out.println("���հ�");
				}
				
				
				
//				2)
				if(aver<70) {
					System.out.println("���հ�");
				}else if(aver>=70 && kor>=40 && eng>=40 && mat>=40) {
					System.out.println("�հ�");
				}else {
					System.out.println("�����");}
				
				
//		��) ���� ���α׷�
			double a = 3, b =5;
			char op = '+';
//			��°��   
//			3+5=8    3-5=2  3*5=15
			if(op=='+') {
				System.out.println((int)a + "" + op + "" + (int)b + "=" + (int)(a+b));
			}else if(op=='-') {
				System.out.println((int)a + "" + op + "" + (int)b + "=" + (int)(a-b));
			}else if(op=='*') {
				System.out.println((int)a + "" + op + "" + (int)b + "=" + (int)(a*b));
			}else if(op=='%') {
				System.out.println((int)a + "" + op + "" + (int)b + "=" + (int)(a%b));
			}else { 
				System.out.println(a + "" + op + "" + b + "=" + (a/b));}
//			
			int c = 3, d =5;
			char ope = '/';
			int res1 = 0;
			double res2 = 0.0;
			if(ope=='+') {
				res1 = c+d;
			}else if(ope=='-') {
				res1 = c-d;
			}else if(ope=='*') {
				res1 = c*d;
			}else if(ope=='/') {
				res2 = (double)c/d;
			}else if(ope=='%') {
				res1 = c%d;}
			if(ope=='/') {
				System.out.println(c + "" + ope + "" + d + "=" + res2);
			}else {
				System.out.println(c + "" + ope + "" + d + "=" + res1);}
			}//			
	}//

