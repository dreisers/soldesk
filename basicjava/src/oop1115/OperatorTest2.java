package oop1115;

public class OperatorTest2 {

	public static void main(String[] args) {
//		������ ����
//		��) �� ������ ������ ���Ͻÿ� 
/*		int money = 54840;
		int a = money/10000;
		money = money%10000;
		int b = money/1000;
		money = money%1000;
		int c = money/100;
		money = money%100;
		int d = money/10;
		System.out.println("����" + a + "��");
		System.out.println("õ��" + b + "��");
		System.out.println("���" + c + "��");
		System.out.println("�ʿ�" + d + "��");
*/		
//		��2) 365.2422��
//		��°�� : 365�� ?�ð� ?�� ?��
//		1�� 60�� 1�ð� 60�� 3600�� 1�� 24�ð� 86400��
/*		double day = 365.2422;
		double h = day*24;
		double m = day*1440;
		double s = day*86400;
		System.out.println((int)day +"��" + " = 1��");
		System.out.println((int)h +"�ð�" );
		System.out.println((int)m +"��");
		System.out.println((int)s +"��");
		*/
		double year = 365.2422;
	    int day = (int)(year * 86400);//31556926
	    
	    int d = day/86400; //365��
	    day = day%86400;
	    
	    int h = day/3600; //5�ð�
	    day = day%3600;
	    
	    int m = day/60;   //48��
	    int s = day%60;   //46��
	    
	    System.out.println("1��:" + year);
	    System.out.println(d + "��");
	    System.out.println(h + "�ð�");
	    System.out.println(m + "��");
	    System.out.println(s + "��");
		
	}
}
