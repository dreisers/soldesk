package oop1127;

import java.util.StringTokenizer;

public class StringTest2 {

	public static void main(String[] args) {
			//String			: ������ ���ڿ�
			//StringBuffer	: ���ڿ����� ������ �ϴ� ��� ��õ
			//StringBuilder	: ���ڿ����� ������ �ϴ� ��� ��õ
			//�ӵ� : StringBuilder -> StringBuffer -> String
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

	//Ư�����ڸ� �������� ���ڿ� �и��Ҷ� split()
		String name = "kim,lee,park";
		
		//�и��ϰ��� �ϴ� ���� ���ڿ��� default�� : ����
//		StringTokenizer st = new StringTokenizer(name);
		StringTokenizer st = new StringTokenizer(name,",");
		while(st.hasMoreTokens()) { //, ��ȣ�� �ִ���?
			String word = st.nextToken(); //�и��� �� ��������
			System.out.println(word);
		}// whule e
*/		
		
		String str = "Gone With The Wind";
		StringTokenizer st = new StringTokenizer(str);
	 
	
	}//main e
}// class e
