package classPM;

public class CriticalSection {

	private int data = 1000;
	//����ȭ: ���� �帧 ����
	public synchronized boolean ���𰡽ɰ����۾�(int �����Ұ�) {
		if(data >= �����Ұ�) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data -= �����Ұ�;
			return true;
		}//if
		return false;
	}

	public int getData() {
		return data;
	}

}

