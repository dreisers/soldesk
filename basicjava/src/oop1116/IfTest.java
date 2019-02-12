package oop1116;

public class IfTest {

	public static void main(String[] args) {
		// 제어문 : 프로그램의 흐름 제어
		// 조건문
		// 반복문

		/*
		 * if(조건) {true일때}
		 * 
		 * if(조건) {true일때} else {false일때}
		 * 
		 * if(조건) {true일때} else if(조건) {true일때} else if(조건) {true일때} else {false일때}
		 */

//		문) 임의의 수가 양수, 음수, 제로?
		/*
		 * int a = 0; if(a==0) { System.out.println("제로"); } if(a>0) {
		 * System.out.println("양수"); }else { System.out.println("음수"); } if(a>0) {
		 * System.out.println("양수"); }else if(a<0) { System.out.println("음수"); }else
		 * if(a==0) { System.out.println("제로"); }else { System.out.println("기타"); }
		 */
//		문) 절대값을 구하시오(무조건 양수)
/*		int a = -1;
		if (a > 0) {
			System.out.println(a + "의 절대값은 " + a);
		} else {
			System.out.println(a + "의 절대값은 " + -(a));
		}

//		문) 두 수 사이의 차이를 구하시오
		int x = 1, y = 5;
		if (x > y) {
			System.out.println("x와 y의 차이는 " + (x - y));
		} else {
			System.out.println("x와 y의 차이는 " + (y - x));
		}
		
*/
		
//		문) 성별코드 1, 3, 5 -> 남자
//		                  2, 4, 6 -> 여자
		int code = 2;
				if(code%2==0) {
					System.out.println("여자");
				}else {
					System.out.println("남자");
				}
	}
}
