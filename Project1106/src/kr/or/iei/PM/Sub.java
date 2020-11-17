package kr.or.iei.PM;

public class Sub extends Super{
	String data;
	
	public Sub() {
		data = "subclass";
	}
	
	@Override
	public void print() {
		System.out.println("자식임");
	}
}
