import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("���� ���� �Է��Ͻÿ�(1ȸ) : ");
		num1 = scanner.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�(2ȸ) : ");
		num2 = scanner.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�(3ȸ) : ");
		num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("\n�ִ밪�� "+ num1 + "�Դϴ�.");

		}else if (num2 > num1 && num2 > num3) {
			System.out.println("�ִ밪�� "+ num2 + "�Դϴ�.");

		}else
			System.out.println("�ִ밪�� "+ num3 + "�Դϴ�.");

		scanner.close();
	}

}
