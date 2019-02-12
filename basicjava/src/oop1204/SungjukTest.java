package oop1204;

import java.util.Arrays;

class Sungjuk {
	//field
	private int no;									//번호
	private String name;						//이름
	private int[] answer = new int[5];		//답안제출
	private char[] ox = new char[5];		//OX
	public int score;								//점수	
	public int rank;								//등수
	
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
		//제출한 answer 답안과 정답을 비교해서 OX구하기
		//맞은 갯수에 따라 점수 구하기
		for(int a=0; a<dap.length; a++) {
			if(answer[a]==dap[a]) {
				this.ox[a] = 'O';
				this.score = score + 20;
			}else
				this.ox[a] = 'X';
			}//for e
		
	}//compute e
	
	public void disp() {
		//출력
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
		// 성적프로그램 OX 표시
		Sungjuk[] student = {
				new Sungjuk(1, "홍길동", 1, 2, 1, 1, 1), 
				new Sungjuk(2, "무궁화", 1, 1, 1, 1, 1), 
				new Sungjuk(3, "라일락", 3, 2, 4, 2, 1), 
				new Sungjuk(4, "진달래", 2, 1, 4, 1, 1), 
				new Sungjuk(5, "봉선화", 1, 1, 4, 3, 2) };
		
		int size = student.length;
		for(int idx=0; idx<size; idx++) {
	        student[idx].compute();
	    }//for end
		
		//등수
		for(int a=0; a<size; a++) {
			for(int b=0; b<size; b++)
			if(student[a].score<student[b].score) {
				 student[a].rank = student[a].rank + 1;
			}
		}
		
		//정렬
		for(int a=0; a<size-1; a++) {
			for(int b=a+1; b<size; b++) {
			if(student[a].rank>=student[b].rank) {
			Sungjuk tmp = student[a];
				student[a] = student[b];
				student[b] = tmp;
			}		
			}
		}//for e
			System.out.println("******* 시 험 결 과 *******");
			System.out.println("========================");
			System.out.println("번호 이름 1 2 3 4 5 점수 등수");
			System.out.println("------------------------");
			for(int idx=0; idx<size; idx++) {
			student[idx].disp();
			}//for e		
	}// main e
}// class e
