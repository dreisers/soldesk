package oop1205;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class OutputTest {

	public static void main(String[] args) {
		// �������
		String fileName = "d:/java1113/workspace/sungjuk.txt";
		try {
			//���(sungjuk.txt) ������ ������, ������ �����ȴ�
			//										������, �߰� or ����� 
	FileWriter fw = new FileWriter(fileName, true);
	PrintWriter out = new PrintWriter(fw, true);
	//true : ���� Ŭ����
	out.println("����ȭ, 90, 95, 100");
	out.println("ȫ�浿, 30, 55, 40");
	out.println("���϶� 60, 95, 75");
	out.println("���޷�, 20, 85, 65");
	out.println("����ȭ, 100, 35, 100");
	
	out.close();
	fw.close();
	System.out.println("sungjuk.txt ������ �����Ǿ����ϴ�.");
	}catch (Exception e) {
		System.out.println("���� : " + e);
	}
	System.out.println("END");

		
		
		
	}// main e
}// class e
