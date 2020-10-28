package classPM_overloading;

class Bicycle {
	int id;
	String brand;

	public Bicycle(int id, String brand) {
		this.id = id;
		this.brand = brand;
	}
}

public class Ex03 extends Bicycle {
	int wheelSize;

	public void prtInfo() {
		System.out.println("brand: " + brand);
		System.out.println("wheelsize: " + wheelSize);
	} 

	public Ex03(int id, String brand) {
		super(id, brand);/******중요******/

	}

	public static void main(String[] args) {
		Ex03 mv = new Ex03(20051889, "Jihyeon");
		mv.wheelSize = 20; //멤버변수 값 설정
		mv.prtInfo();
	}
}
