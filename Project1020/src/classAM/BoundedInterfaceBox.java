package classAM;
interface Eatable { //�������̽�
	public String eat();
}

class Apple3 implements Eatable{ //�������̽��� ������ Apple
	public String toString(){
		return "I am an apple.";
	}
	
	public String eat() {
		return "It tastes so good!";
	}
}

class Box3<T extends Eatable> {
	//����
	//Eatable�� ��ӹ��� T
	//Eatable�� ������ Ŭ������ T�� �� �� ����
	private T ob;
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
	
}

public class BoundedInterfaceBox {

	public static void main(String[] args) {
		Box3<Apple3> box3 = new Box3<>();
		box3.set(new Apple3());
		
		Apple3 ap = box3.get();
		System.out.println(ap);
		System.out.println(ap.eat());

	}
}
