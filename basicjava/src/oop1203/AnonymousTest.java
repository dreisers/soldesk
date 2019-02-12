package oop1203;


interface IMessaga {
	public void msgPrint();
	
} //interface e

class Message implements IMessaga	{	//객체 object
																//객체.변수	객체.field
																//객체.메소드()	객체.method
	@Override
	public void msgPrint() {
		System.out.println("Message 클래스");
	} 
	
}//class e
public class AnonymousTest {
	
	public static void main(String[] args) {
		// 익명클래스 Anonymous class
		// 추상클래스	: 추상메소드가 1개라도 있는 클래스
		// interface	: 추상메소드로만 구성
		// 추상메소드 : 메소드의 {}가 없음
		// 추상클래스와 인터페이스는 객체생성할 수 없다.
		
		//1)기본
		Message message = new Message();
		message.msgPrint();
		//2)다형성
		IMessaga imess = new Message();
		imess.msgPrint();
		//3)익명클래스 : 필요한 곳에서 일시적 처리
		//	이벤트가 발생할 때만 처리
		// 안드로이드 자바, jQuery 활용 
		IMessaga msg = new IMessaga() {
		@Override
		public void msgPrint() {
			System.out.println("Anonymous 익명 내부 클래스");
			}
		};
		msg.msgPrint();
	}//main e
}//class e
