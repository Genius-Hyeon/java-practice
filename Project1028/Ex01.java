import java.util.*;
//���� for��
//foreach, enhanced for��
/*
 * for(Ÿ�� �����̸�: �迭(�÷���))
 */
public class Ex01 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("A");
		list.add("A");
		list.add("A");
		
		for (String message : list) {
			System.out.println(message);
			
		}
		
		final String[] strings = new String[5];
		for (int i=0; i<strings.length; i++) {
			strings[i] = "a";
		}
		
		for (String value : strings) {
			System.out.println(value);
		}
	}

}
