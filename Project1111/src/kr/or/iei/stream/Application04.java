package kr.or.iei.stream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application04 {

	public static void main(String[] args) throws IOException {

		final Path path = Paths.get("test.txt");
		final Stream<String> stream = Files.lines(path, Charset.defaultCharset());
		final List<String> filteredList = 
				stream.filter(s -> s.length() <= 2)
				.collect(Collectors.toList());

		for (String s : filteredList) {
			System.out.println(s);
		}

	}
}
