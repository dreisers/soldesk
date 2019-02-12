package oop1204;

class MyThread2 extends Thread{ //클래스는 단일상속만
													 //가능하다
	private int num;
	private String name;
	public MyThread2() {}
	public MyThread2(int num, String name) {
		this.num = num;
		this.name = name;
	}
	@Override
		public void run() {
		for(int a=0; a<this.num; a++) {
			System.out.println(name+ ":" + a);
		}
	}
}//class e
public class ThreadTest2 {

	public static void main(String[] args) {
		// Thread 쓰레드
		// 2) 쓰레드를 사용한 경우
		MyThread2 t1 = new MyThread2(100, "★");
		t1.start();
		
		MyThread2 t2 = new MyThread2(100, "★★");
		t2.start();
		
		MyThread2 t3 = new MyThread2(100, "★★★");
		t3.start();
		
		
		
	}//main e
}// class e
