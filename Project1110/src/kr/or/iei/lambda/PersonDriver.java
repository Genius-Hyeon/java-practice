package kr.or.iei.lambda;

public class PersonDriver {
	public static void main(String[] args) {
		Person person = new Person();
		person.hi((a, b) -> {
			System.out.println("어쩌구저쩌구");
			System.out.println("parameter number is " + a + ", " + b);
			return 7;
		});
	}
}
