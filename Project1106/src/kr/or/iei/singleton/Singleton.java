package kr.or.iei.singleton;

import java.util.ArrayList;
import java.util.List;

public class Singleton {
	
	private static Singleton INSTANCE = new Singleton();
	private final String name = "��";
	private final List<String> data = new ArrayList<>();
	
	private Singleton() {
		//�ܺ� ���� ����
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	public String getName() {
		return name;
	}
	
	public void addToList(String element) {
		data.add(element);
	}
	
	public void showList() {
		data.stream().forEach(System.out::println);
	}
}
