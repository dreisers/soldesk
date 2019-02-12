package oop1205;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class InputTest2 {

	public static void main(String[] args) {
		//InputStream기반 Reader기반 비교
		try {
			String fileName = "d:/java1113/workspace/data.txt";
		//1) FileInputStram : 1바이트 기반 - 한글 깨짐

/*		FileInputStream fis = new FileInputStream(fileName);
		int data = 0;
		while(true) {
			data = fis.read();
			if(data==-1) {
				break;
			}
		System.out.print((char)data);
		}
		fis.close();
*/
		//2) char기반 2byte, - 한글안깨짐
			FileReader fr = new FileReader(fileName);
			int data = 0;
			while(true) {
				data = fr.read();
				if(data==-1) {
					break;
				}
				System.out.print((char)data);
			}//while e
			fr.close();
	}catch (Exception e) {
		System.out.println("실패 : " + e);
	}
	System.out.println("END");

			
	}// main e
}// class e
