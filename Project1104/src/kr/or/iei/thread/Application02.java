package kr.or.iei.thread;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Application02 {

	public static void main(String[] args) {
		try(ServerSocket serverSocket = new ServerSocket(1905)){
			Socket client;
			System.out.println("while 바깥");
			while ((client = serverSocket.accept()) != null) {
				System.out.println("사용자 옴");
				try (InputStream in = client.getInputStream()){
					final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
					String readLine;
					while (!(readLine = br.readLine()).equals("")) {
						System.out.println(readLine);
					}
					
					System.out.println("v");
					Thread.sleep(10000);
					
				}
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}

	}

}
 