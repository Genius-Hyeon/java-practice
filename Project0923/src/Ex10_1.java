import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a, b, c;
		int max = 0;

		System.out.print("���� ���� �Է��Ͻÿ�(1ȸ): ");
		a = scanner.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�(2ȸ): ");
		b = scanner.nextInt();
		System.out.print("���� ���� �Է��Ͻÿ�(3ȸ): ");
		c = scanner.nextInt();

		if (a > b && a > c ) {
			max = a;
		}
		if (b > a && b > c) max = b;
		if (c > a && c > b) max = c;

	    System.out.println("�ִ밪�� " + max + "�Դϴ�.");//����� �� �� �ֵ��� ����!

	    scanner.close();
	}
}
