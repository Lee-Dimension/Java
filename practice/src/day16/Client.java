package day16;

import java.io.*;
import java.net.*;

public class Client {
	private String ip; 
	private int port; 
	
	public Socket getSocket() {
		Socket Socket = null;
		try {
			Socket = new Socket(ip,port); //IP와 PORT로 서버에 연결
		}catch(IOException ioe){
			ioe.printStackTrace();
			System.exit(0);
		}
		return Socket;
	}
	
	public Client(String ip, int port) throws IOException{
		this.ip = ip;
		this.port = port;
		Socket tcpSocket = getSocket(); // 서버 소켓 연결
		
        Thread thread1 = new SenderThread(tcpSocket);
        Thread thread2 = new ReceiverThread(tcpSocket);
        thread1.start();
        thread2.start();
		
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new Client("localhost", 3001);
	}

}
