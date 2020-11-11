package classPM;

public class Application02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=0; i<10; i++) {
			final Thread thread = new ThreadPriority("Thread-" + (i+1));
			if (i != 9) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
		}
	}

}
