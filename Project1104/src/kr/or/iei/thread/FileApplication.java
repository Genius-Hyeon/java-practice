package kr.or.iei.thread;
import java.io.*;
public class FileApplication {

	public static void main(String[] args) {
		final File origin = new File("C:\\Users\\user1\\Desktop\\cat.png");
		try (
				final InputStream fileInputStream = new FileInputStream(origin);
				final OutputStream fileOutputStream =  new FileOutputStream("C:\\Users\\user1\\Desktop\\catcopy.png");			

				) {
			final byte[] buffer = new byte[4096];
			int result;
			int totalsize = 0;
			while((result = fileInputStream.read(buffer)) != -1) {
				//buffer
				fileOutputStream.write(buffer);
				System.out.println("read byte: " + result);
				totalsize += result;

			}
			System.out.println("file size: " + totalsize);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
