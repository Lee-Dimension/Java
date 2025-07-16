package KakaoTalkMinor;

import java.io.*;
import java.net.*;

public class SenderThread extends Thread {
    private Socket socket;
    private BufferedWriter writer;
    private BufferedReader console;

    public SenderThread(Socket socket) {
        this.socket = socket;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            console = new BufferedReader(new InputStreamReader(System.in));
        } catch (IOException e) {
            System.out.println("송신 스트림 설정 실패: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            // 이름을 먼저 입력받아 서버로 전송
            System.out.print("사용자 이름 입력: ");
            String name = console.readLine();
            writer.write(name + "\n");
            writer.flush();

            String msg;
            while ((msg = console.readLine()) != null) {
                writer.write(msg + "\n");
                writer.flush();
            }
        } catch (IOException e) {
            System.out.println("송신 오류: " + e.getMessage());
        }
    }
}
