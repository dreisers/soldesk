package oop1127;

public class StringTest {

	public static void main(String[] args) {
		// String 클래스
		String name = "홍길동";
		String str = new String("Gone With The Wind");
/*		
		//글자갯수
		System.out.println(str.length()); //18
		//글자순서 (0부터 시작)
		System.out.println(str.indexOf("d"));//17
		//처음으로 나오는 글자의 인덱스값 반환
		System.out.println(str.indexOf("W"));//5
		//찾고자 하는 문자열이 없는 경우
		System.out.println(str.indexOf("R"));//-1
		//0번째 글자
		System.out.println(str.charAt(0));//'G'
		//마지막 글자
		System.out.println(str.charAt(17));//'d'
		System.out.println(str.charAt(str.length()-1));//'d' 
		
		//빈문자열?
		System.out.println(str.isEmpty()); 
		
		//대문자, 소문자로
		System.out.println(str.toUpperCase()); //GONE WITH THE WIND
		System.out.println(str.toLowerCase()); //gone with the wind
		
		//문자열 치환(바꾸기)
		System.out.println(str.replace('n', 'N'));// GoNe With the WiNd
		
		
		//엔터 -> <br>로 치환
//		System.out.println(str.replace('\n', '<br>'));

		//특정 문자를 기준으로 문자열 분리
		String word[] = str.split("e");
		for(int idx=0; idx<word.length; idx++) {
			System.out.println("#" + word[idx] + "#");
		}//for e
		// .csv -> 특정기호로 데이터를 구분해서 저장
		
		//문자열 자르기
		//3번째글자부터~마지막까지
		System.out.println(str.substring(3));
		//3번째 ~ (8-1)까지
		System.out.println(str.substring(3, 8));
		//(시작위치, 끝위치+1)
		
		//문)
		System.out.println(str.substring(0, 1));
		
		//문)
		System.out.println(str.substring(17, 18));
		System.out.println(str.substring(str.length()-1, str.length()));
		
		//맨 앞뒤 공백제거
		System.out.println("#" + "    S k   y  ".trim() + "#");
*/		
		//문) 이메일 @문자를 기준으로 문자열 분리
		String email = "webmaster@soldesk.com";
			int mail = email.indexOf("@");
			String id = email.substring(0, email.indexOf("@"));
			String server = email.substring(email.indexOf("@")+1, email.length());
			System.out.println("아이디 : " + id);
			System.out.println("주소 : " + server);
/*			강사님 풀이 ↓
 
			if(email.indexOf("@")==-1) {
				System.out.println("이메일 주소 틀림!!");
			}else {
				System.out.println("이메일 주소 맞음");
				System.out.println(email.substring(0, 9));
				System.out.println(email.subSequence(10, 21));
			}
			// 
				int pos = email.indexOf("@");
				String i = email.substring(0, pos);
				String ser = email.substring(pos+1);
				System.out.println(i);
				System.out.println(ser);
			//
				String word[] = email.split("@");
				for(int idx=0; idx<word.length; idx++) {
					System.out.println(word[idx]);
				}
*/				
		//문) 주민번호 : 성별, 나이
//		성별 : 남자 
//		나이 : 29
//		8+9+1+2+3+0+1+2+3+4+5+6+7
		
		String jumin = "8912301234567";
		
		int hap = 0;
		for(int idx=0; idx<jumin.length(); idx++) {
/*
			char ch = jumin.charAt(idx);
			hap = hap + Character.getNumericValue(ch);
			//getNumericValue 캐릭터형을 정수형으로 형변환
		}// for e
		System.out.println(hap);
*/		
//-------------------------------------------------2)
		
			String ch = jumin.substring(idx, idx+1);
			hap = hap + Integer.parseInt(ch);
			}
			System.out.println(hap);
			
			//성별코드
			int code = Integer.parseInt(jumin.substring(6,7));
			//태어난 년도
			int myYear = Integer.parseInt(jumin.substring(0, 2));
			switch(code) {
			case 1:
			case 2: myYear = myYear + 1900; break;
			case 3:
			case 4: myYear = myYear + 2000; break;
			}
			//나이
			int age = 2018 - myYear;
			//성별
			String gender = "";
			switch(code%2) {
			case 0 : gender = "여자"; break;
			case 1 : gender = "남자"; break;
			}
			
			System.out.println("주민번호 : " + jumin);
			System.out.println("성별 : " + gender);
			System.out.println("나이 : " + age);
	}//main e
}// class e
