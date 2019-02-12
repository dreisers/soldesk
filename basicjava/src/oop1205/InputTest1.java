package oop1205;

import java.io.BufferedReader;
import java.io.FileReader;

public class InputTest1 {

	public static void main(String[] args) {
		// ���� ���� �о����
		try {
			String fileName = "d:/java1113/workspace/data.txt";
			//1) ���� ��������
			FileReader fr = new FileReader(fileName);
			
			//2) ���� ���� �б�
			BufferedReader br = new BufferedReader(fr);
			int num = 0;
			while(true) {
				//3) ����(\n)�� �������� ���پ� ��������
				String line = br.readLine();
				if(line==null) {
					break;
				}
				//System.out.println(++num + " " +line);
				System.out.printf("%d %s\n", ++num, line);
			}// while e
			//�ݳ�(���� ���� �Ұ�)
			br.close();
			fr.close();
			
		}catch (Exception e) {
			System.out.println("���� : " + e);
		}
		System.out.println("END");
	}// main e
}// class e
