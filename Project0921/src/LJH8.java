import java.util.Scanner;

public class LJH8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum1 = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("���۹� ������ ����: ");
		sum1 = sum1 + scanner.nextInt();
		System.out.print("���α׷��� ������ ����: ");
		sum1 = sum1 + scanner.nextInt();
		System.out.print("�̻���� ������ ����: ");
		sum1 = sum1 + scanner.nextInt();
		System.out.print("��ǻ�ͱ��� ������ ����: ");
		sum1 = sum1 + scanner.nextInt();
		System.out.print("��� ����: " + sum1/4);
		
	}

}
