package classPM;
import java.util.*;
public class HashMapEx02 {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�: " + e.getKey() + ", ����: " + e.getValue());
		}

	}

}