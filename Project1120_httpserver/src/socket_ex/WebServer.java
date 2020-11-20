package socket_ex;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
*
1. 요청 라인에서 URI 추출
2. 파일 절대 경로 생성
3. 파일로부터 mime type 추출
4. 파일 길이 추출
5. 파일 byte 배열로 변환
*
* */

public class WebServer {
    private static final int PORT = 9090;
    private static final String ROOT_PATH = "/Users/jihyeon_sophia_lee/Desktop/webroot";

    public static void main(String[] args) {
        try {
            final ServerSocket serverSocket = new ServerSocket(PORT);
            System.out.println("접속 대기 중");
            Socket socket;
            while ((socket = serverSocket.accept()) != null) {
                System.out.println("누군가 접속함.");
                final InputStream in = socket.getInputStream();
                final InputStreamReader isr = new InputStreamReader(in);
                final BufferedReader br = new BufferedReader(isr);

                // br.readLine() 요청 라인, 요청 헤더. 문자열 "" 만날 때까지 읽기
                final String requestLine = br.readLine();
                String line;
                while (!"".equals(line = br.readLine())) {
                    System.out.println(line);
                }

                final OutputStream out = socket.getOutputStream();
                // 2.3.1. 상태 라인 쓰기
                final String statusLine = "HTTP/1.1 200 OK \r\n";
                out.write(convertStringToBytes(statusLine));

                final String uri = extractURIFromRequestLine(requestLine);
                final String absolutePath = getAbsolutePath(uri);
                final String contentType = getContentTypeFromFilePath(absolutePath);
                final String ctHeader = "Content-Type: " + contentType + "\r\n";
                out.write(convertStringToBytes(ctHeader));

                final File fileToResponse = new File(absolutePath);
                final long contentLength = fileToResponse.length();
                final String clHeader = "Content-Length: " + contentLength + "\r\n";
                out.write(convertStringToBytes(clHeader));
                out.write(convertStringToBytes("\r\n"));

                try(final InputStream fis = new FileInputStream(fileToResponse)) {
                    int readBytes;
                    final byte[] buffer = new byte[4096];
                    while((readBytes = fis.read(buffer)) != -1) {
                        out.write(buffer);
                    }
                } catch(IOException ignore){

                }
                out.flush();


            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static byte[] convertStringToBytes(String strToConvert) {
        return strToConvert.getBytes(StandardCharsets.UTF_8);
    }

    private static String getContentTypeFromFilePath (String absolutePath) {
        return URLConnection.guessContentTypeFromName(absolutePath);

    }

    private static String getAbsolutePath (String uri){
        // uri
        // abc.txt
        // babosae.jpg
        final Path path = Paths.get(ROOT_PATH);
        final String fileName = uri.substring(1);
        final Path fileAbsolutePath = path.resolve(fileName);
        return fileAbsolutePath.toString(); // 파일의 절대 경로
    }

    private static String extractURIFromRequestLine (String requestLine){
        final String[] splitted = requestLine.split(" ");
        return splitted[1];
        // '/' 반환
    }
}