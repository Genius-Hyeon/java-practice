package kr.or.iei.thread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketApplication {

	public static void main(String[] args) {
		try(ServerSocket serverSocket = new ServerSocket(1905)) {
			Socket socket;
			while((socket = serverSocket.accept())!= null) {
				final Runnable task = new RequestHandlingTask(socket);
				final Thread thread = new Thread(task);
				thread.start();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
