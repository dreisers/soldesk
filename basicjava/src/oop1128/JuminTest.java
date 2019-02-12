package oop1128;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

class Jumin {
	private String jumin;
	public Jumin() {}
	public Jumin(String jumin) {
		this.jumin = jumin;
	}
	
	//주민번호가 맞으면 flag = true
	public boolean validate() {
		boolean flag = false;
	
		Integer[] sum = new Integer[]
								{ 2, 3, 4, 5, 6, 7,
								  8, 9, 2, 3, 4, 5 };
		Integer[] save = new Integer[12];
		int size = save.length;
		int hap = 0;
		for(int idx=0; idx<size; idx++) {
		int num = Integer.parseInt(jumin.substring(idx, idx+1)); 
		save[idx] = num * sum[idx];
		hap = hap + save[idx];
		}//for e
		int m = (11-(hap%11))%10;
		if(m==Integer.parseInt(jumin.substring(12))) {
			flag = true;
		}
		return flag;
	}
	
public void disp() {
	//태어난 년, 월, 일 가져오기
	int myyear = Integer.parseInt(this.jumin.substring(0, 2));
	int mymonth = Integer.parseInt(this.jumin.substring(2, 4));
	int mydate = Integer.parseInt(this.jumin.substring(4, 6));
	
	
	//성별코드
	int code = Integer.parseInt(this.jumin.substring(6,7));
	switch(code) {
	case 1:
	case 2: myyear = myyear + 1900; break;
	case 3:
	case 4: myyear = myyear + 2000; break;
	}
	//1)성별
	 String gender = "";
     switch(code%2) {
     case 0 : gender = "여자"; break;
     case 1 : gender = "남자"; break;
     }
	//2)나이 
	Calendar today = Calendar.getInstance();
	int age =  today.get(Calendar.YEAR) - myyear;
					
		
		//3)띠 %12 -> 0 =원숭이
		String[] B = {"원숭이", "닭", "개", "돼지", "쥐", "소",
						   "호랑이", "토끼", "용", "뱀", "말", "양" };
		String gan = B[myyear%12]; //배열안에 연산 가능!
		
		//출력
		System.out.println("주민번호 : " + this.jumin);
		System.out.println("태어난 년도 : " + myyear);
		System.out.println("태어난 월 : " + mymonth);
		System.out.println("태어난 일 : " + mydate);
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("띠 : " + gan);
		
		
		//4)살아온 일수 2018 11 28 - 1994 01 11 = ?
		Calendar myBirth = Calendar.getInstance();
		myBirth.set(Calendar.YEAR, myyear);
		myBirth.set(Calendar.MONTH, mymonth-1);
		myBirth.set(Calendar.DATE, mydate);
		
		int alive = 1;
		while(!myBirth.after(today)) {
			alive++;
			System.out.print(myBirth.get(1));
			System.out.print(myBirth.get(2));
			System.out.print(myBirth.get(5));
			System.out.println();
			myBirth.add(Calendar.DATE, 1);
		}
		System.out.println("살아온 일 수 : " + alive);
		//현재년도 5년을 더하시오
		//cal.add(Calendar.YEAR, 5); 2023
		//3개월을 빼시오
		//cal.add(Calendar.MONTH, -3); 2023-7-28
		//cal.add(Calendar.DATE, 1); 2023-7-29
		
		//날짜데이터 생성하기

/*		cal.set(1989, 5, 30);
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH));
		System.out.println(cal.get(Calendar.DATE));
		
		
		cal.set(Calendar.YEAR, 2018);
		cal.set(Calendar.MONTH, Calendar.NOVEMBER);
		cal.set(Calendar.DATE, 28);
		
	
		GregorianCalendar cal1 = new GregorianCalendar();
		if(cal1.isLeapYear(2018)) {
			System.out.println("윤년");
		}else {
			System.out.println("평년");
		}
		
		GregorianCalendar cal2 = new GregorianCalendar(1989, 5, 3);
		System.out.println(cal2.get(Calendar.YEAR));
		System.out.println(cal2.get(Calendar.MONTH));
		System.out.println(cal2.get(Calendar.DATE));*/
}
}//class e
public class JuminTest {

	public static void main(String[] args) {
			// 주민번호가 유호한지 검증하는 프로그램
			// 성별, 나이, 띠, 살아온 일수
		Jumin id = new Jumin("9401111187911");
		if(id.validate()) {
			System.out.println("주민번호 맞음");
			id.disp();
		}else {
			System.out.println("주민번호 오류");
		}
			
		
	}//main e
}//class e
