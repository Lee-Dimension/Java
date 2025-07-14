package KakaoTalk;
//장난으로 만든거임 기록 ㄴㄴ
import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    // 연결된 클라이언트 목록
    private static List<ClientHandler> clients = Collections.synchronizedList(new ArrayList<>());

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(3000)) {
            System.out.println("서버 실행 중...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientHandler handler = new ClientHandler(clientSocket);
                clients.add(handler);
                handler.start();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler extends Thread {
        private Socket socket;
        private String name;
        private BufferedReader reader;
        private BufferedWriter writer;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

                // 이름 받기
                writer.write("이름을 입력하세요:\n");
                writer.flush();
                name = reader.readLine();
                System.out.println("[" + name + "] 접속");

                broadcast("[" + name + "] 님이 입장했습니다.", this);

                String msg;
                while ((msg = reader.readLine()) != null) {
                    broadcast(name + ": " + msg, this);
                }

            } catch (IOException e) {
                System.out.println("[" + name + "] 연결 종료");
            } finally {
                try {
                    socket.close();
                } catch (IOException ignored) {}
                clients.remove(this);
                broadcast("[" + name + "] 님이 퇴장했습니다.", this);
            }
        }

        void send(String msg) {
            try {
                writer.write(msg + "\n");
                writer.flush();
            } catch (IOException e) {
                System.out.println("[" + name + "]에게 메시지 전송 실패");
            }
        }

        void broadcast(String msg, ClientHandler sender) {
            synchronized (clients) {
                for (ClientHandler c : clients) {
                    if (c != sender) {
                        c.send(msg);
                    }
                }
            }
            System.out.println(msg); // 서버 콘솔에도 출력
        }
    }
}
