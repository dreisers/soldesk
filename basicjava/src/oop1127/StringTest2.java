package oop1127;

import java.util.StringTokenizer;

public class StringTest2 {

	public static void main(String[] args) {
			//String			: 간단한 문자열
			//StringBuffer	: 문자열에서 연산을 하는 경우 추천
			//StringBuilder	: 문자열에서 연산을 하는 경우 추천
			//속도 : StringBuilder -> StringBuffer -> String
/*		
		String str = "";
		str = str + "one";
		str = str + "two";
		str = str + "three";
		System.out.println(str);
		System.out.println(str.length());
		
		str = "";
		System.out.println(str.length());
*/
/*		
		StringBuilder sb = new StringBuilder("");

		sb.append("one");
		sb.append("two");
		sb.append("three");
		System.out.println(sb.toString());
		System.out.println(sb.length());
		
		sb.delete(0, sb.length());
		System.out.println(sb.length());
*/	
/*		StringBuffer sb = new StringBuffer();
		sb.append("one");
		sb.append("two");
		sb.append("three");
		System.out.println(sb.toString());
		System.out.println(sb.length());
		
		sb.delete(0, sb.length());
		System.out.println(sb.length());

	//특정문자를 기준으로 문자열 분리할때 split()
		String name = "kim,lee,park";
		
		//분리하고자 하는 기준 문자열의 default값 : 공백
//		StringTokenizer st = new StringTokenizer(name);
		StringTokenizer st = new StringTokenizer(name,",");
		while(st.hasMoreTokens()) { //, 기호가 있는지?
			String word = st.nextToken(); //분리된 값 가져오기
			System.out.println(word);
		}// whule e
*/		
		
		String str = "Gone With The Wind";
		StringTokenizer st = new StringTokenizer(str);
	 
	
	}//main e
}// class e
