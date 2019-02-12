package oop1116;

public class IfTest2 {

	public static void main(String[] args) {
//		if조건문
//		성적프로그램
		String name = "홍길동";
		int kor=39, eng=100, mat=80;
		int aver = (kor+eng+mat)/3;
		
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("평균 : " + aver);
//		문) 평균 95 이상이면 장학생
			if(aver>=95) {
				System.out.println("장학생");}
			
				
				
//		문) 국어 90이상이면 "A"
				if(kor>=90) {
					System.out.println("A");	
			}else if(kor>=80) {
				System.out.println("B");
			}else if(kor>=70) {
				System.out.println("C");
			}else if(kor>=60) {
				System.out.println("D");
			}else {
				System.out.println("F");	}
//		문) 평균 70점 이상이면 합격 
//		    단, 세과목중에서 한 과목 이라도 40미만이면 "재시험" 
//			평균 70점 미만이면 "불합격"
				if(aver>=70) {
						if(kor< 40 || eng< 40 || mat< 40) {
		//					40 < 40 
							System.out.println("재시험");
						}else  {
							System.out.println("합격");
						}
				}else {
					System.out.println("불합격");
				}
				
				
				
//				2)
				if(aver<70) {
					System.out.println("불합격");
				}else if(aver>=70 && kor>=40 && eng>=40 && mat>=40) {
					System.out.println("합격");
				}else {
					System.out.println("재시험");}
				
				
//		문) 계산기 프로그램
			double a = 3, b =5;
			char op = '+';
//			출력결과   
//			3+5=8    3-5=2  3*5=15
			if(op=='+') {
				System.out.println((int)a + "" + op + "" + (int)b + "=" + (int)(a+b));
			}else if(op=='-') {
				System.out.println((int)a + "" + op + "" + (int)b + "=" + (int)(a-b));
			}else if(op=='*') {
				System.out.println((int)a + "" + op + "" + (int)b + "=" + (int)(a*b));
			}else if(op=='%') {
				System.out.println((int)a + "" + op + "" + (int)b + "=" + (int)(a%b));
			}else { 
				System.out.println(a + "" + op + "" + b + "=" + (a/b));}
//			
			int c = 3, d =5;
			char ope = '/';
			int res1 = 0;
			double res2 = 0.0;
			if(ope=='+') {
				res1 = c+d;
			}else if(ope=='-') {
				res1 = c-d;
			}else if(ope=='*') {
				res1 = c*d;
			}else if(ope=='/') {
				res2 = (double)c/d;
			}else if(ope=='%') {
				res1 = c%d;}
			if(ope=='/') {
				System.out.println(c + "" + ope + "" + d + "=" + res2);
			}else {
				System.out.println(c + "" + ope + "" + d + "=" + res1);}
			}//			
	}//

