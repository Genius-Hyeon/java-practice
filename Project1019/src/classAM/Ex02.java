package classAM;
//InetAddressEx
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class Ex02 {

	public void testInetAddress(String domain) {
		InetAddress ip = null;
		try {
			ip = InetAddress.getByName(domain);
			System.out.println("HostName : " + ip.getHostName());
			System.out.println("HostAddress : " + ip.getHostAddress());
			System.out.println("HostName/HostAddress : \n\t" + ip.toString());
			System.out.println("--------------------------------");
			byte[] ipAddr = ip.getAddress();
			System.out.println("getAddress() : " + Arrays.toString(ipAddr));
			System.out.print("HostAddress: ");

			/**************핵심***************/
			for(int i=0; i<ipAddr.length; i++) {
				if(ipAddr[i] < 0)
					System.out.print(ipAddr[i]+256);
				else 
					System.out.print(ipAddr[i]);
				System.out.print(".");
			}
			System.out.println("");
			System.out.println("--------------------------------");
			ip = InetAddress.getLocalHost();
			System.out.println("LocalHostName : " + ip.getHostName());
			System.out.println("LocalHostAddress() : " + ip.getHostAddress());
			System.out.println("Local HostName/HostAddress : \n\t" + ip.toString());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) {
		new Ex02().testInetAddress("www.naver.com");
	}

}
