package oop1204;

class MyThread3 implements Runnable {
	
	private int num;
	private String name;
	public MyThread3() {}
	public MyThread3(int num, String name) {
		this.num = num;
		this.name = name;
	}
	@Override
		public void run() {
		for(int a=0; a<this.num; a++) {
			System.out.println(name+ ":" + a);
		}
	}
}
public class ThreadTest3 {

	public static void main(String[] args) {
		// Runnable interface
		// 3) 쓰레드를 사용한 경우
		
		Thread t1 =new Thread(new MyThread3(100, "★"));
		t1.start(); // JVM이 쓰레드 관리자를 호출하고
					  // run() 메소드 호출
		
		Thread t2 =new Thread(new MyThread3(100, "★★"));
		t2.start(); 
		
		Thread t3 =new Thread(new MyThread3(100, "★★★"));
		t3.start(); 
		
		
	}//main e
}// class e
