package classPM_thread;

class Car extends Thread {
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name + "�� �����ϰ� �ֽ��ϴ�.");
		}
	}
}
public class Sample1 {
	
	public static void main(String[] args) {
		Car car1 = new Car("1ȣ��");
		car1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("main() �޼ҵ� �������Դϴ�.");
		}
	}

}
