package classAM_FruitBox;
//오브젝트
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
	private Object ob; //모든 클래스의 슈퍼 클래스

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}

}

public class FruitBox02 {
	public static void main(String[] args) {
		Apple ap; //멤버필드
		Orange og; //멤버필드
		
		//과일 담는 박스 생성
		Box aBox = new Box();
		Box oBox = new Box();

		//과일을 박스에 담는다.
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		//박스에서 과일을 꺼낸다.
		ap = (Apple)aBox.get(); //형변환
		og = (Orange)oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}
}
