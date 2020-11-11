package kr.or.iei.collectionFramework;

import java.util.HashSet;
import java.util.Set;
//Set<T>
//원소의 중복을 허용하지 않음
public class Application01 {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("포도");
		set.add("포도");
		set.add("사과");
		
		for (String s : set) {
			System.out.println(s);
		}
		
		System.out.println(set.contains("포도"));
	}
}
