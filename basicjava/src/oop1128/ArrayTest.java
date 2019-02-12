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
			//객체 배열
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
			
			Integer i = 7;//autoboxing 기본형이 자동으로 참조형변환 된다.
			System.out.println(7);
*/			
/*		
			Integer[] inte = { new Integer(1),
									 new Integer(3),
									 new Integer(5) }; // 객체배열
			
			//Integer[] i = new Integer[] {1, 3, 5};
			int size = inte.length;
			for(int idx=0; idx<size; idx++) {
				System.out.println(inte[idx].toString());
				System.out.println(inte[idx]);
			}//for e
					
			//문) inte[0]와 inte[2]의 요소값을 서로 교환하시오
			Integer tmp = inte[0];
			inte[0] = inte[2];
			inte[2] = tmp;
			
			System.out.println(inte[0]);
			System.out.println(inte[1]);
			System.out.println(inte[2]);
*/
		Sungjuk[] sj = {	new Sungjuk("무궁화", 40 , 50 ,30),
								new Sungjuk("라일락", 20 , 60 ,80),
								new Sungjuk("홍길동", 60 , 70 ,90) };
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
		
		//문) sj[0]와 sj[2]요소를 서로 교환
		Sungjuk tmp = sj[0];
		sj[0] = sj[2];
		sj[2] = tmp;
		for(int idx=0; idx<sj.length; idx++) {
			sj[idx].disp();
		}
*/		
		//메소드 호출 방식
		//Call by value			값에 의한 호출
		//Call by reference 	참조에 의한 호출
		
		 Sungjuk one = new Sungjuk("무궁화", 20, 30, 45);
		 Sungjuk two = new Sungjuk("라일락", 75, 80, 90);
		 
		 Print prn = new Print();
		 prn.view1(one.kor, two.kor);
		 prn.view2(one, two);
		 
		 System.out.println(one.hashCode());
		 System.out.println(two.hashCode());
		 
		 //문) one와 two를 서로 교환하시오
		 Sungjuk tmp = one;
		 one = two;
		 two = tmp;
	}//main e
}// class e
