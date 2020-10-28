package classAM;
import java.util.ArrayList;

class DBox<L, R> extends Object { //제네릭 매개변수 2개
	private L left;
	private R right;

	public void set(L o, R r) {
		//자료형이 없다
		left = o; //왼쪽 수납 공간
		right = r; //오른쪽 수납 공간
	}

	@Override
	public String toString() {
		return left + "&" + right;
	}
}

public class MultiTypeParam {
	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<String, Integer>();
		//DBox<String, Integer> box = new DBox<>();
		
		box.set("Apple", 25);
		System.out.println(box.toString());
		
		ArrayList<DBox> arr = new ArrayList<DBox>();
		arr.add(box);
		System.out.println(arr.get(0));
	}
}
