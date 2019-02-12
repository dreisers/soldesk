package oop1121;

public class WeekdayTest {

	public static void main(String[] args) {
//		요일 구하는 프로그램
//		2018 11 21 -> 수요일
/*		
		서기 1년1월1일 ~ 서기 2018년11월21일 = 총 일수
		총일수 %7 0일1월2화3수4목5금6토 
		
		int cYear=2018, cMonth=11, cDate=21;
		int hap=0;
		for(int y=1; y<cYear; y++) {
			if(y%4==0&&y%100!=0||y%400==0) {
				hap = hap + 366;
			}else {
				hap = hap + 365;
			}
		}
		System.out.println(hap);
		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if(cYear%4==0&&cYear%100!=0||cYear%400==0) {
			month[2] = 29;
			}
			for(int m=1; m<cMonth; m++) {
				hap = hap + month[m];
			}
		hap = hap + cDate;
		System.out.println(hap);
		System.out.println(hap%7);
		switch(hap%7) {
		case 0 : System.out.println("일요일"); break;
		case 1 : System.out.println("월요일"); break;
		case 2 : System.out.println("화요일"); break;
		case 3 : System.out.println("수요일"); break;
		case 4 : System.out.println("목요일"); break;
		case 5 : System.out.println("금요일"); break;
		case 6 : System.out.println("토요일"); break;
		}
*/
		
		
		//		살아온 일수
		int myYear=1994, myMonth=1, myDate=11;
		int myhap=0;
		for(int y=1; y<myYear; y++) {
			if(y%4==0&&y%100!=0||y%400==0) {
				myhap = myhap + 366;
			}else {
				myhap = myhap + 365;
			}
		}
		int[] mmonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if(myYear%4==0&&myYear%100!=0||myYear%400==0) {
			mmonth[2] = 29;
			}
			for(int m=1; m<myMonth; m++) {
				myhap = myhap + mmonth[m];
			}
		myhap = myhap + myDate;
		System.out.println(myhap);	
		
		int cYear=2018, cMonth=11, cDate=21;
		int hap=0;
		for(int y=1; y<cYear; y++) {
			if(y%4==0&&y%100!=0||y%400==0) {
				hap = hap + 366;
			}else {
				hap = hap + 365;
			}
		}
			int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			if(cYear%4==0&&cYear%100!=0||cYear%400==0) {
			month[2] = 29;
			}
			for(int m=1; m<cMonth; m++) {
				hap = hap + month[m];
			}
		hap = hap + cDate;
		System.out.println(hap);
	
		System.out.println(hap-myhap);
	
	
	
	
	
	
	}//main e
}//class e
