
public class ExArray01 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int sum = 0;

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		for (int i = 0; i < 5; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
	}
}