package classPM;
//CriticalSection
public class Worker extends Thread{
	
	private final CriticalSection cs;
	
	public Worker(CriticalSection cs) {
		this.cs = cs;
	}
	
	public void run() {
		while (cs.getData() > 0) {
			final int 인출할값 = (int)(Math.random() *3 + 1) *100;
			if (cs.무언가심각한작업(인출할값)) {
				System.out.printf("[%s] %d 감소됨. (cs: %d남음)\n", getName(), 인출할값, cs.getData());
			}
		}
	}
}
