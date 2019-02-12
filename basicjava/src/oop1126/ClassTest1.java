package oop1126;

class Sungjuk { // -> package 생략되어있음 
	
	//멤버변수, field, column
	public String name;				//모두공개
	int kor, eng, mat;					//package 접근제어 생략
												//oop1126패키지내에서만 접근 허용
	private int aver;					//비공개
	//클래스 내부에서는 접근제어와 상관없이 모든 멤버들간에
	//접근할수있다.

	//멤버함수, method, function, procedure
	void calc() {
		//클래스 내부에서는 접근제어와 상관없이 모든 멤버들간에
		//접근 할 수 있다.
		aver = (kor+eng+mat)/3;
	}//calc e
	public void disp() { 
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(mat);
		System.out.println(aver);
	}//disp e
	private void test() {}//test e 
} //class end

public class ClassTest1 {
	public static void main(String[] args) {
//		class 클래스
//		클래스 구성 : 변수 + 함수
	
/*		멤버변수(field) + 멤버함수(method)
		Access Modifier 접근제어, 접근수정
		1) private : 비공개
		2) package : 현재 폴더에서만 접근허용
		3) protected : 다른 폴더에 있는 상속관계 클래스도 접근허용
		4) public : 모두 공개
*/
		
		//주의사항		
//		한개의 .java소스파일에 여러개의 클래스 정의가 가능하다
//		이럴경우 한개의 클래스만 public해야 된다.
		
//		클래스 : 사용자 정의 자료형
//		자료형 : 기본형, 참조형(클래스)
//		참조형 : 메모리 할당을 해야 한다.
//		new연산자 : 메모리 할당
		
		
/*		int a = 3; // a : 변수
		Sungjuk sj = new Sungjuk(); //sj : 객체 Object
		sj.name = "";
		sj.kor = 50;
		sj.eng = 60;
		sj.mat = 70;
//		sj.aver  private 속성은 클래스 내부에서만 접근가능하다
		
		System.out.println(sj.name);
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.mat);
		
		System.out.println(Integer.SIZE);
		System.out.println(Math.PI);
		
		sj.calc();
		sj.disp();
*/
		//sj.test(); 에러. private 속성은 접근x
		
//		Object Oriented program 객체 지향 프로그램
		Sungjuk kim = null; //객체 이름만 선언. 
									  //객체 초기화
		
//		int a = null; 에러
		kim = new Sungjuk(); //생성자함수
		kim.name = "무궁화";
		kim.kor = 10;
		kim.eng = 20;
		kim.mat = 35;
//		kim.aver 에러
		
		kim.calc();
		kim.disp();
		
		Sungjuk lee = null;
		lee.disp();
	}//main e
}// class e
