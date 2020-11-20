package socket_ex;

import java.io.*;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

// Paths: 경로 지정

public class PathExample {
    public static void main(String[] args) {
        final Path webRoot = Paths.get("/Users/jihyeon_sophia_lee/Desktop/webroot");
        final String baboSae = "babosae.jpg";
        final Path babobird = webRoot.resolve(baboSae); // 절대 경로
        System.out.println(babobird.toUri());
        System.out.println(babobird);
        final File babosaeFile = new File(babobird.toUri());
        try(FileInputStream fis = new FileInputStream(babosaeFile)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(babosaeFile.getAbsolutePath());
        final String mimeType = URLConnection.guessContentTypeFromName(babosaeFile.getAbsolutePath());
        System.out.println(mimeType);

    }

}
