import java.util.Scanner;
public class ScoreEx4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] name = new String[5]; //name[0], name[1]
		int[] grade = new int[5];

		int sum = 0;
		double avg = 0;

		for (int i = 0; i < 5 ; i++) {
			System.out.print("�̸��Է�: " );
			name[i] = in.next();
			System.out.print("�����Է�: " );
			grade[i] = in.nextInt();

			if(grade[i] > 100) {
				System.out.println("�߸� �Է��ߴ�!");
				i--;
				continue;
			}//�̸��� �״��, ������ �ٽ� �Է�: ���̵� ��й�ȣ Ʋ���� �� �����ϱ�
			sum = sum + grade[i];

		}

		avg = sum / 5;

		System.out.print("\n��ü ���: ");

		for (int i = 0; i < 5 ; i++) {
			System.out.print(grade[i] + " ");
		}

		System.out.println("\n���� �հ�: " + sum);
		System.out.println("���� ���: " + avg);
		
		in.close();

	}
}