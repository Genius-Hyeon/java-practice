package classAM;
import java.util.ArrayList;

class DBox<L, R> extends Object { //���׸� �Ű����� 2��
	private L left;
	private R right;

	public void set(L o, R r) {
		//�ڷ����� ����
		left = o; //���� ���� ����
		right = r; //������ ���� ����
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
