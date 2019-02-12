package oop1115;

public class ConversionTest {
		public static void main(String[] args) {
			
//			1)자동형 변환
	/*		byte a = 3;
			int b = a;
			long c = b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			float d = 4.5f;
			double e = d;
			System.out.println(d);
			System.out.println(e);
			*/
/*			int a= 3;
			double b = a;
			System.out.println(a);
			System.out.println(b);

			System.out.println(5/3);
			System.out.println(5/3.0);
			System.out.println(5.0/3);
			System.out.println(5/3f);
			*/
//			2)강제형 변환 
//			형식 : (자료형)값
			/*System.out.println((int)3.5);
			System.out.println((double)4);
			System.out.println((int)3.6+(int)4.7);
			System.out.println((int)(3.6+4.7));
			*/
			int kor = 87, eng = 90, mat = 85;
//			double aver = (kor+eng+mat)/3.0;
			double aver = (double)(kor+eng+mat)/3;
			
			System.out.println(aver);
			
			}
	}