package classAM_FruitBox_Generic;

class Apple {
	public String toString() {
		return "I am an apple.";
	}
}

class Orange{
	public String toString() {
		return "I am an orange.";
	}
}
/*
 * �÷��� �����ӿ�ũ
 * �ڷᱸ��, �˰���
 * 
 * */
class Box<T> {
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
}

public class FruitBox2_Generic {
	public static void main(String[] args) {
		//���� ��� �ڽ� ����
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		//������ �ڽ��� ��´�.
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		//�ڽ����� ������ �����µ� ����ȯ X
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	
	}
}
