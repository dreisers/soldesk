package oop1205;

import java.io.File;

public class FileTest {
	
public static void main(String[] args) {
		//File 클래스 : 파일 관련 정보
/*		getname 파일이름 
		delete 파일삭제
		mkdir 폴더
		length 파일크기
*/	
	//경로와 경로 구분 기호는 \\ or / 로 한다
	//
//	String fileName = "d:\\java1113\\workspace\\date.txt";	
	String fileName = "d:/java1113/workspace/data.txt";	
	
	
	try {
		File file = new File(fileName);
		if(file.exists()) { //파일 존재 유무
			System.out.println("파일 가져왔어요~");
			long filesize = file.length();
			System.out.println(filesize);
			String filename = file.getName();
			System.out.println(filename);
		
		//문) 파일명 변경시켜서 저장하려면 
		//		파일명과 확장명을 분리
			int pos = filename.indexOf(".");
			String name =  filename.substring(0, pos);
			String exe =  filename.substring(pos+1);
			System.out.println("파일이름 : "+ name);
			System.out.println("확장자 : " +exe);
			file.delete();
		}else {
			System.out.println("파일 없어요");
		}
	}catch(Exception e) { //
		System.out.println("파일 관련 정보 실패 : " + e);
	}
	System.out.println("END");
	}// main e
}// class e
