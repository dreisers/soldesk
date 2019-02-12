package oop1220;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class NetworkTest {

	public static void main(String[] args) {
		//웹서버 관련 클래스
		try {
			/* 1)
			InetAddress ip = InetAddress.getByName("www.soldesk.com");
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
			*/
//			2 ) HTML문서 내용 가져오기
			String address = "http://www.soldesk.com";
			URL url = new URL(address);
			String line = "";
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			while(true) { 
				line = br.readLine();
				if(line==null) break;
				System.out.println(line);
			}
			System.out.println();
		}catch (Exception e) {
			System.out.println("오류 : " + e);
		}
		
		
	} //main e
} // class e
