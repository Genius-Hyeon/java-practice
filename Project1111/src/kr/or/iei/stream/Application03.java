package kr.or.iei.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application03 {

	public static void main(String[] args) {
		final String[] array = {"����", "�ٳ���", "���", "�ƺ�ī��", "������"};
		final Stream<String> stream = Arrays.stream(array);
		final List<String> filteredList = stream.filter(s -> s.length() <= 2).collect(Collectors.toList());
		
		for (String s : filteredList) {
			System.out.println(s);
		}
	}

}
