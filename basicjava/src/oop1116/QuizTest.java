package oop1116;

public class QuizTest {
	public static void main(String[] args) {
		// 문제) 운행거리에 따라 택시 요금을 계산하는 프로그램
	    // 2000m까지는 기본요금 900원이고
	    // 2000m초과 운행시 200m단위마다
	    // 기본요금에 100원씩 가산하여 요금을 계산한다
	    
	    /* 출력결과
	       운행거리 : 3000
	       요금 : ?
	    */
		int distance = 3000;
		int fee = 0;
		if(distance<=2000) {
			fee = 900;
		}else {
			int over = distance-2000;
			fee = 900 + ((over/200) * 100);
		}
		System.out.println("운행거리 : " + distance);
		System.out.println("기본요금 : 900" );
		System.out.println("전체요금 : " + fee);
	  }//main() end
	}//class end
