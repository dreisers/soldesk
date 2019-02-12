package oop1127;

class Score {
	private String name;
	private int kor, eng, mat;
	private int aver;

	public Score() {
		//생성자함수가 생성자함수를 호출하는경우
		//Score("홍길동"); 에러
		this("홍길동");
	}
	public Score(String name) {
		calc(); //생성자함수에서 일반함수를 호출할 수 있다.
	}
	public Score(int kor, int eng, int mat) {
		this(); //생성자함수는 첫줄에서 호출해야 한다.
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	public void calc() {
//		this(10, 20, 30); 일반함수에서는 생성자함수를 호출할 수 없다.
		aver = (kor+eng+mat)/3;
		
	}
}//class e

public class ThisTest2 {
	
	public static void main(String[] args) {
		//this()		: 생성자함수가 생성자함수를 호출
		//this		: field(멤버변수)
		//"this"		: 문자열상수
		
		
	}//main e
}// class e
