package kr.or.iei.datastructure;

public class Application01 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("hi");
		list.add("bye");
		list.add("see you");
		list.add("1");
		list.add("69");
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.contains("1"));
	}
}
