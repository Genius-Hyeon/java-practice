package classPM_overloading;

public class Ex01 {
	int color; //������� ����
	String strColor;
	
	//int�� ���ڷ� �ϴ� setColor �޼ҵ�
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
		System.out.println("�÷�: " + ex.color + ", " + ex.strColor);
	}
}
