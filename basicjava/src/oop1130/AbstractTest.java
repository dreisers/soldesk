package oop1130;

abstract class Animal { //�߻�Ŭ����
	String name;
	void view() {}// �Ϲ� �޼ҵ�
	abstract void disp();  //�߻�޼ҵ�
}//class e 

class Elephant extends Animal {

	@Override
	void disp() {
		System.out.println("����...");
	}
	}//class e
class Tuna extends Animal { // �߻�Ŭ������ ��ӹ�����
	@Override							//  �ݵ�� �߻�޼ҵ带
	void disp() {					   // ������(override)�ؾ� �Ѵ�
		System.out.println("�ϸ�...");
	}
	
}//class e 
public class AbstractTest {

	public static void main(String[] args) {
		// abstract class �߻�Ŭ����
		// �߻�Ŭ���� = �Ϲݸ޼ҵ�(method) + �߻�޼ҵ�
		// �������̽� = �߻�޼ҵ�θ� ����
		// �߻�޼ҵ� = �޼ҵ��� body[] ����
		//					   �޼ҵ��� �Ӹ����� ������
		
		// �߻�Ŭ������ ��ü�� ������ �� ����.
		// �߻�Ŭ������ ���� new �����ڸ� ����� �� ����
		//	Animal ani = new Animal(;) ����
		
		// �߻�Ŭ������ �������� �θ�Ȱ�� �Ѵ�.
		
		Elephant jumbo = new Elephant();
		jumbo.disp();
		
		Tuna nemo = new Tuna();
		nemo.disp();
		
		//�߻�Ŭ���������� ������
		Animal ani = new Elephant();
		ani.disp();
		
		ani = new Tuna();
		ani.disp();
		
		
	}//main e
}// class e
