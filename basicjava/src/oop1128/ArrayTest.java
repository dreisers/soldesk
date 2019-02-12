package oop1128;

class Sungjuk {
	//field
	String name;
	int kor, eng, mat;
	int aver;
	//constructor
	public Sungjuk() {	}
	
	public Sungjuk(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	//method
	
	public void calc() {
		this.aver = (this.kor+this.eng+this.mat)/3;
	}
	public void disp() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
}//class e
class Print {
	public void view1(int a, int b) {
		System.out.println(a);
		System.out.println(b);
	}
	
	public void view2(Sungjuk a, Sungjuk b) {
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		a.disp();
		b.disp();
		
	}
}//class e

public class ArrayTest {

	public static void main(String[] args) {
			//��ü �迭
/*			int[] a = {2, 4, 6};
			Integer b1 = new Integer(1);
			Integer b2 = new Integer(3);
			Integer b3 = new Integer(5);
			
			Integer[] inte = new Integer[3];
			inte[0] = new Integer(1);
			inte[1] = new Integer(3);
			inte[2] = new Integer(5);
			System.out.println(inte[0].toString());
			System.out.println(inte[1].toString());
			System.out.println(inte[2].toString());
			System.out.println(inte[0]);
			System.out.println(inte[1]);
			System.out.println(inte[2]);
			
			Integer i = 7;//autoboxing �⺻���� �ڵ����� ��������ȯ �ȴ�.
			System.out.println(7);
*/			
/*		
			Integer[] inte = { new Integer(1),
									 new Integer(3),
									 new Integer(5) }; // ��ü�迭
			
			//Integer[] i = new Integer[] {1, 3, 5};
			int size = inte.length;
			for(int idx=0; idx<size; idx++) {
				System.out.println(inte[idx].toString());
				System.out.println(inte[idx]);
			}//for e
					
			//��) inte[0]�� inte[2]�� ��Ұ��� ���� ��ȯ�Ͻÿ�
			Integer tmp = inte[0];
			inte[0] = inte[2];
			inte[2] = tmp;
			
			System.out.println(inte[0]);
			System.out.println(inte[1]);
			System.out.println(inte[2]);
*/
		Sungjuk[] sj = {	new Sungjuk("����ȭ", 40 , 50 ,30),
								new Sungjuk("���϶�", 20 , 60 ,80),
								new Sungjuk("ȫ�浿", 60 , 70 ,90) };
/*
		sj[0].calc();
		sj[1].calc();
		sj[2].calc();
		
		sj[0].disp();
		sj[1].disp();
		sj[2].disp();
*/		
/*
		for(int idx=0; idx<sj.length; idx++) {
			sj[idx].calc();
			sj[idx].disp();
		}//for e
		
		//��) sj[0]�� sj[2]��Ҹ� ���� ��ȯ
		Sungjuk tmp = sj[0];
		sj[0] = sj[2];
		sj[2] = tmp;
		for(int idx=0; idx<sj.length; idx++) {
			sj[idx].disp();
		}
*/		
		//�޼ҵ� ȣ�� ���
		//Call by value			���� ���� ȣ��
		//Call by reference 	������ ���� ȣ��
		
		 Sungjuk one = new Sungjuk("����ȭ", 20, 30, 45);
		 Sungjuk two = new Sungjuk("���϶�", 75, 80, 90);
		 
		 Print prn = new Print();
		 prn.view1(one.kor, two.kor);
		 prn.view2(one, two);
		 
		 System.out.println(one.hashCode());
		 System.out.println(two.hashCode());
		 
		 //��) one�� two�� ���� ��ȯ�Ͻÿ�
		 Sungjuk tmp = one;
		 one = two;
		 two = tmp;
	}//main e
}// class e
