package classAM;

//사과 클래스
class Apple { 
	public String toString() {
		return "apple";
	}
}

//오렌지 클래스
class Orange {
	public String toString() {
		return "orange";
	}
}
//사과박스 클래스
class AppleBox {
	private Apple ap; //참조변수 선언, 멤버필드

	public Apple getAp() {
		return ap;
	}

	public void setAp(Apple ap) {
		this.ap = ap;
	}

}
//오렌지박스 클래스
class OrangeBox {
	private Orange or;

	public Orange getOr() {
		return or;
	}

	public void setOr(Orange or) {
		this.or = or;
	}
		
}

public class GenericEx01 {
	//FruitBox
	public static void main(String[] args) {
		//과일 담는 박스 생성
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		//과일을 박스에 담는다.
		/*****************/
		aBox.setAp(new Apple());
		oBox.setOr(new Orange());
		
		//박스에서 과일을 꺼낸다.
		Apple ap = aBox.getAp();
		Orange og = oBox.getOr();
		System.out.println(ap);
		System.out.println(og);
		
	}

}
