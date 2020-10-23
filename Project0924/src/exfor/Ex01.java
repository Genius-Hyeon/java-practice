package exfor;

public class Ex01 {

	public static void main(String[] args) {

		int sum = 0;
		
		for (int i = 1; i < 21; i++) {
			if (i %2 != 0) {
			sum = sum + i;
			}
		}
		System.out.println("1부터 20까지 수 중 홀수 합계 : " + sum);
	}

}
