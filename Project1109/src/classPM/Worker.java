package classPM;
//CriticalSection
public class Worker extends Thread{
	
	private final CriticalSection cs;
	
	public Worker(CriticalSection cs) {
		this.cs = cs;
	}
	
	public void run() {
		while (cs.getData() > 0) {
			final int �����Ұ� = (int)(Math.random() *3 + 1) *100;
			if (cs.���𰡽ɰ����۾�(�����Ұ�)) {
				System.out.printf("[%s] %d ���ҵ�. (cs: %d����)\n", getName(), �����Ұ�, cs.getData());
			}
		}
	}
}
