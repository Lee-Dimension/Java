package day16;

import java.io.*;
import java.net.*;

public class EchoClient {
	private String ip; 
	private int port; 
	private String str; //통신에 사용할 문자열
	BufferedReader file; // 사용자 입력을 위한 BufferReader(System.in)
	
	public Socket getSocket() {
		Socket tcpSocket = null;
		try {
			tcpSocket = new Socket(ip,port); //IP와 PORT로 서버에 연결
		}catch(IOException ioe){
			ioe.printStackTrace();
			System.exit(0);
		}
		return tcpSocket; //소켓 객체 반환
	}
	
	public EchoClient(String ip, int port) throws IOException{
		this.ip = ip;
		this.port = port;
		Socket tcpSocket = getSocket(); // 서버 소켓 연결
		//입출력 스트림 생성
		OutputStream os_socket = tcpSocket.getOutputStream();
		InputStream is_socket = tcpSocket.getInputStream();
		//서버와 데이터 주고받을 스트림
		BufferedWriter bufferW = new BufferedWriter(
				new OutputStreamWriter(os_socket));
		BufferedReader bufferR = new BufferedReader(
				new InputStreamReader(is_socket));
		//사용자 입력받기
		System.out.print("입력 : ");
		file = new BufferedReader(new InputStreamReader(System.in));
		str = file.readLine();
		
		//서버에 메시지 전송
		str += System.getProperty("line.separator");
		bufferW.write(str);
		bufferW.flush();
		//서버로부터 응답 수신
		str = bufferR.readLine();
		System.out.println("Echo Result : " + str);
		//종료 처리
		file.close();
		bufferW.close();		
		bufferR.close();
		tcpSocket.close();
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		new EchoClient("localhost", 3000);
	}
}
