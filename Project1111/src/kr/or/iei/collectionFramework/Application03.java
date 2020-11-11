package kr.or.iei.collectionFramework;

import java.util.Map;
import java.util.HashMap;
//Map
public class Application03 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("one", "ÇÏ³ª");
		map.put("two", "µÑ");
		
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println("-----------------");
		}
		
	}
}
