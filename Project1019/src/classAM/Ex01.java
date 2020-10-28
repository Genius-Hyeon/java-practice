package classAM;
//InetAddressEx
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	InetAddress ip = null;
	String ip1 = null;

	//메소드 생성
	public void testInetAddress() throws Exception {
		ip = InetAddress.getLocalHost();
		System.out.println(ip); //로컬 호스트 출력
		ip1 = ip.getHostAddress();
		System.out.println(ip1); //호스트 주소 출력

		System.out.println("------------------");

		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip.toString());

		System.out.println("------------------");

	}

	@Override //오버라이딩할때 붙여주기
	public String toString() {
		//return "Ex01 [ip=" + ip + ", ip1=" + ip1 + "]";
		return "IPv4 주소 확인하는 중...........";

	}

	public static void main(String[] args) throws Exception {
		Ex01 inet = new Ex01();
		System.out.print(inet);
		
		//생성자 호출?
		//new Ex01();
		
	}

}
