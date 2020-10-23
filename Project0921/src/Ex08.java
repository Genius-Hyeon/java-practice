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

		
		System.out.print("물건의 가격(1,000원 이하)을 입력하세요: ");
		itemPrice = scanner.nextInt();
		
		change = 1000 - itemPrice;
		
		System.out.println("거스름돈: " + change + "원");
		
		coin500 = change/500;
		change = change-500*coin500;
		coin100 = change/100;
		change = change-100*coin100;
		coin50 = change/50;
		change = change-50*coin50;
		coin10 = change/10;
		change = change-10*coin10;
		coin1 = change/1;
		
		System.out.println("500원짜리 동전: " + coin500 + "개");
		System.out.println("100원짜리 동전: " + coin100 + "개");
		System.out.println("50원짜리 동전: " + coin50 + "개");
		System.out.println("10원짜리 동전: " + coin10 + "개");
		System.out.println("1원짜리 동전: " + coin1 + "개");
		
		scanner.close();
	}

}
