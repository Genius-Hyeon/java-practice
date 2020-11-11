package kr.or.iei.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class Application02 {
	public static void main(String[] args) {
		List<String> list = List.of("asdfasdasdff", "asdf", "asdfasdf", "ba");
		final List<String> filteredList = list.stream()
				.filter(s -> s.length() > 3)
				.collect(Collectors.toList());
		filteredList.forEach(System.out::println);
	}
}
