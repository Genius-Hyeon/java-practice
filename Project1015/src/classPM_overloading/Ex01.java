package classPM_overloading;

public class Ex01 {
	int color; //멤버변수 선언
	String strColor;
	
	//int를 인자로 하는 setColor 메소드
	public void setColor(int color) {
		this.color = color;
	}
	
	public void setColor(String color) {
		this.strColor = color;
	}
	
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		ex.setColor(20);
		ex.setColor("Red");
		System.out.println("컬러: " + ex.color + ", " + ex.strColor);
	}
}
