package oop1121;

public class ArrayTest3 {

	public static void main(String[] args) {
//		Array �迭
		int[] su = {-5, 6, 0, 4, 3};
		int size = su.length;
		
/*		//��) su�迭 ��� ��ü�� ���� ���Ͻÿ� 8 
		int hap=0;
		for(int idx=0; idx<size; idx++) {	
			hap = hap + su[idx];
		}//for e
		System.out.println("���� 1��" +"=" + hap);
		//��) ����� ¦���� �� 10
		int x=0;
		for(int idx=0; idx<size; idx++) {	
		if(su[idx]%2==0&&su[idx]>0){
			x = x + su[idx];
		}
	}//for e
System.out.println("���� 2��" +"=" + x);		
		
		//��) ������ ���� 1
		int count=0;
		for(int idx=0; idx<size; idx++) {	
			if(su[idx]<0){
				count = count + 1;
			}
		}//for e
		System.out.println("���� 2��" +"=" + count + "��");		
		
		//��) su[2]�� ����� ���Ͻÿ� 4
		int rank = 1;
		for(int idx=0; idx<size; idx++) {
			if(su[2]<su[idx]) {
				 rank = rank + 1;
		 	}
		}
		System.out.println("���� 3��="+ rank + "��");
		//�ִ밪, �ּҰ��� ���Ͻÿ�
		int max = su[0], min = su[0];
		for(int idx=0; idx<size; idx++) {	
			if(max<su[idx]){
				max = su[idx];
			}
			if(min>su[idx]) {
				min = su[idx];
			}
		}//for e
		System.out.println("���� 4��" );
		System.out.println("�ִ밪��" + max);
		System.out.println("�ּҰ���" + min);
*/		
//		��) su�迭����� ������ ����� ���Ͻÿ�
		int[] rank = {1, 1, 1, 1, 1};
		for(int a=0; a<=4; a++) {
			for(int b=0; b<=4; b++) {
				if(su[a]<su[b]) {
					rank[a] = rank[a] +1;
				}
			}
				}//for e
				for(int idx=0; idx<size; idx++)
					
					System.out.print(rank[idx] + "");
	}//main e
}//class e
