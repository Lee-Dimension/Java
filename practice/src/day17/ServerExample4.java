package day17;

import java.net.*;

public class ServerExample4 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(9002);
			while (true) {
				Socket socket = serverSocket.accept();
				Thread thread = new PerClinetThread(socket); //각 클라이언트마다 개별 스레드를 생성해서 처리하는 클래스
				thread.start();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
