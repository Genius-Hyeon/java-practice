package kr.or.iei.PM;

public class Application {
	public static void main(String[] args) {
		Super testA = new Sub();
		Sub testB = new Sub();
		System.out.println(testA.data);
		System.out.println(testB.data);
		testA.print();
		testB.print();
		
	}
}
