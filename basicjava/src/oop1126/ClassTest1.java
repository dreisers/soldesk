package oop1126;

class Sungjuk { // -> package �����Ǿ����� 
	
	//�������, field, column
	public String name;				//��ΰ���
	int kor, eng, mat;					//package �������� ����
												//oop1126��Ű���������� ���� ���
	private int aver;					//�����
	//Ŭ���� ���ο����� ��������� ������� ��� ����鰣��
	//�����Ҽ��ִ�.

	//����Լ�, method, function, procedure
	void calc() {
		//Ŭ���� ���ο����� ��������� ������� ��� ����鰣��
		//���� �� �� �ִ�.
		aver = (kor+eng+mat)/3;
	}//calc e
	public void disp() { 
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp e
	private void test() {}//test e 
} //class end

public class ClassTest1 {
	public static void main(String[] args) {
//		class Ŭ����
//		Ŭ���� ���� : ���� + �Լ�
	
/*		�������(field) + ����Լ�(method)
		Access Modifier ��������, ���ټ���
		1) private : �����
		2) package : ���� ���������� �������
		3) protected : �ٸ� ������ �ִ� ��Ӱ��� Ŭ������ �������
		4) public : ��� ����
*/
		
		//���ǻ���		
//		�Ѱ��� .java�ҽ����Ͽ� �������� Ŭ���� ���ǰ� �����ϴ�
//		�̷���� �Ѱ��� Ŭ������ public�ؾ� �ȴ�.
		
//		Ŭ���� : ����� ���� �ڷ���
//		�ڷ��� : �⺻��, ������(Ŭ����)
//		������ : �޸� �Ҵ��� �ؾ� �Ѵ�.
//		new������ : �޸� �Ҵ�
		
		
/*		int a = 3; // a : ����
		Sungjuk sj = new Sungjuk(); //sj : ��ü Object
		sj.name = "";
		sj.kor = 50;
		sj.eng = 60;
		sj.mat = 70;
//		sj.aver  private �Ӽ��� Ŭ���� ���ο����� ���ٰ����ϴ�
		
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		System.out.println(Integer.SIZE);
		System.out.println(Math.PI);
		
		sj.calc();
		sj.disp();
*/
		//sj.test(); ����. private �Ӽ��� ����x
		
//		Object Oriented program ��ü ���� ���α׷�
		Sungjuk kim = null; //��ü �̸��� ����. 
									  //��ü �ʱ�ȭ
		
//		int a = null; ����
		kim = new Sungjuk(); //�������Լ�
		kim.name = "����ȭ";
		kim.kor = 10;
		kim.eng = 20;
		kim.mat = 35;
//		kim.aver ����
		
		kim.calc();
		kim.disp();
		
		Sungjuk lee = null;
		lee.disp();
	}//main e
}// class e
