package classPM;

class Car{
	public int speed;

	public void speedUp() {
		speed += 1;
	}

	//final �޼ҵ�
	public final void stop() {
		System.out.println("���� ����");
		speed = 0;
	}
}
public class Ex01 extends Car {

	public void speedUp() {
		speed += 10;
	}

	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		ex.speed = 10;
		ex.speedUp();

		System.out.println(ex.speed);
	}

}
