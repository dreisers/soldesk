package oop1121;

public class ArrayTest2 {

	public static void main(String[] args) {
//			Array �迭
//			1���� �迭 -> [��, column]
//			2���� �迭 -> [��] [��]
//		    3���� �迭  -> �ڹ�X

//			1) 1���� �迭
/*	
			int[] kor = new int[3];
			kor[3] = 50;
			double[] eng = new double[3];
			char[] ch = new char[5];
			long[] mat = new long[3];
			String[] name = new String[4];
			
		int[] kor = {10, 20, 30};
		int size = kor.length; //�迭 ����� ����
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
		
		String[] name = {"ȫ�浿","����ȭ","���϶�"};
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
//		��) ���ĺ� 'p'�� ������ ���Ͻÿ�
/*	
		int count = 0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]=='p') {
				count = count + 1;
		}
			}
		System.out.println("���ĺ� p�� " + count + "��");
*/		
//		��) �빮��, �ҹ����� ������ ���� ���Ͻÿ�
/*		
		int a = 0, b =0;
		for(int idx=0; idx<size; idx++) {
			if(ch[idx]>='A'&&ch[idx]<='Z') {
				a = a + 1;
			}else{
				b = b + 1;
			}//if e
		}//for e
		System.out.println("�빮��" + a + "��");
		System.out.println("�ҹ���" + b + "��");
*/	
//		��) ��ҹ��� ���� �ٲ㼭 ����Ͻÿ�
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
//		��) ������ ������ ���Ͻÿ� aeiou
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
		System.out.println("������ ������" + count + "��");
		
		
	}//main e
}//class e
