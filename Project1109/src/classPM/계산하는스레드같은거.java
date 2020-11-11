package classPM;

public class 계산하는스레드같은거 extends Thread{
	
	private long data = 1;
	
	public long getData() {
		return data;
	}
	
	public void run() {
		for (int i=1; i<=20; i++) {
			data *= i;
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
