package classPM_overloading;

class Hello{
	public Hello() {
		System.out.println("Hello()������ �Ϸ�");
	}

	public void helloPrint() {
		System.out.println("Hello Java!");
	}

	@Override //������ Ŭ�� - Source - generate toString
	public String toString() {
		return "Hello Ŭ����";
	}
			
}
public class Ex02 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.helloPrint();
		System.out.println(h);
		//toString - Ŭ������ ���� ����
		Hello h1 = new Hello();
		h1.helloPrint();
		System.out.println(h1);
	}
	
}
