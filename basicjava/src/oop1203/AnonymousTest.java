package oop1203;


interface IMessaga {
	public void msgPrint();
	
} //interface e

class Message implements IMessaga	{	//��ü object
																//��ü.����	��ü.field
																//��ü.�޼ҵ�()	��ü.method
	@Override
	public void msgPrint() {
		System.out.println("Message Ŭ����");
	} 
	
}//class e
public class AnonymousTest {
	
	public static void main(String[] args) {
		// �͸�Ŭ���� Anonymous class
		// �߻�Ŭ����	: �߻�޼ҵ尡 1���� �ִ� Ŭ����
		// interface	: �߻�޼ҵ�θ� ����
		// �߻�޼ҵ� : �޼ҵ��� {}�� ����
		// �߻�Ŭ������ �������̽��� ��ü������ �� ����.
		
		//1)�⺻
		Message message = new Message();
		message.msgPrint();
		//2)������
		IMessaga imess = new Message();
		imess.msgPrint();
		//3)�͸�Ŭ���� : �ʿ��� ������ �Ͻ��� ó��
		//	�̺�Ʈ�� �߻��� ���� ó��
		// �ȵ���̵� �ڹ�, jQuery Ȱ�� 
		IMessaga msg = new IMessaga() {
		@Override
		public void msgPrint() {
			System.out.println("Anonymous �͸� ���� Ŭ����");
			}
		};
		msg.msgPrint();
	}//main e
}//class e
