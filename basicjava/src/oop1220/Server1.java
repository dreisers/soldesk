package oop1220;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) {
		// ��������
		ServerSocket server = null;
		try {
			//port ��ȣ : 0~65535
			server = new ServerSocket(5699);
			while(true) {
				System.out.println("\nŬ���̾�Ʈ ���� �����");
				Socket socket = server.accept();
				System.out.println("[����]����IP : " + socket.getInetAddress().getHostAddress());
			
				//��û�� ����� pc�� ���� ���
				BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				writer.write("[�����]�ٺ�/��û��");
				writer.newLine(); //�ٹٲ�
				writer.flush(); //client�� ����
				socket.close();// ������ ���� ����
			}
		}catch (Exception e) {
			System.out.println("�����߻� : " + e);
		}finally {
			try {
				server.close();
			}catch (Exception e) {}
			System.out.println("���� ���α׷� ���� ����");
		}//e
		
		
		
	} //main e
} //class e
