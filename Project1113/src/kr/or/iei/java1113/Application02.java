package kr.or.iei.java1113;

public class Application02 {
	public static void main(String[] args) {
		
		LinkedListStack<Integer> stack = new LinkedListStack<>();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

		System.out.println(stack.isEmpty());
	}
}
