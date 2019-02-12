package oop1127;

class Sungjuk {
		//class = field(�������) + method(����Լ�)
	//field
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//constructor ������ �Լ�
	//default constructor(�⺻������)�� �ڵ������ȴ�
	//(��, �������Լ��� �����ε��� �Ǹ� �ڵ��������� �ʴ´�.)
	//�⺻�����ڴ� �ڵ��������� �ʴ� ��찡 �ֱ� ������
	//�ʿ䰡 ��� ���������� �ڵ��ϴ°� ����.!
		public Sungjuk () {} // <=
		
		public Sungjuk(int kor, int eng, int mat) {
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
	public Sungjuk(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	//method
	public void calc() {
		aver = (kor+eng+mat)/3; // field
	}
	public void disp() {
		String name = "�ֵ���ũ"; // �Ϲ���������
		System.out.println(name);
		System.out.println(this.name); //field
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
}//class e
public class ThisTest {
/* 
 		scope : ��ȿ����
 	  	�������� global variable
 	  	�������� local variable -> �켱������ ����
 */
	
	
	public static void main(String[] args) {
		//this	: �� �ڽ��� ����Ű�� ����
		//			: field�� �Ϲ� ���������� ����	
		//this()
		
		Sungjuk one = new Sungjuk();  //one ��ü

		Sungjuk two = new Sungjuk("ȫ�浿", 10, 15, 25);  //one ��ü
		two.calc();
		two.disp();
		
		
		
	}//main e
}// class e
