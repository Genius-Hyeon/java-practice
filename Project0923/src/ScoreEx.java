import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d, e;
					
		System.out.print("a�л� ������ �Է��ϼ���: " );
		a = scan.nextInt();
		System.out.print("b�л� ������ �Է��ϼ���: " );
		b = scan.nextInt();
		System.out.print("c�л� ������ �Է��ϼ���: " );
		c = scan.nextInt();
		System.out.print("d�л� ������ �Է��ϼ���: " );
		d = scan.nextInt();
		System.out.print("e�л� ������ �Է��ϼ���: " );
		e = scan.nextInt();
		
		int sum = a+b+c+d+e;
		double avg = (a+b+c+d+e)/5;
		
		System.out.println("\n1. ���� ���: " + a + " " + b + " " + c + " " + d + " " + e);
		System.out.println("2. �� �հ�: " + sum );
		System.out.println("3. ���: " + avg);
		
		
		scan.close();
		
		

	}

}
