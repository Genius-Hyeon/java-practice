package kr.or.iei.PM;

public class Sub extends Super{
	String data;
	
	public Sub() {
		data = "subclass";
	}
	
	@Override
	public void print() {
		System.out.println("ÀÚ½ÄÀÓ");
	}
}
