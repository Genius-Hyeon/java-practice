import java.util.Scanner;
/*Pro09 �ڵ�� �л� ���� �Է� ������ ������ �����Ƿ�, 
 * �л� ���� �հ��� ���� ���� ������ �հ谡 100���� ���� ������ ���� �ݺ�
 */
public class Pro09_1 {

	public static void main(String[] args) {
		String name;
		int score = 0, i = 0, sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (sum <= 100) {
			System.out.print((i+1) + "��° �л��� �̸� �Է�: ");
			name = scan.next();
			System.out.print((i+1) + "��° �л��� ���� �Է�: ");
			score = scan.nextInt();
			i++;
			sum += score;
		}//������ �հ谡 100�� �̻��̸� �ݺ� ����
		System.out.println("������ �հ谡 100�� �̻�(" + sum + "��)�Դϴ�. ���α׷��� �����մϴ�.");
		
		scan.close();
	}

	
}
