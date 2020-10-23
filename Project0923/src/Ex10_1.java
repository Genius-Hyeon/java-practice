import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int a, b, c;
		int max = 0;

		System.out.print("정수 값을 입력하시오(1회): ");
		a = scanner.nextInt();
		System.out.print("정수 값을 입력하시오(2회): ");
		b = scanner.nextInt();
		System.out.print("정수 값을 입력하시오(3회): ");
		c = scanner.nextInt();

		if (a > b && a > c ) {
			max = a;
		}
		if (b > a && b > c) max = b;
		if (c > a && c > b) max = c;

	    System.out.println("최대값은 " + max + "입니다.");//출력은 될 수 있도록 적게!

	    scanner.close();
	}
}
