import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fiveHundred;
		int oneHundred;
		int fifty;
		int ten;
		int total;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("500��¥�� ������ ����: ");
		fiveHundred = scanner.nextInt();
		System.out.print("100��¥�� ������ ����: ");
		oneHundred = scanner.nextInt();
		System.out.print("50��¥�� ������ ����: ");
		fifty = scanner.nextInt();
		System.out.print("10��¥�� ������ ����: ");
		ten = scanner.nextInt();
		
		total = fiveHundred*500 + oneHundred*100 + fifty*50 + ten*10;
		
		System.out.print("�Ѿ�: " + total + "��");
	}

}
