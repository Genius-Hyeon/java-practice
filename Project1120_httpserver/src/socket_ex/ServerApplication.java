package socket_ex;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class ServerApplication {

    private static final int PORT = 8081;

    public static void main(String[] args) {

        final String html = "<!DOCTYPE html>\n" +
                "<html>\n" +
                "    <head>\n" +
                "        <title>Hello HTTP Server!</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>제목이고</h1>\n" +
                "        <p>내용이야</p>\n" +
                "    </body>\n" +
                "</html>";

        try {
            final ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("접속 대기 중");
            Socket socket;
            while((socket = serverSocket.accept()) != null) {
                System.out.println("누군가 접속함.");
                final InputStream in = socket.getInputStream();
                final InputStreamReader isr = new InputStreamReader(in);
                final BufferedReader br = new BufferedReader(isr);

                // br.readLine() 요청 라인, 요청 헤더. 문자열 "" 만날 때까지 읽기
                String line;
                while(!(line = br.readLine()).equals("")) {
                    System.out.println(line);
                }

                final OutputStream out = socket.getOutputStream();
                // 2.3.1. 상태 라인 쓰기
                final String statusLine = "HTTP/1.1 200 OK \r\n";
                out.write(convertStringToBytes(statusLine));
                // 2.3.2. 응답 헤더 쓰기
                final String contentType = "Content-Type: text/html; charset=UTF-8 \r\n";
                out.write(convertStringToBytes(contentType));
                final String contentLength = "Content-Length: " + html.length() + "\r\n";
                out.write(convertStringToBytes(contentLength));
                out.write(convertStringToBytes("\r\n"));

                // 2.3.3. 응답 바디
                out.write(convertStringToBytes(html));
                out.flush();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] convertStringToBytes(String strToConvert) {
        return strToConvert.getBytes(StandardCharsets.UTF_8);
    }


}
