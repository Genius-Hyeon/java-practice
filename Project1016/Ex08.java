package classAM;
import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//��ü ����
		map.put("������", 85);
		map.put("�̼���", 90);
		map.put("������", 95);
		System.out.println("�� Entry ��: " + map.size());
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key +": " + value);
		}

	}

}
