package oop1204;

class MyThread1 {
	private int num;
	private String name;
	public MyThread1() {}
	public MyThread1(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public void run() {
		for(int a=0; a<this.num; a++) {
			System.out.println(name+ ":" + a);
		}
	}//run e
	public void start() {
		run();
	}
}//class e
public class ThreadTest1 {

	public static void main(String[] args) {
		// Thread 쓰레드
		// 1) 쓰레드를 사용하지 않은 경우
		MyThread1 t1 = new MyThread1(100, "★");
		t1.start();
		
		MyThread1 t2 = new MyThread1(100, "★★");
		t2.start();
		
		MyThread1 t3 = new MyThread1(100, "★★★");
		t3.start();
		
		
		
	}//main e
}// class e
