package kr.or.iei.datastructure;

public class Application01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("hi");
		list.add("bye");
		list.add("see you");
		System.out.println(list.size());
		System.out.println(list.get(1));
	}
}
