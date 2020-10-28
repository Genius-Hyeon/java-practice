package classAM_FruitBox;
//������Ʈ
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

class Box {
	private Object ob; //��� Ŭ������ ���� Ŭ����

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}

}

public class FruitBox02 {
	public static void main(String[] args) {
		Apple ap; //����ʵ�
		Orange og; //����ʵ�
		
		//���� ��� �ڽ� ����
		Box aBox = new Box();
		Box oBox = new Box();

		//������ �ڽ��� ��´�.
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		//�ڽ����� ������ ������.
		ap = (Apple)aBox.get(); //����ȯ
		og = (Orange)oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}
}
