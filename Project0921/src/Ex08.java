import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int itemPrice;
		int change;
		int coin500;
		int coin100;
		int coin50;
		int coin10;
		int coin5;
		int coin1;
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("������ ����(1,000�� ����)�� �Է��ϼ���: ");
		itemPrice = scanner.nextInt();
		
		change = 1000 - itemPrice;
		
		System.out.println("�Ž�����: " + change + "��");
		
		coin500 = change/500;
		change = change-500*coin500;
		coin100 = change/100;
		change = change-100*coin100;
		coin50 = change/50;
		change = change-50*coin50;
		coin10 = change/10;
		change = change-10*coin10;
		coin1 = change/1;
		
		System.out.println("500��¥�� ����: " + coin500 + "��");
		System.out.println("100��¥�� ����: " + coin100 + "��");
		System.out.println("50��¥�� ����: " + coin50 + "��");
		System.out.println("10��¥�� ����: " + coin10 + "��");
		System.out.println("1��¥�� ����: " + coin1 + "��");
		
		scanner.close();
	}

}
