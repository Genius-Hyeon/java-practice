package kr.or.iei.collectionFramework;

import java.util.ArrayList;
import java.util.List;
//List
//중목 허용, 인덱스값 있음
public class Application02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("포도");
		list.add("포도");
		list.add("귤");
		list.add("사과");
			
		for(String s : list) {
			System.out.println(s);
		}
		//인덱스값 지정하여 get
		System.out.println("==============");
		System.out.println(list.get(0));
		System.out.println(list.contains("포도"));
	}
}
