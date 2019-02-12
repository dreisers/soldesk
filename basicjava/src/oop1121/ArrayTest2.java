package oop1121;

public class ArrayTest2 {

	public static void main(String[] args) {
//			Array 배열
//			1차원 배열 -> [열, column]
//			2차원 배열 -> [줄] [열]
//		    3차원 배열  -> 자바X

//			1) 1차원 배열
/*	
			int[] kor = new int[3];
			kor[3] = 50;
			double[] eng = new double[3];
			char[] ch = new char[5];
			long[] mat = new long[3];
			String[] name = new String[4];
			
		int[] kor = {10, 20, 30};
		int size = kor.length; //배열 요소의 갯수
		System.out.println(kor[0]);
		System.out.println(kor[1]);
		System.out.println(kor[2]);
		
		for(int idx=0; idx<size; idx++) {
			System.out.println(kor[idx]);
		}
		
		double[] aver = {1.2, 4.6, 5.3};
		int size = aver.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(aver[idx]);
		}
		
		String[] name = {"홍길동","무궁화","라일락"};
		int size = name.length;
		for(int idx=0; idx<size; idx++) {
			System.out.println(name[idx]);
		}
*/		
		char[] ch = {'H','a','p','p', 'y' };
		int size = ch.length;
/*		for(int idx=0; idx<size; idx++) {
			System.out.println(ch[idx]);
		}
*/
//		문) 알파벳 'p'의 갯수를 구하시오
/*	
		int count = 0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='p') {
				count = count + 1;
		}
			}
		System.out.println("알파벳 p는 " + count + "개");
*/		
//		문) 대문자, 소문자의 갯수를 각각 구하시오
/*		
		int a = 0, b =0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='A'&&ch[idx]<='Z') {
				a = a + 1;
			}else{
				b = b + 1;
			}//if e
		}//for e
		System.out.println("대문자" + a + "개");
		System.out.println("소문자" + b + "개");
*/	
//		문) 대소문자 서로 바꿔서 출력하시오
/*		
		int a = 0, b =0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='A'&&ch[idx]<='Z') {
				System.out.println((char)(ch[idx]+32));
			}else{
				System.out.println((char)(ch[idx]-32));
			}//if e
		}//for e
*/
//		문) 모음의 갯수를 구하시오 aeiou
/*		
		int mo = 0;
		for(int idx=0; idx<size; idx++) {
			switch(ch[idx]) {
			case 'A':  
			case 'a':
			case 'E':  
			case 'e':
			case 'I':
			case 'i':
 			case 'O':
 			case 'o':
			case 'U':
			case 'u': mo++;
			}
			
		}//for e
		System.out.println(mo);
*/		
		int count = 0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='a'||ch[idx]=='e'||ch[idx]=='i'||ch[idx]=='o'||ch[idx]=='u'
					||ch[idx]=='A'||ch[idx]=='E'||ch[idx]=='I'||ch[idx]=='O'||ch[idx]=='U')
			  {
				count = count + 1;
		}
			}
		System.out.println("모음의 갯수는" + count + "개");
		
		
	}//main e
}//class e
