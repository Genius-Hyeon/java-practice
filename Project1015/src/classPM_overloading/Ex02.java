package classPM_overloading;

class Hello{
	public Hello() {
		System.out.println("Hello()생성자 완료");
	}

	public void helloPrint() {
		System.out.println("Hello Java!");
	}

	@Override //오른쪽 클릭 - Source - generate toString
	public String toString() {
		return "Hello 클래스";
	}
			
}
public class Ex02 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.helloPrint();
		System.out.println(h);
		//toString - 클래스에 대한 설명
		Hello h1 = new Hello();
		h1.helloPrint();
		System.out.println(h1);
	}
	
}
