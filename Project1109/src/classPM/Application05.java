package classPM;

public class Application05 {
	public static void main(String[] args) throws InterruptedException {

		final ����ϴ½����尰���� thread = new ����ϴ½����尰����();
		thread.start();
		thread.join();
		System.out.println(thread.getData());
		
	}
}
