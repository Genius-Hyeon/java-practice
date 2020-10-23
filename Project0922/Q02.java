import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		int num;
		
		System.out.print("정수를 입력: ");
		num = scanner.nextInt();

		if (num % 2 == 0) {
			System.out.println("입력한 수는 짝수입니다." );

		} else  {
			System.out.println("입력한 수는 홀수입니다." );

			scanner.close();
		}
	}

}
