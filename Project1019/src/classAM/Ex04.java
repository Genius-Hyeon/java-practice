package classAM;
import java.util.*;
import java.net.*;

public class Ex04 {

	public static void main(String[] args) throws UnknownHostException {
		//Ű����� ȣ��Ʈ���� �Է¹޾�, �ش� ȣ��Ʈ�� ���� ip�ּ� ��θ� ���ó��

		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("ȣ��Ʈ��(����: none): " );
			String host = scan.next();

			if(host.equals("none") != true) {
				InetAddress[] ips = InetAddress.getAllByName(host);
				System.out.println(host + "�� ���� ip�� " + ips.length +"���Դϴ�.");

				/*
				 * for (int i=0; i<ips.length; i++) 
				 * System.out.println(ips[i]);
				 */

				for(InetAddress ip : ips)
					System.out.println(ip.getHostAddress());
			} else 
				System.out.println("���α׷� ����");
			break;
		} while (true);
		
		scan.close();
	}

}
