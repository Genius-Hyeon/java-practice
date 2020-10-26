package ex01;

public class Sample01 {

	public static void main(String[] args) {
		int[] test = new int[5];
		
		for (int i=0; i<test.length; i++) {
			test[i] = (i+1)*10;
		}
		int sum = 0;
		for (int i=0; i<test.length; i++) {
			sum += test[i];
		}
		System.out.println("배열의 : " + sum);
	}

}
