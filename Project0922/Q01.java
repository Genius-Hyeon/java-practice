import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1, num2;

		System.out.print("1�� ������ �Է�: ");
		num1 = scanner.nextInt();
		System.out.print("2�� ������ �Է�: ");
		num2 = scanner.nextInt();

		if (num1 == num2) {
			System.out.println("\n�� ���� Same" );

		} else  {
			System.out.println("\n�� ���� Different" );

			scanner.close();
		}
	}
}

