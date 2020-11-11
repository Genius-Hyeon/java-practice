package kr.or.iei.lambda;

@FunctionalInterface //함수가 하나만 존재하는 Interface
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
