package oop1204;

import java.util.Arrays;

class Sungjuk {
	//field
	private int no;									//��ȣ
	private String name;						//�̸�
	private int[] answer = new int[5];		//�������
	private char[] ox = new char[5];		//OX
	public int score;								//����	
	public int rank;								//���
	
	public Sungjuk() {}
		public Sungjuk(int no, String name, int a, int b, int c, int d, int e) {
			this.no = no;
			this.name = name;
			this.answer[0] = a;
			this.answer[1] = b;
			this.answer[2] = c;
			this.answer[3] = d;
			this.answer[4] = e;
			this.rank = 1;
		}
	public void compute() {
		int[] dap = { 1, 1, 1, 1, 1 };
		//������ answer ��Ȱ� ������ ���ؼ� OX���ϱ�
		//���� ������ ���� ���� ���ϱ�
		for(int a=0; a<dap.length; a++) {
			if(answer[a]==dap[a]) {
				this.ox[a] = 'O';
				this.score = score + 20;
			}else
				this.ox[a] = 'X';
			}//for e
		
	}//compute e
	
	public void disp() {
		//���
		System.out.print(this.no + " ");
		System.out.print(this.name+ " ");
		System.out.print(this.ox[0]+ " " );
		System.out.print(this.ox[1]+ " ");
		System.out.print(this.ox[2]+ " ");
		System.out.print(this.ox[3]+ " ");
		System.out.print(this.ox[4]+ " ");
		System.out.print(this.score+ " ");
		System.out.print(this.rank);
		System.out.println();
		
	}//disp e
}//class e
public class SungjukTest {
	
	public static void main(String[] args) {
		// �������α׷� OX ǥ��
		Sungjuk[] student = {
				new Sungjuk(1, "ȫ�浿", 1, 2, 1, 1, 1), 
				new Sungjuk(2, "����ȭ", 1, 1, 1, 1, 1), 
				new Sungjuk(3, "���϶�", 3, 2, 4, 2, 1), 
				new Sungjuk(4, "���޷�", 2, 1, 4, 1, 1), 
				new Sungjuk(5, "����ȭ", 1, 1, 4, 3, 2) };
		
		int size = student.length;
		for(int idx=0; idx<size; idx++) {
	        student[idx].compute();
	    }//for end
		
		//���
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++)
			if(student[a].score<student[b].score) {
				 student[a].rank = student[a].rank + 1;
			}
		}
		
		//����
		for(int a=0; a<size-1; a++) {
			for(int b=a+1; b<size; b++) {
			if(student[a].rank>=student[b].rank) {
			Sungjuk tmp = student[a];
				student[a] = student[b];
				student[b] = tmp;
			}		
			}
		}//for e
			System.out.println("******* �� �� �� �� *******");
			System.out.println("========================");
			System.out.println("��ȣ �̸� 1 2 3 4 5 ���� ���");
			System.out.println("------------------------");
			for(int idx=0; idx<size; idx++) {
			student[idx].disp();
			}//for e		
	}// main e
}// class e
