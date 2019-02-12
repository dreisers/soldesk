package oop1129;

public class Quiz {

	public static void main(String[] args) {
		//문1) 5개의 데이터에 대한 평균을 구한 후 
		//각 데이터에서 평균값을 뺸 편차를 구하여 출력
/*		double hap = 0;
		int[] su = {3, 6, 4, 5, 8};
		for(int idx=0; idx<su.length; idx++) {
			hap = hap + su[idx];
		}//for e
		double aver = hap/5;
		for(int idx=0; idx<su.length; idx++) {
		double dev = su[idx] - aver;
		System.out.println(dev);
		}//for e
		//문2)어느 학급의 신장에 대한 데이터가 준비되어 있을때,
		//이 데이터에 대한 히스토그램을 작성하는 프로그램
		String[] H = {"134-139", "140-144", "145-149", "150-154", 
							"155-159", "160-164", "165-169"};
		int[] person = { 3, 2, 12, 15, 17, 18, 7};
		for(int idx=0; idx<H.length; idx++) {
				System.out.print(H[idx]);
				System.out.print("");
				for(int i=0; i<person[idx]; i++) {
					System.out.print(" *");
				}
				System.out.println();
		}
	*/	
		//문3) 어느 회사의 판매 실적이 다음과 같을 때 
		// 판매 실적에 대한 그래프를 그리는 프로그램
		int[] sell = {18, 17, 13, 12, 14, 17,
						 14, 16, 18, 19, 11, 9 };
		
		for(int s =20; s>=1; s--) {
			for(int m=0; m<=11; m++)
				 if(sell[m]>=s){
					 System.out.print("*  ");
			        }else{
			          System.out.print(" ");
			        }
			System.out.println("");
			      }
		for(int m=0; m<12; m++) { 
			System.out.print(m+1+ " ");
		} 
	}//main e
}// class e
