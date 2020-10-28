package classAM;
import java.util.*;
public class Ex08 {

	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("지현이", 85);
		map.put("미선이", 90);
		map.put("미진이", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key +": " + value);
		}

	}

}
