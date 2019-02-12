package oop1127;

class Sungjuk {
		//class = field(멤버변수) + method(멤버함수)
	//field
	private String name;
	private int kor, eng, mat;
	private int aver;
	
	//constructor 생성자 함수
	//default constructor(기본생성자)는 자동생성된다
	//(단, 생성자함수가 오버로딩이 되면 자동생성되지 않는다.)
	//기본생성자는 자동생성되지 않는 경우가 있기 때문에
	//필요가 없어도 강제적으로 코딩하는걸 강추.!
		public Sungjuk () {} // <=
		
		public Sungjuk(int kor, int eng, int mat) {
			this.kor = kor;
			this.eng = eng;
			this.mat = mat;
		}
	public Sungjuk(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	//method
	public void calc() {
		aver = (kor+eng+mat)/3; // field
	}
	public void disp() {
		String name = "솔데스크"; // 일반지역변수
		System.out.println(name);
		System.out.println(this.name); //field
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.mat);
		System.out.println(this.aver);
	}
}//class e
public class ThisTest {
/* 
 		scope : 유효범위
 	  	전역변수 global variable
 	  	지역변수 local variable -> 우선순위가 높다
 */
	
	
	public static void main(String[] args) {
		//this	: 나 자신을 가리키는 대명사
		//			: field와 일반 지역변수를 구분	
		//this()
		
		Sungjuk one = new Sungjuk();  //one 객체

		Sungjuk two = new Sungjuk("홍길동", 10, 15, 25);  //one 객체
		two.calc();
		two.disp();
		
		
		
	}//main e
}// class e
