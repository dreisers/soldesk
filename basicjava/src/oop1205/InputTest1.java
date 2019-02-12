package oop1205;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputTest1 {

	public static void main(String[] args) {
		// 파일 내용 읽어오기
		try {
			String fileName = "d:/java1113/workspace/data.txt";
			//1) 파일 가져오기
			FileReader fr = new FileReader(fileName);
			
			//2) 파일 내용 읽기
			BufferedReader br = new BufferedReader(fr);
			int num = 0;
			while(true) {
				//3) 엔터(\n)를 기준으로 한줄씩 가져오기
				String line = br.readLine();
				if(line==null) {
					break;
				}
				//System.out.println(++num + " " +line);
				System.out.printf("%d %s\n", ++num, line);
			}// while e
			//반납(순서 주의 할것)
			br.close();
			fr.close();
			
		}catch (Exception e) {
			System.out.println("실패 : " + e);
		}
		System.out.println("END");
	}// main e
}// class e
