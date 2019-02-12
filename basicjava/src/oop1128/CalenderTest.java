package oop1128;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		// 날짜 관련 클래스
		
		//현재 시스템의 날짜정보
		Calendar cal = Calendar.getInstance();
		//현재년도
		System.out.println(cal.get(1));//year
		System.out.println(cal.get(2)+1);//month
		System.out.println(cal.get(5));//day
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//요일(일월화수목금토) -1234567
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));//4
		//시간 (24시간기준)
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
	}//main e
}// class end
