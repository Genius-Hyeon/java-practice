import java.util.Scanner;

public class ScoreEx3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, sum = 0, avg = 0;
						
		for (int i = 0; i < 5; i++) {
			System.out.print( (i+1) + "��° �л� �����Է�: " );
			a = scan.nextInt();
			
			if(a > 101) {
				System.out.println("�߸� �Է��ߴ�!");
				i--;
				continue;
				
			}
			sum = sum+a;
			avg = sum / 5;
		}
		System.out.println("���� �հ�: " + sum);
		System.out.println("���� ���: " + avg);
		
		scan.close();
	}

}
