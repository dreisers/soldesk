package oop1121;

public class SungjukTest {

	public static void main(String[] args) {
//		�������α׷�
		
		String[] name = {"ȫ�浿","����ȭ","���϶�","���޷�","������"};
		int[] kor = {100, 97, 71, 39, 40};
		int[] eng = {100, 90, 80, 92, 67};
		int[] mat = {95, 100, 85, 90, 35};
		int[] aver = new int[5];
		int[] rank = {1, 1, 1, 1, 1};
		int size = name.length;

		
		//���
		for(int idx=0; idx<size; idx++) {
			aver[idx] = (kor[idx]+eng[idx]+mat[idx])/3;
	}//for e
	
		
		
		
		//���
		
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++)
			if(aver[a]<aver[b]) {
				 rank[a] = rank[a] + 1;
			}
		}
		
//		���
		for(int idx=0; idx<size; idx++) {
			System.out.print(name[idx] + " " );
			System.out.print(kor[idx] + " " );
			System.out.print(eng[idx] + " " );
			System.out.print(mat[idx] + " " );
			System.out.print(aver[idx] + " " );
			System.out.print(rank[idx] + " " );
//			��) ����(�հ� ����� ���հ�) 

			if(aver[idx]>=70) {
				if(kor[idx]< 40 || eng[idx]< 40 || mat[idx]< 40) {
					System.out.print("�����");
				}else  {
					System.out.print("�հ�");
				}
		}else {
			System.out.print("���հ�");
		}
			
		
//		��) ��� 10���� * �Ѱ���
				for(int n=1; n<=aver[idx]/10; n++) {
					System.out.print("*");
			}
			
//		��) ��� 95�̻� ���л� 
			
			if(aver[idx]>=95) {
				System.out.print(" " +  "���л�");}
			System.out.println();
			
			
		}
	}//main e
}//class e
