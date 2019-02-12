package oop1119;

public class ForTest {

	public static void main(String[] args) {
//		반복문
		/*
		 * for(시작값 ; 종료값 ; 증감) { } 조건 -> boolean형 Scope : 유효범위
		 */
//		1) 증가에 따른 반복

//		for (int a = 1; a <= 3; a++) {
//			System.out.println("JAVA");
//		}

//		2) 감소에 따른 반복
		/*
		  int b; //변수의 scope -> 선언이후 사용할수 있다 for(b=3; b>=1; b=b-1) {
		  System.out.println("JSP"); } System.out.println(b);
		  
		  // for(;;) {} 무한Loop // break -> 반복문 탈출
		  
		  for(int a=10; a<=100; a=a+10) { System.out.println(a+"JAVA"); }
		  
		  for(int b=100; b>=10; b=b-10) { System.out.println(b+"JSP"); }
		  
		  
		  for(char ch='A'; ch<='Z'; ch=(char)(ch+1)) { System.out.println(ch);}
		  for(char ch='z'; ch>='a'; ch=(char)(ch-1)) { System.out.println(ch);}
		  
		  int dan=4; for(int a= 1 ; a<=9; a++) { System.out.println(dan + "*" + a + "="
		  + dan*a); }
		  
		 
//		1~5중에서 짝수만 출력
		for (int a = 1; a <= 5; a++) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}

//		문) 서기 1년 ~ 서기 2018중에서 윤년만 출력
		for (int y = 1; y <= 2018; y++) {
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
				System.out.println(y);
			}
		}
*/
//		알고리즘 기초 : 갯수, 누적
//		1~5중에서 짝수의 갯수? 
/*		int count = 0; 
		for (int a = 1; a <= 5; a++) {
			if (a % 2 == 0) {
				count = count +1;
			}
		}
		System.out.println("짝수 갯수 : " + count);
		
		int count = 0;
		for (int y = 1; y <= 2018; y++) {
			if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0) {
			count = count +1;
			}
		}
			System.out.println(count +"개");		
*/		
//		문) 알파벳을 한줄에 5개씩 출력
		int count = 0;
		for(char ch = 'A'; ch<='Z';ch= (char)(ch+1)) {
			count = count + 1;
			System.out.print(ch);
//			if(count%5==0) System.out.println();
//-----------------------------------------1)		
		if(count==5) {
			System.out.println();
		count = 0;}						//초기값으로 돌려서 
		}                            			//다시 카운트
//	-----------------------------------------2)
	}// me
}// ce
