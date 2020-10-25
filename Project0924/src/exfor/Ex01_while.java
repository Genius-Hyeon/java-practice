package exfor;

public class Ex01_while {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;

		while (i < 21) {
			if (i %2 != 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("1부터 20까지의 홀수 합계: " + sum);
	}
}
