package oop1116;

public class OperatorTest6 {

	public static void main(String[] args) {
//		단항, 이항
/*		int a = 3;
		a = a * 2; // 이항
		a = a * -1;
		a = -a;  //단항
		System.out.println(a);
*/
//		삼항연산자 (조건) ? : 
//		조건 : boolean형
//		임의의 수가 양수, 음수 ? 
/*		int a = 2018;
		String str = (a>=1) ? "양수"  : "음수";
		System.out.println(a + "은 " + str + " 입니다.");
//		문)임의의 수가 짝수, 홀수?
		String h = (a%2==0) ? "짝수" : "홀수";
		System.out.println(a + "은 " + h + " 입니다.");
//		문)임의의 수가 2의 배수이면서 5의 배수인지?
		String b = (a%2==0 && a%5==0) ? "true" : "false";
		System.out.println(b);
//		문)임의의 년도가 윤년, 평년?
		String y = (a%4==0 || a%100!=0 && a%400==0) ? "윤년" : "평년";
		System.out.println(a + "년은 " + y + " 입니다.");
*/
//		문) 임의의 문자를 대소문자 서로 바꿔서 출력
		char ch = 'b';
		char r = (ch>='a' && ch<='z') ? (char)(ch-32) : (char)(ch+32);
		System.out.println(r);
//		문) 세개의 수중에서 최대값 출력
		int a = 3, b=6, c=8;
		int m = (a>b) ? a : b;
		m = (m>c) ? m : c;
		System.out.println(m);
		
		
	}
}
