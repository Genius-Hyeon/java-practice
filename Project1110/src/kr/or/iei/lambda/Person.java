package kr.or.iei.lambda;

@FunctionalInterface //�Լ��� �ϳ��� �����ϴ� Interface
interface Say {
	int something(int a, int b);
}

public class Person {
	public void hi(Say line) {
		int a = 3;
		int b = 4;
		int number = line.something(a, b);
		System.out.println("Number is " + number);
	}


}
