package classPM;

import java.util.Scanner;

public class Application01 {
	public static void main(String[] args) {
		final DummyTask task = new DummyTask();
		final Thread thread = new Thread(task);

		thread.start();

		Scanner scan = new Scanner(System.in);
		while (true) {
			final int i = scan.nextInt();
			final String threadName = Thread.currentThread().getName();
			System.out.println(threadName + ": " + i); 
		}
	}

}
