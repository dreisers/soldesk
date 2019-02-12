package oop1126; // 한개의 소스파일에 패키지는 한번만 선언한다.
							// 현재 자신의 클래스가 선언된 위치

class Score {
	//field 멤버변수 -> 대부분은 private로 많이 선언한다.(정보은닉)
	 private String name; //클래스 내부에서만 접근 허용
	 private int kor, eng, mat;
	 private int aver;
	 
	//constructor 생성자 함수 
	public Score() { //default constructor(기본생성자함수)
							//parameter(매개변수)가 없다
							//기본생성자함수는 자동생성된다
		System.out.println("---Score()함수 호출");
	}
	
//	생성자함수도 오버로딩(중복정의)이 가능하다
	public Score(String n) {
		name = n;
	}
	public Score(int k, int e, int m) {
		kor =k;
		eng = e;
		mat = m;
	}
	
	public Score(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
		
	}
	
	
	//method 멤버함수
	public void init(String n, int k, int e, int m) {
		name = n;
		kor = k;
		eng = e;
		mat = m;
	}
	public void calc() {
		aver = (kor+eng+mat)/3;
	}
	public void disp() {
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}
	
}//class e

public class ConstructorTest1 {

	public static void main(String[] args) {
		//constructor 생성자함수
		// - 클래스 이름과 동일한 함수다
		// - 메모리할당을 하기 위해서 필요
		// - 생성자 함수도 오버로딩이 가능하다
		// - 생성자함수는 리턴형이 존재하지 않는다.
		//desctructor 소멸자 함수 -> 자바에는 없음
		//garbage collecting 가비지 콜렉팅
		
		//Sungjuk sj; 동일한 패키지내에서 접근가능하다
/*		
		Score one = new Score();
		one.calc();
		one.disp();
		
		Score two = new Score("무궁화");
		two.calc();
		two.disp();
		
		Score three = new Score(10, 20, 30);
		three.calc();
		three.disp();
		
//		생성자 함수를 이용해서 객체 초기값을 전달할 수 있다.
		Score four = new Score("라일락", 10, 30, 50);
		four.calc();
		four.disp();
		
		Score five = new Score();
		five.init("손흥민", 90, 85, 90);
		five.calc();
		five.disp();
*/
/*		Integer a = new Integer(5); //객체
		System.out.println(a.toString());
		
		Integer b = new Integer("7");
		System.out.println(b.toString());
*/
/*		String a = "Happy";
		String b = new String("Soldesk");
		b = "Hello";
		String c = new String("Soldesk");
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		char[] ch = {'S','K','Y'};
		String d = new String(ch);
		System.out.println(d);
		
		StringBuffer sb = new StringBuffer("APPLE");
		String str = new String(sb);
		System.out.println(str.toString());
		System.out.println(str);
*/
/*	
 		Random Access Memory (휘발성 메모리) RAM
 		---------------------------------- 0 address
		static  ｜ 
 		------┼----------------------------
 		heap	  ｜ "라" 10 20 30		"손" 40 50 60
 		------┼----------------------------
 				  ｜ #100					#200
 		------┼----------------------------
		stack  ｜  a=3  					 b=5
				  ｜  four=#100		 	five=#200
		---------------------------------- 
	*/	
/*		Score four = new Score("라일락", 10, 20, 30);
		four.calc();
		
		Score five = new Score("손흥민", 40, 50, 60);
		five.calc();
		
		four.disp();
		four.disp();
*/
		String name = new String("HAPPY");
		String str = new String("HAPPY");
		
		//참조하고 있는 주소 비교
		if(name==str) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		//문자열의 내용을 비교하고자 할때
		// == 연산자는 사용하지 말것
		//equals()를 이용해서 내용 비교
		if(name.equals(str)) {
		System.out.println("같다");
		}else {
		System.out.println("다르다");
		}
		
/*		String six = name;
		System.out.println(name.hashCode());
		System.out.println(six.hashCode());
		System.out.println(str.hashCode());
*/		
		//객체가 참조하고 있는 지문형태의 값(주소)
		Score one = new Score();
		Score two = new Score();
		Score three = one;
		System.out.println(one.hashCode()); // #50
		System.out.println(two.hashCode()); // #60
		System.out.println(three.hashCode()); //#50
	}//main e
}// class e
