package day16;

import java.io.*;
import java.net.*;

public class EchoServer {
	
	private BufferedReader bufferR; // 문자 단위로 줄 단위로 읽을 수 있께 해줌
	private BufferedWriter bufferW; // 문자 단위로 출력을 더 빠르게 처리할 수 있게 함
	private InputStream is; // 서버로 보내는 데이터를 바이트로 읽는 스트림
	private OutputStream os; // 클라이언트로 보내는 데이터를 바이트로 쓰는 스트림
	private ServerSocket serverS; //연결 수락, 클라이언트의 접속을 기다리는 역할
	
	public EchoServer(int port) {
		try {
			serverS = new ServerSocket(port); // 서버 소켓 생성 : 지정한 포트 번호로 서버를 오픈
		}catch(IOException ioe) {
			ioe.printStackTrace();
			System.exit(0);
		}
		while(true) {
			try {
				System.out.println("클라이언트의 요청을 기다리는 중");
				Socket tcpSocket = serverS.accept();//클라이언트를 기다림
				System.out.println("클라이언트의 IP 주소 : " +
						tcpSocket.getInetAddress().getHostAddress()); //연결된 클라이언트의 IP주소 출력
				// 클라이언트와의 데이터 송수신 스트림 설정
				is = tcpSocket.getInputStream();
				os = tcpSocket.getOutputStream();
				bufferR = new BufferedReader(new InputStreamReader(is));
				bufferW = new BufferedWriter(new OutputStreamWriter(os));
				String message = bufferR.readLine(); //한 줄 읽음
				System.out.println("수신메시지 : "+ message); //읽은 거 출력
				//벋운 매사자룰 그대로 다시 클라이언트에 돌려줌
				message += System.getProperty("line.separator");
				bufferW.write(message);
				bufferW.flush();
				//클라이언트와의 연결 및 스트림을 정상적으로 종료
				bufferR.close();
				bufferW.close();
				tcpSocket.close();
			}catch(IOException ioe){
				ioe.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EchoServer(3000);
	}
}
