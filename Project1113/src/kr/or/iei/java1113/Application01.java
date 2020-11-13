package kr.or.iei.java1113;

public class Application01 {
	public static void main(String[] args) {

		final ArrayStack<Integer> stack = new ArrayStack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.isEmpty());

	}
}
