package KakaoTalkMinor;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("114.70.216.80", 3000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        // 이름 입력
        System.out.print(in.readLine()); // "이름을 입력하세요: "
        String name = console.readLine();
        out.write(name + "\n");
        out.flush();

        // 수신 쓰레드
        new Thread(() -> {
            try {
                String msg;
                while ((msg = in.readLine()) != null) {
                    System.out.println(msg);
                }
            } catch (IOException e) {
                System.out.println("서버 연결 종료");
            }
        }).start();

        // 송신 루프
        while (true) {
            String input = console.readLine();
            if (input == null || input.equalsIgnoreCase("exit")) break;
            out.write(input + "\n");
            out.flush();
        }

        socket.close();
    }
}