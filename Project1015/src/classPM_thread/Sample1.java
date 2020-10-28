package classPM_thread;

class Car extends Thread {
	private String name;
	
	public Car(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(name + "가 동작하고 있습니다.");
		}
	}
}
public class Sample1 {
	
	public static void main(String[] args) {
		Car car1 = new Car("1호차");
		car1.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("main() 메소드 실행중입니다.");
		}
	}

}
