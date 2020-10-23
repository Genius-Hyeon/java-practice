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

		System.out.print("500원짜리 동전의 갯수: ");
		fiveHundred = scanner.nextInt();
		System.out.print("100원짜리 동전의 갯수: ");
		oneHundred = scanner.nextInt();
		System.out.print("50원짜리 동전의 갯수: ");
		fifty = scanner.nextInt();
		System.out.print("10원짜리 동전의 갯수: ");
		ten = scanner.nextInt();
		
		total = fiveHundred*500 + oneHundred*100 + fifty*50 + ten*10;
		
		System.out.print("총액: " + total + "원");
	}

}
