package oop1121;

public class SungjukTest {

	public static void main(String[] args) {
//		성적프로그램
		
		String[] name = {"홍길동","무궁화","라일락","진달래","개나리"};
		int[] kor = {100, 97, 71, 39, 40};
		int[] eng = {100, 90, 80, 92, 67};
		int[] mat = {95, 100, 85, 90, 35};
		int[] aver = new int[5];
		int[] rank = {1, 1, 1, 1, 1};
		int size = name.length;

		
		//평균
		for(int idx=0; idx<size; idx++) {
			aver[idx] = (kor[idx]+eng[idx]+mat[idx])/3;
	}//for e
	
		
		
		
		//등수
		
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++)
			if(aver[a]<aver[b]) {
				 rank[a] = rank[a] + 1;
			}
		}
		
//		출력
		for(int idx=0; idx<size; idx++) {
			System.out.print(name[idx] + " " );
			System.out.print(kor[idx] + " " );
			System.out.print(eng[idx] + " " );
			System.out.print(mat[idx] + " " );
			System.out.print(aver[idx] + " " );
			System.out.print(rank[idx] + " " );
//			문) 과락(합격 재시험 불합격) 

			if(aver[idx]>=70) {
				if(kor[idx]< 40 || eng[idx]< 40 || mat[idx]< 40) {
					System.out.print("재시험");
				}else  {
					System.out.print("합격");
				}
		}else {
			System.out.print("불합격");
		}
			
		
//		문) 평균 10점당 * 한개씩
				for(int n=1; n<=aver[idx]/10; n++) {
					System.out.print("*");
			}
			
//		문) 평균 95이상 장학생 
			
			if(aver[idx]>=95) {
				System.out.print(" " +  "장학생");}
			System.out.println();
			
			
		}
	}//main e
}//class e
