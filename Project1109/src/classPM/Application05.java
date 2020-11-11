package classPM;

public class Application05 {
	public static void main(String[] args) throws InterruptedException {

		final 계산하는스레드같은거 thread = new 계산하는스레드같은거();
		thread.start();
		thread.join();
		System.out.println(thread.getData());
		
	}
}
