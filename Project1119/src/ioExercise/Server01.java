package ioExercise;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server01 {
    public static void main(String[] args) {
        try {
            // 서버 소켓 생성
            final ServerSocket serverSocket = new ServerSocket(12345);
            // 외부의 접속을 대기 (블로킹)
            System.out.println("접속 대기 중");
            final Socket client = serverSocket.accept();
            System.out.println("접속됨");
            // 1. 접속한 클라이언트에게 메세지를 하나 받음
            recvMessage(client.getInputStream());
            // 2. 접속한 클라이언트에게 메세지를 보냄
            sendMessage(client.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void recvMessage(InputStream is) throws IOException {
        final byte[] buffer = new byte[4096];
        int readBytes;

        while((readBytes = is.read(buffer)) != -1) {
            final String messageFromClient = new String(buffer);
            System.out.println(messageFromClient);
        }
    }

    private static void sendMessage(OutputStream os) throws IOException {
        final byte[] buffer = new byte[4096];
        int writeBytes;

    }
}
