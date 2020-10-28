package classAM;
class Box4<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory {
	//public static void makeBox4(T o){
	//<T> Box4<T> == 리턴타입
	//static 제네릭 메소드
	public static <T> Box4<T> makeBox4(T o){
		Box4<T> box = new Box4<T>();
		box.set(o);
		return box;
	}
}
public class GenericMethodBoxMaker {
	public static void main(String[] args) {
		
		Box4<String> sBox = BoxFactory.makeBox4("Sweet");
		System.out.println(sBox.get());
		
		Box4<Double> dBox = BoxFactory.makeBox4(7.59);
		System.out.println(dBox.get());
	} 
}
