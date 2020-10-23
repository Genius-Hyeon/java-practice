import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2;

		System.out.print("1번 정수를 입력: ");
		num1 = scanner.nextInt();
		System.out.print("2번 정수를 입력: ");
		num2 = scanner.nextInt();

		if (num1 == num2) {
			System.out.println("\n두 수는 Same" );

		} else  {
			System.out.println("\n두 수는 Different" );

			scanner.close();
		}
	}
}

