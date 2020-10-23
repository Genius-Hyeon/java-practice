package exfor;

public class ExWhile {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		while (sum < 21) {
			i++;
			System.out.println(i);
			sum = sum + i;
		}
		
		System.out.println(i);
		System.out.println(sum);
	}
}