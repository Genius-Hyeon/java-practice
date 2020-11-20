package http_img_ex;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class FileReadApplication {

    private static final int PORT = 8081;

    public static void main(String[] args) {
        final File file = new File("/Users/jihyeon_sophia_lee/Desktop/IMG_7826.JPG");
        final long contentLength = file.length();
        try {
            final FileInputStream fis = new FileInputStream(file);
            int readBytes;
            final byte[] bytes = new byte[4096];
            while((readBytes = fis.read(bytes))!= -1) {
                //bytes
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
