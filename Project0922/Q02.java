import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int num;
		
		System.out.print("������ �Է�: ");
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("�Է��� ���� ¦���Դϴ�." );

		} else  {
			System.out.println("�Է��� ���� Ȧ���Դϴ�." );

			scanner.close();
		}
	}

}
