package KakaoTalkMinor;

import java.io.*;
import java.net.*;

public class ReceiverThread extends Thread {
    private Socket socket;
    private BufferedReader reader;
    private String clientName;

    public ReceiverThread(Socket socket) {
        this.socket = socket;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            System.out.println("수신 스트림 설정 실패: " + e.getMessage());
        }
    }

    @Override
    public void run() {
        try {
            // 첫 번째 입력은 이름으로 간주
            clientName = reader.readLine();

            String msg;
            while ((msg = reader.readLine()) != null) {
                System.out.println("수신> " + clientName + ": " + msg);
            }
        } catch (IOException e) {
            System.out.println("수신 오류: " + e.getMessage());
        }
    }
}
