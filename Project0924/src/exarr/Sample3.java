package exarr;
import java.util.Scanner;
class Sample3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int SIZE = 10;
		int[] seats = new int[SIZE];

		while (true) { //true = ���ѷ���
			System.out.println("---------------------");
			for (int i = 0; i < SIZE; i++)
				System.out.print(i+1 + " "); //1���� 10���� �¼� ���
			System.out.println("\n---------------------");
			for (int i = 0; i < SIZE; i++)//�¼� ���� ���� 0�� 1�� ���
				System.out.print(seats[i] + " ");
			System.out.println("\n---------------------");
			System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1): " );//�¼���ȣ �Է�
			int s = scan.nextInt();
			if (s == -1) {
				System.out.println("���α׷��� �����մϴ�.");
				break;//-1 �Է� �� ���α׷� ����
			}
			if (seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("����Ǿ����ϴ�."); //�¼� ���� �� 0�� 1�� ����
			}
			else {
				System.out.println("�̹� ����� �¼��Դϴ�.");//����� �¼� ���� �� �޽��� ���
			}
			
			scan.close();
		}//while
	}
}
