package oop1220;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client1 {

		public static void main(String[] args) {
			// 서버구축
			Socket socket = null;
			try {
				socket = new Socket(args[0], 24);
				System.out.println("[접속]서버IP : " + socket.getInetAddress().getHostAddress());
				BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				String line = reader.readLine();
				String[] movie = line.split("/");
				System.out.println("--------------");
				for(int idx=0; idx<movie.length; idx++) {
					System.out.println(movie[idx]);
				}//for e
				System.out.println("--------------");
			}catch (Exception e) {
				System.out.println("문제발생 : " + e);
			}finally {
				try {
					socket.close();
				}catch (Exception e) {}
				System.out.println("서버 프로그램 실행 종료");
			}//e
			
			
			
		} //main e
	} //class e


