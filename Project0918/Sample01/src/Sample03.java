import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, kor1, kor2;
		int eng1, eng2, math1, math2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�л���ȣ �Է� >> ");
		num1 = scan.nextInt();
		System.out.print("1. ���� ���� �Է� >> ");
		kor1 = scan.nextInt();
		System.out.print("1. ���� ���� �Է� >> ");
		math1 = scan.nextInt();
		System.out.print("1. ���� ���� �Է� >> ");
		eng1 = scan.nextInt();
		
		System.out.println("ù��° �л��� ���� �հ� " + (kor1+math1+eng1));
		
		System.out.print("�л���ȣ �Է� >> ");
		num2 = scan.nextInt();
		System.out.print("2. ���� ���� �Է� >> ");
		kor2 = scan.nextInt();
		System.out.print("2. ���� ���� �Է� >> ");
		math2 = scan.nextInt();
		System.out.print("2. ���� ���� �Է� >> ");
		eng2 = scan.nextInt();
		
		System.out.println("�ι�° �л��� ���� �հ� " + (kor2+math2+eng2));
		System.out.println("�� �л��� ��� : " + (kor1+math1+eng1+kor2+math2+eng2)/6);

	}

}
