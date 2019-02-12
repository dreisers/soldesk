package oop1115;

public class OperatorTest2 {

	public static void main(String[] args) {
//		연산자 연습
//		문) 각 지폐의 갯수를 구하시오 
/*		int money = 54840;
		int a = money/10000;
		money = money%10000;
		int b = money/1000;
		money = money%1000;
		int c = money/100;
		money = money%100;
		int d = money/10;
		System.out.println("만원" + a + "장");
		System.out.println("천원" + b + "장");
		System.out.println("백원" + c + "장");
		System.out.println("십원" + d + "장");
*/		
//		문2) 365.2422일
//		출력결과 : 365일 ?시간 ?분 ?초
//		1분 60초 1시간 60분 3600초 1일 24시간 86400초
/*		double day = 365.2422;
		double h = day*24;
		double m = day*1440;
		double s = day*86400;
		System.out.println((int)day +"일" + " = 1년");
		System.out.println((int)h +"시간" );
		System.out.println((int)m +"분");
		System.out.println((int)s +"초");
		*/
		double year = 365.2422;
	    int day = (int)(year * 86400);//31556926
	    
	    int d = day/86400; //365일
	    day = day%86400;
	    
	    int h = day/3600; //5시간
	    day = day%3600;
	    
	    int m = day/60;   //48분
	    int s = day%60;   //46초
	    
	    System.out.println("1년:" + year);
	    System.out.println(d + "일");
	    System.out.println(h + "시간");
	    System.out.println(m + "분");
	    System.out.println(s + "초");
		
	}
}
