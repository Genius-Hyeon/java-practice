import java.util.Scanner;

public class Sample04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor1;
		int sum1 = 0;
		int sum2 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л���ȣ �Է� >> ");
		kor1 = scan.nextInt();
		
		System.out.print("1. ���� ���� �Է� >> ");
		kor1 = scan.nextInt();
		sum1 = sum1 + kor1;
				
		System.out.print("1. ���� ���� �Է� >> ");
		kor1 = scan.nextInt();
		sum1 = sum1 + kor1;
		
		System.out.print("1. ���� ���� �Է� >> ");
		kor1 = scan.nextInt();
		sum1 = sum1 + kor1;
		
		System.out.println(kor1 + " �л��� ���� �հ� " + (sum1));
		
		System.out.print("�л���ȣ �Է� >> ");
		kor1 = scan.nextInt();
		
		System.out.print("2. ���� ���� �Է� >> ");
		kor1 = scan.nextInt();
		sum2 = sum2 + kor1;
		
		System.out.print("2. ���� ���� �Է� >> ");
		kor1 = scan.nextInt();
		sum2 = sum2 + kor1;
		
		System.out.print("2. ���� ���� �Է� >> ");
		kor1 = scan.nextInt();
		sum2 = sum2 + kor1;
		
		System.out.println(kor1 + " �л��� ���� �հ� " + (sum2));
		System.out.println("�� �л��� ��� : "+(sum1+sum2)/6);
		
	}	
}
