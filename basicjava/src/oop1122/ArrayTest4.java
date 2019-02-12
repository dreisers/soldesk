package oop1122;

public class ArrayTest4 {

	public static void main(String[] args) {
//		2차원 배열
//		[행][열]
//		행:층, 줄, row
//		열:칸, column
/*	
		int[][] su = new int[2][3];
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		su[1][0] = 40;
		su[1][1] = 50;
		su[1][2] = 60;
		
		System.out.println(su[0][0]);
		System.out.println(su[0][1]);
		System.out.println(su[0][2]);
		System.out.println(su[1][0]);
		System.out.println(su[1][1]);
		System.out.println(su[1][2]);
*/
		int[][] su = {	{10, 20, 30},
							{40, 50, 60}	};
			
/*	
  		System.out.println(su.length); // 2 -> 행의 갯수
		System.out.println(su[0].length);//3 -> [0]행의 열의 갯수
		System.out.println(su[1].length);//3 -> [1]행의 열의 갯수
		
		int row = su.length; 
		int col = su[0].length;
		
		for(int a=0; a<row; a++) {
			for(int b=0; b<col; b++) {
				System.out.println(su[a][b]);
			}
		}
*/		
		char[][] ch = { {'Y', 'e','a','r'},
							  {'M','o','n','t','h'},
							  {'D','a','t','e'}     }; // [][] e
		int row = ch.length;
		
//		문) 모음의 갯수를 구하시오
		int count = 0;
		for(int a=0; a<row; a++) {
			int col = ch[a].length;
			for(int b=0; b<col; b++) {
				char c = ch[a][b];
				if(c>='a' && c<='Z'){
					c = (char)(c+32);
				}//if e
			  switch(c) {
			  case 'a' : 
			  case 'e' : 
			  case 'i' : 
			  case 'o' : 
			  case 'u' : count++;
			  }
			}
		}
		System.out.println(count);
//		문)대소문자 서로 바꿔서 출력
		for(int a=0; a<row; a++) {
			for(int b=0; b<ch[a].length; b++) {
			char c = ch[a][b];
				if(c>='A'&&c<='Z') {
				System.out.print((char)(c+32));
			}else{
				System.out.print((char)(c-32));
			}//if e
		}
			System.out.println();
		}//for e
	}//main e
}// class e
