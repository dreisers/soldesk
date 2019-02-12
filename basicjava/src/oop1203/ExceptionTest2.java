package oop1203;

import java.io.File;

class Test{
	//1)예외처리 방법
/*	public void print() {
		try {
			int a =3/0;
		}catch (Exception e) {}
	}
		public void disp() {
			try {
				int a = Integer.parseInt("SKY");
			}catch(Exception e) {}
		}
*/		
//		2)throw문
		
		public void print() throws Exception {
				int a =3/0;
				}
			public void disp() throws Exception {
					int a = Integer.parseInt("SKY");
					}
			
} //class e
public class ExceptionTest2 {

	public static void main(String[] args) {
		//Exception 예외처리
		//throw문
		//메소드 호출시 예외처리를 한꺼번에 모아서 처리
	try {
			System.out.println("OPEN");
			Test test = new Test();
			test.print();
			test.disp();
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("CLOSE");
		}
		System.out.println("END");
		
	}//main e
}//class e
