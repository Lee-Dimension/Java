package day16;

import java.io.*;
import java.net.*;

public class Server {	
	private ServerSocket serverS;
	
	public Server(int port) {
		try {
			serverS = new ServerSocket(port); // 서버 소켓 생성 : 지정한 포트 번호로 서버를 오픈
		}catch(IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
		while(true) {
			try {
				System.out.println("클라이언트의 요청을 기다리는 중");
				Socket socket = serverS.accept();//클라이언트 기다림
				System.out.println("클라이언트의 IP 주소 : " +
						socket.getInetAddress().getHostAddress()); //연결된 클라이언트의 IP주소 출력

	            Thread thread1 = new SenderThread(socket);
	            Thread thread2 = new ReceiverThread(socket);
	            thread1.start();
	            thread2.start();
	            
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Server(3001);
	}
}
