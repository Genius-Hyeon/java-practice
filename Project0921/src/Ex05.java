import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ǽ� �� ���� ����: ");
		int preLabScore = scanner.nextInt();
		System.out.print("�ǽ� ���� ����: ");
		int labScore = scanner.nextInt();
		System.out.print("�ǽ� �� ���� ����: ");
		int postLabcore = scanner.nextInt();
		
		double finalLabScore = (preLabScore/20+postLabcore/30)*30
				+ (labScore/25)*40;
		
		System.out.println("�ǽ� �� ���� ����: " + preLabScore + ", �ǽ� ���� ����: " + labScore + 
				", �ǽ� �� ���� ����: " + postLabcore + ", ���� ���� ����: " + finalLabScore);
				

	}

}
