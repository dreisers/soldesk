package oop1122;

public class MethodTest {

	public static void test() { //함수정의
		System.out.println("JAVA");
		return;  //호출한 곳으로 되돌아 감
	}//test e
	
	public static void test2() {
	
//		test(); 함수는 서로 호출관계이다
//		test2(); 자신의 함수 호출 할 수 있다. (재귀적 함수호출)
//		main(); 에러. main()함수는 JVM이 호출한다.
		
		System.out.println("JSP");
	} //test2 e
	//return; 마지막 return은 생략 가능 
	public static void main(String[] args) {
//		메소드 method 
//		함수, function, procedure, 기능
//		메소드명 : 한글 불가능, 첫글자 숫자 불가능
//		               의미부여
//		식별자 : 클래스명, 변수명, 메소드명
//		메소드 작성 : 1) parameter(argument value 전달값)
//						   2) 리턴값 유무  -> 무 : void
		
//		형식 : 리턴형 메소드명() {}
//		test 변수명, test() 메소드
//		함수정의, 함수호출
		
		test(); //함수호출
		test();
		test();

		test2();
		test2();
	}//main e
}//class e
