package oop1130;


interface Parent{ // interface�� �߻�޼ҵ常
							// ����� �� �ֱ� ������ abstract ��������
//	void disp() {} ����. �Ϲ� �޼ҵ�� ��� �Ұ�
	abstract void kind(); // �߻�޼ҵ�
	void breathe(); // abstract �������� 
}//interface e

class Son implements Parent{

	@Override
	public void kind() {
		System.out.println("�Ƶ�");
	}

	@Override
	public void breathe() {
	System.out.println("���� ������1");	
	}
	
}//class e
	
class Daughter implements Parent{

	@Override
	public void kind() {
		System.out.println("��");
	}

	@Override
	public void breathe() {
		System.out.println("���� ������2");
	}
	
}//class e
public class InterfaceTest {

	public static void main(String[] args) {
		// interface : �߻�޼ҵ�θ� �����Ǿ� �ִ�
		// interface�� ��ü������ �� ����.
		// interface�� �������� �����ϴ�
		// �߻�Ŭ�������� �� �߻�ȭ �Ǿ� �ִ�.
		// Ŭ�������忡�� �θ� Ŭ���� 		: extends Ȯ��
		// 							    �������̽� : implements ���� 
		
		
		
		//����. ��ü ���� X 
		//Parent parent = new Parent(); 
		Son son = new Son();
		son.kind();
		son.breathe();
		
		Daughter daugh = new Daughter();
		daugh.kind();
		daugh.breathe();
		
		//������
		Parent parent = new Son();
		parent.kind();
		parent.breathe();
		
		parent = new Daughter();
		parent.kind();
		parent.breathe();
		
		
		
		
	}//main e
}//class e
