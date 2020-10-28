package classPM;
import java.net.*;

public class Ex01 {
	public static void main(String[] args) {
		Ex01 urlEx = new Ex01();
		urlEx.testURLExample("https://www.naver.com");
	}
	
	
	public void testURLExample(String urlStr) {
		System.out.println(urlStr);
		URL url;

		try {
			url = new URL(urlStr);
			System.out.println(url.getProtocol());
			System.out.println(url.getPort());
			System.out.println(url.getHost());
			System.out.println(url.toExternalForm());
		} catch (Exception e) {
			e.printStackTrace();
		}



	}
}
