package oop1129;

public class Quiz {

	public static void main(String[] args) {
		//��1) 5���� �����Ϳ� ���� ����� ���� �� 
		//�� �����Ϳ��� ��հ��� �A ������ ���Ͽ� ���
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
		//��2)��� �б��� ���忡 ���� �����Ͱ� �غ�Ǿ� ������,
		//�� �����Ϳ� ���� ������׷��� �ۼ��ϴ� ���α׷�
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
		//��3) ��� ȸ���� �Ǹ� ������ ������ ���� �� 
		// �Ǹ� ������ ���� �׷����� �׸��� ���α׷�
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
