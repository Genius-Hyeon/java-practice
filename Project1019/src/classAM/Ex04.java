package classAM;
import java.util.*;
import java.net.*;

public class Ex04 {

	public static void main(String[] args) throws UnknownHostException {
		//키보드로 호스트명을 입력받아, 해당 호스트가 가진 ip주소 모두를 출력처리

		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("호스트명(종료: none): " );
			String host = scan.next();

			if(host.equals("none") != true) {
				InetAddress[] ips = InetAddress.getAllByName(host);
				System.out.println(host + "가 가진 ip는 " + ips.length +"개입니다.");

				/*
				 * for (int i=0; i<ips.length; i++) 
				 * System.out.println(ips[i]);
				 */

				for(InetAddress ip : ips)
					System.out.println(ip.getHostAddress());
			} else 
				System.out.println("프로그램 종료");
			break;
		} while (true);
		
		scan.close();
	}

}
