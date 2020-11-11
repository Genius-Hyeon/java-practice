package classPM;

public class DummyTask implements Runnable{

	@Override
	public void run() {
		while(true) {
			try {
				System.out.println("message");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
