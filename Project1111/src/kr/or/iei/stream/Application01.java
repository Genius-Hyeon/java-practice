package kr.or.iei.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//stream
public class Application01 {

	public static void main(String[] args) {
		final List<String> list = List.of("����", "�ٳ���", "���", "�ƺ�ī��", "������");
		
		//1. ����
		final Stream<String> stream = list.stream();
		//2. ����
		final Stream<String> filtered = stream.filter(s -> s.length() <= 2);
		//3. ����
		final List<String> filteredList = filtered.collect(Collectors.toList());
		
		
		for (String s : filteredList) {
			System.out.println(s);
		}
	}

}
