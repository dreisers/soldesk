package oop1116;

public class SwitchTest {

	public static void main(String[] args) {
//			switch~case문
//			break문 : 조건문을 빠져나갈때
//			case값의 목록은 반드시 순차적일 필요는 없다.
/*
			switch(값) {
				case 값1 : 처리식1; break;
				case 값2 : 처리식2; break;
				case 값3 : 처리식3; break;
			}
		
		
	switch(20) {
	case 10 : System.out.println("SEOUL"); break;
	case 20 : System.out.println("JEJU"); break;
	case 30 : System.out.println("BUSAN"); break;}//switch end
	
	switch(20) {
	case 10 : System.out.println("SEOUL"); break;
	case 20 : System.out.println("JEJU"); 
	case 30 : System.out.println("BUSAN"); break;
	default : System.out.println("etc"); //나머지
	}
	
/*
//	문) 국어 90이상 A
//			    80       B
//			    70       C
//			    60       D
//			    나머지 F
		int kor = 85;
		switch(kor/10) {
		case 10 : System.out.println("국어 : A");break;
		case 9 : System.out.println("국어 : A");break;
		case 8 : System.out.println("국어 : B");break;
		case 7 : System.out.println("국어 : C");break;
		case 6 : System.out.println("국어 : D");break;
		default  : System.out.println("국어 : F");
		}

//		문)
		int a = 3, b=5;
		char op = '/';
		switch(op) {
		case '+' : System.out.println(a+b);break;
		case '-' : System.out.println(a-b);break;
		case '*' : System.out.println(a*b);break;
		case '/' : System.out.println((double)a/b);break;
		case '%' : System.out.println(a%b);break;}
*/
//		문) 성별, 나이
		int code = 3; 
		
		switch(code%2) {
		case 0 : System.out.println("여자");break;
		case 1 : System.out.println("남자");break;
		}
//		나이 : 성별코드가 1, 2 면 1900대생
//		                         3, 4 면 2000 이후 출생
		int myYear = 15;
		int age = 0;
		switch(code) {
		case 1 : myYear = myYear + 1900;break;
		case 2 : myYear = myYear + 1900;break;
		case 3 : myYear = myYear + 2000;break;
		case 4 :myYear = myYear + 2000;break;
		}
		age = 2018-myYear;
		System.out.println("나이 : " + age);
		
	}//
}//
