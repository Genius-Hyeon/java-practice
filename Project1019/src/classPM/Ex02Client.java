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
			//������ ����
			sock = new Socket(ip, port);
			System.out.println("���� ����");
			
			//������ ����� ���� stream, ǥ���Է� ����
		} 
	}
}
