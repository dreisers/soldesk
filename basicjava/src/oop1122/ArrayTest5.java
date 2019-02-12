package oop1122;

public class ArrayTest5 {

	public static void main(String[] args) {

		int[][] su =	{ {4, 6, 8},
						  {1, 3, 5},
						  {7, 2, 9}	};
	
		int row = su.length; //3행
		int col = su[0].length; //0행의 3열
		
//		문)   출력결과 : 전치행렬 	
/*								
		4 1 7
 		6 3 2
		8 5 9
	  
		for(int a=0; a<row; a++) {
			for(int b=0; b<col; b++) {
				System.out.print(su[b][a] + " ");
			}
			System.out.println();
		}//for e
		
		
		
//		문) 대각선 방향으로 더한 후 값 출력
		int sum1 = 0, sum2 = 0;
		for(int a=0; a<=2; a++) {
				sum1 = sum1 + su[a][a];
				sum2 = sum2 + su[a][2-a];
			}//for e
		System.out.println(sum1);
		System.out.println(sum2);
*/	
//		문) 행렬 각각 요소의 합, 차를 구하시오
		int[][] aa = {{1,2}, {3,4}};
		int[][] bb = {{2,4}, {6,8}};
		int[][] cc = {{0,0}, {0,0}}; //합
		int[][] dd = {{0,0}, {0,0}}; //차
		
		for(int a = 0; a<2; a++) {
			for(int b = 0; b<2; b++) {
				cc[a][b] = aa[a][b] + bb[a][b];
			}
		}
		for(int a = 0; a<2; a++) {
			for(int b = 0; b<2; b++) {
				System.out.print(cc[a][b]+" ");
			}
			System.out.println();
			}
		
		for(int a = 0; a<2; a++) {
			for(int b = 0; b<2; b++) {
				cc[a][b] = aa[a][b] - bb[a][b];
			}
		}
		for(int a = 0; a<2; a++) {
			for(int b = 0; b< 2; b++) {
				System.out.print(cc[a][b]+" ");
			}
			System.out.println();
			}
	}//main e
}// class e
