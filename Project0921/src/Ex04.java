import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.print("면적을 입력하세요(단위: 평): ");
		double area1 = scanner.nextInt();
		System.out.print(area1 + "평은 " + (area1*3.305785)+ "제곱미터입니다.");

	}

}
