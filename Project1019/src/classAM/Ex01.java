package classAM;
//InetAddressEx
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ex01 {
	InetAddress ip = null;
	String ip1 = null;

	//�޼ҵ� ����
	public void testInetAddress() throws Exception {
		ip = InetAddress.getLocalHost();
		System.out.println(ip); //���� ȣ��Ʈ ���
		ip1 = ip.getHostAddress();
		System.out.println(ip1); //ȣ��Ʈ �ּ� ���

		System.out.println("------------------");

		System.out.println(ip.getHostName());
		System.out.println(ip.getHostAddress());
		System.out.println(ip.toString());

		System.out.println("------------------");

	}

	@Override //�������̵��Ҷ� �ٿ��ֱ�
	public String toString() {
		//return "Ex01 [ip=" + ip + ", ip1=" + ip1 + "]";
		return "IPv4 �ּ� Ȯ���ϴ� ��...........";

	}

	public static void main(String[] args) throws Exception {
		Ex01 inet = new Ex01();
		System.out.print(inet);
		
		//������ ȣ��?
		//new Ex01();
		
	}

}
