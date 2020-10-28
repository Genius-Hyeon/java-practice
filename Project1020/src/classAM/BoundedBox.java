package classAM;

class Box1<T extends Number>{ 
	//number를 상속받는 아이들만 <>안에 들어갈 수 있음
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
