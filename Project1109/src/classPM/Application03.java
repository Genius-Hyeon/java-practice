package classPM;
//CriticalSection
public class Application03 {
	public static void main(String[] args) {
		final CriticalSection cs = new CriticalSection();
		
		final Worker w1 = new Worker(cs);
		final Worker w2 = new Worker(cs);
		
		w1.start();
		w2.start();
	}
}
