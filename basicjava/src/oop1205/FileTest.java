package oop1205;

import java.io.File;

public class FileTest {
	
public static void main(String[] args) {
		//File Ŭ���� : ���� ���� ����
/*		getname �����̸� 
		delete ���ϻ���
		mkdir ����
		length ����ũ��
*/	
	//��ο� ��� ���� ��ȣ�� \\ or / �� �Ѵ�
	//
//	String fileName = "d:\\java1113\\workspace\\date.txt";	
	String fileName = "d:/java1113/workspace/data.txt";	
	
	
	try {
		File file = new File(fileName);
		if(file.exists()) { //���� ���� ����
			System.out.println("���� �����Ծ��~");
			long filesize = file.length();
			System.out.println(filesize);
			String filename = file.getName();
			System.out.println(filename);
		
		//��) ���ϸ� ������Ѽ� �����Ϸ��� 
		//		���ϸ�� Ȯ����� �и�
			int pos = filename.indexOf(".");
			String name =  filename.substring(0, pos);
			String exe =  filename.substring(pos+1);
			System.out.println("�����̸� : "+ name);
			System.out.println("Ȯ���� : " +exe);
			file.delete();
		}else {
			System.out.println("���� �����");
		}
	}catch(Exception e) { //
		System.out.println("���� ���� ���� ���� : " + e);
	}
	System.out.println("END");
	}// main e
}// class e
