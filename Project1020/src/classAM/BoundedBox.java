package classAM;

class Box1<T extends Number>{ 
	//number�� ��ӹ޴� ���̵鸸 <>�ȿ� �� �� ����
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}

}

public class BoundedBox {

	public static void main(String[] args) {
		Box1<Integer> iBox = new Box1<>();
		iBox.set(24);
		System.out.println(iBox.get());

	}

}
