import java.util.Scanner;
public class Pro09 {

	public static void main(String[] args) {
		String[] name = new String[3];
		int[] score = new int[3];

		int sum = 0;

		Scanner scan = new Scanner(System.in);
		while (true) {
			for(int i=0; i<name.length; i++) {
				System.out.print((i+1) + "��° �л��� �̸��� �Է��ϼ���: ");
				name[i] = scan.next();
				System.out.print("�л��� ������ �Է��ϼ���: ");
				score[i] = scan.nextInt();
				sum += score[i];

				if (sum >= 100)
					break;
			}
			break;
		}
		System.out.println("������ �հ谡 100�� �̻�(" + sum + "��)�Դϴ�. ���α׷��� �����մϴ�. ");
		
		scan.close();
	}
	
}

