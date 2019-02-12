package oop1205;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class OutputTest {

	public static void main(String[] args) {
		// 파일출력
		String fileName = "d:/java1113/workspace/sungjuk.txt";
		try {
			//출력(sungjuk.txt) 파일이 없으면, 파일이 생성된다
			//										있으면, 추가 or 덮어쓰기 
	FileWriter fw = new FileWriter(fileName, true);
	PrintWriter out = new PrintWriter(fw, true);
	//true : 버퍼 클리어
	out.println("무궁화, 90, 95, 100");
	out.println("홍길동, 30, 55, 40");
	out.println("라일락 60, 95, 75");
	out.println("진달래, 20, 85, 65");
	out.println("봉선화, 100, 35, 100");
	
	out.close();
	fw.close();
	System.out.println("sungjuk.txt 파일이 생성되었습니다.");
	}catch (Exception e) {
		System.out.println("실패 : " + e);
	}
	System.out.println("END");

		
		
		
	}// main e
}// class e
