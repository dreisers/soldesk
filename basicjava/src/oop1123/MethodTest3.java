package oop1123;

public class MethodTest3 {
	
	public static void abstest(int a) {
		System.out.println(Math.abs(a));
	}//abstest e
	
	public static void facttest(int b) {
		long gop = 1; 
		for(int a=b; a>=1; a--){
			gop = gop * a;
			
			}
		System.out.println(gop);
	}//facttest e
	
	public static void leaptest(int a) { //2018 윤년이냐 평년이냐
		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
	}//leaptest e
	
	public static void graphtest(char ch, int a) {
		for(int b=1; b<a; b++) {
			System.out.print(ch);
		}
		
		
	}//graphtest e
	
	
	public static void main(String[] args) {
//		메소드 연습문제

		
//		문) 절대값을 구하시오
		abstest(-3);
		
		
//		문) 팩토리얼값을 구하시오
//		fact(4);
		
		facttest(4);
//		문) 윤년, 평년을 구분해서 출력하시오
		leaptest(2018);
		
		
//		문) 그래프를 출력하시오 ##########
		graphtest('#', 10);
		
		
	}//main e
}// class e
