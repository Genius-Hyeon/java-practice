package classPM;
import java.io.*;
import java.net.*;

public class Ex02Client {
	public void clientTCP(String ip, int port) {
		Socket sock = null;
		
		InputStream in = null;
		OutputStream out = null;
		BufferedReader br = null;
		PrintWriter wr = null;
		BufferedReader stdin = null;
		
		try {
			//서버로 접속
			sock = new Socket(ip, port);
			System.out.println("접속 성공");
			
			//서버와 통신을 위한 stream, 표준입력 변수
		} 
	}
}
