package oop1205;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class InputTest2 {

	public static void main(String[] args) {
		//InputStream��� Reader��� ��
		try {
			String fileName = "d:/java1113/workspace/data.txt";
		//1) FileInputStram : 1����Ʈ ��� - �ѱ� ����

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
		//2) char��� 2byte, - �ѱ۾ȱ���
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
		System.out.println("���� : " + e);
	}
	System.out.println("END");

			
	}// main e
}// class e
