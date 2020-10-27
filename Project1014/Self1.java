package classPM;

abstract class Self01 {
	abstract void show();
}

class Self02 extends Self01{

	@Override
	void show() {
		System.out.println("상속받은 클래스");		
	}

}
public class Self1 {

	public static void main(String[] args) {
		Self01 s = new Self01() {
			public void show() {
				System.out.print("익명 클래스");
			}
		};
		s.show();
		
	}

}
