package classPM;

public class ����ϴ½����尰���� extends Thread{
	
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
