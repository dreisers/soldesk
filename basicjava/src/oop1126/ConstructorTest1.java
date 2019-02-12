package oop1126; // �Ѱ��� �ҽ����Ͽ� ��Ű���� �ѹ��� �����Ѵ�.
							// ���� �ڽ��� Ŭ������ ����� ��ġ

class Score {
	//field ������� -> ��κ��� private�� ���� �����Ѵ�.(��������)
	 private String name; //Ŭ���� ���ο����� ���� ���
	 private int kor, eng, mat;
	 private int aver;
	 
	//constructor ������ �Լ� 
	public Score() { //default constructor(�⺻�������Լ�)
							//parameter(�Ű�����)�� ����
							//�⺻�������Լ��� �ڵ������ȴ�
		System.out.println("---Score()�Լ� ȣ��");
	}
	
//	�������Լ��� �����ε�(�ߺ�����)�� �����ϴ�
	public Score(String n) {
		name = n;
	}
	public Score(int k, int e, int m) {
		kor =k;
		eng = e;
		mat = m;
	}
	
	public Score(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
		
	}
	
	
	//method ����Լ�
	public void init(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	public void calc() {
		aver = (kor+eng+mat)/3;
	}
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}
	
}//class e

public class ConstructorTest1 {

	public static void main(String[] args) {
		//constructor �������Լ�
		// - Ŭ���� �̸��� ������ �Լ���
		// - �޸��Ҵ��� �ϱ� ���ؼ� �ʿ�
		// - ������ �Լ��� �����ε��� �����ϴ�
		// - �������Լ��� �������� �������� �ʴ´�.
		//desctructor �Ҹ��� �Լ� -> �ڹٿ��� ����
		//garbage collecting ������ �ݷ���
		
		//Sungjuk sj; ������ ��Ű�������� ���ٰ����ϴ�
/*		
		Score one = new Score();
		one.calc();
		one.disp();
		
		Score two = new Score("����ȭ");
		two.calc();
		two.disp();
		
		Score three = new Score(10, 20, 30);
		three.calc();
		three.disp();
		
//		������ �Լ��� �̿��ؼ� ��ü �ʱⰪ�� ������ �� �ִ�.
		Score four = new Score("���϶�", 10, 30, 50);
		four.calc();
		four.disp();
		
		Score five = new Score();
		five.init("�����", 90, 85, 90);
		five.calc();
		five.disp();
*/
/*		Integer a = new Integer(5); //��ü
		System.out.println(a.toString());
		
		Integer b = new Integer("7");
		System.out.println(b.toString());
*/
/*		String a = "Happy";
		String b = new String("Soldesk");
		b = "Hello";
		String c = new String("Soldesk");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		char[] ch = {'S','K','Y'};
		String d = new String(ch);
		System.out.println(d);
		
		StringBuffer sb = new StringBuffer("APPLE");
		String str = new String(sb);
		System.out.println(str.toString());
		System.out.println(str);
*/
/*	
 		Random Access Memory (�ֹ߼� �޸�) RAM
 		---------------------------------- 0 address
		static  �� 
 		------��----------------------------
 		heap	  �� "��" 10 20 30		"��" 40 50 60
 		------��----------------------------
 				  �� #100					#200
 		------��----------------------------
		stack  ��  a=3  					 b=5
				  ��  four=#100		 	five=#200
		---------------------------------- 
	*/	
/*		Score four = new Score("���϶�", 10, 20, 30);
		four.calc();
		
		Score five = new Score("�����", 40, 50, 60);
		five.calc();
		
		four.disp();
		four.disp();
*/
		String name = new String("HAPPY");
		String str = new String("HAPPY");
		
		//�����ϰ� �ִ� �ּ� ��
		if(name==str) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		//���ڿ��� ������ ���ϰ��� �Ҷ�
		// == �����ڴ� ������� ����
		//equals()�� �̿��ؼ� ���� ��
		if(name.equals(str)) {
		System.out.println("����");
		}else {
		System.out.println("�ٸ���");
		}
		
/*		String six = name;
		System.out.println(name.hashCode());
		System.out.println(six.hashCode());
		System.out.println(str.hashCode());
*/		
		//��ü�� �����ϰ� �ִ� ���������� ��(�ּ�)
		Score one = new Score();
		Score two = new Score();
		Score three = one;
		System.out.println(one.hashCode()); // #50
		System.out.println(two.hashCode()); // #60
		System.out.println(three.hashCode()); //#50
	}//main e
}// class e
