package kr.or.iei.collectionFramework;

import java.util.HashSet;
import java.util.Set;
//Set<T>
//������ �ߺ��� ������� ����
public class Application01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("����");
		set.add("����");
		set.add("���");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println(set.contains("����"));
	}
}
