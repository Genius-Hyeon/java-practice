package classPM;

public class CriticalSection {

	private int data = 1000;
	//동기화: 실행 흐름 제어
	public synchronized boolean 무언가심각한작업(int 인출할값) {
		if(data >= 인출할값) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data -= 인출할값;
			return true;
		}//if
		return false;
	}

	public int getData() {
		return data;
	}

}

