package oop1127;

class Score {
	private String name;
	private int kor, eng, mat;
	private int aver;

	public Score() {
		//�������Լ��� �������Լ��� ȣ���ϴ°��
		//Score("ȫ�浿"); ����
		this("ȫ�浿");
	}
	public Score(String name) {
		calc(); //�������Լ����� �Ϲ��Լ��� ȣ���� �� �ִ�.
	}
	public Score(int kor, int eng, int mat) {
		this(); //�������Լ��� ù�ٿ��� ȣ���ؾ� �Ѵ�.
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public void calc() {
//		this(10, 20, 30); �Ϲ��Լ������� �������Լ��� ȣ���� �� ����.
		aver = (kor+eng+mat)/3;
		
	}
}//class e

public class ThisTest2 {
	
	public static void main(String[] args) {
		//this()		: �������Լ��� �������Լ��� ȣ��
		//this		: field(�������)
		//"this"		: ���ڿ����
		
		
	}//main e
}// class e
