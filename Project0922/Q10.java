import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int num1, num2, num3;

		System.out.print("정수 값을 입력하시오(1회) : ");
		num1 = scanner.nextInt();
		System.out.print("정수 값을 입력하시오(2회) : ");
		num2 = scanner.nextInt();
		System.out.print("정수 값을 입력하시오(3회) : ");
		num3 = scanner.nextInt();

		if (num1 > num2 && num1 > num3) {
			System.out.println("\n최대값은 "+ num1 + "입니다.");

		}else if (num2 > num1 && num2 > num3) {
			System.out.println("최대값은 "+ num2 + "입니다.");

		}else
			System.out.println("최대값은 "+ num3 + "입니다.");

		scanner.close();
	}

}
