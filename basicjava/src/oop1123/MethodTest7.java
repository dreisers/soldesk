package oop1123;

public class MethodTest7 {
		public static void test(){
			test(); //재귀함수
//			main(); 사용자가 호출할수 없다.
		}//test e
		public static int fact(int a) {
			if(a==0) {
				return 1;
			}else {
				return a*fact(a-1);
			}
		}//fact e
	public static void main(String[] args) {
//		재귀적 함수 호출
//		자신이 자신의 함수 호출
		
		int result = fact(4);
		System.out.println(result);
		
	}//main e
}// class e
