package ioExample;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Application {

    public static void main(String[] args) {
        try (
                final FileInputStream fis = new FileInputStream("/Users/jihyeon_sophia_lee/Desktop/IMG_7826.JPG");
                final FileOutputStream fos = new FileOutputStream("/Users/jihyeon_sophia_lee/Desktop/IMG_7826_copied.JPG");

        ) {
            // fis - 읽을 파일
            final byte[] buffer = new byte[4096];
            int result;     // 읽은 바이트 수
            while ((result = fis.read(buffer)) != -1) {
                // fos - 쓸 파일
                fos.write(buffer);
                System.out.println("읽은 바이트 수: " + result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}