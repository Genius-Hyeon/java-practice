package kr.or.iei.lambda;

public class PersonDriver {
	public static void main(String[] args) {
		Person person = new Person();
		person.hi((a, b) -> {
			System.out.println("¾îÂ¼±¸ÀúÂ¼±¸");
			System.out.println("parameter number is " + a + ", " + b);
			return 7;
		});
	}
}
