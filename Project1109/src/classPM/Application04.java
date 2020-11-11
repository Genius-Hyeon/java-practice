package classPM;
//Watchdog, WorkerThread
public class Application04 {
	public static void main(String[] args) {
		final Thread thread = new Thread(new WorkerThread());
		new Watchdog(thread).start();
		
	}
}
