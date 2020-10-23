import java.util.Scanner;

public class LJH7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫 번째 정수를 입력하세요: ");
		int num1 = scanner.nextInt();
		System.out.print("두 번째 정수를 입력하세요: ");
		int num2 = scanner.nextInt();
		
		System.out.println("합 = " + (num1+num2));
		System.out.println("차 = " + (num1-num2));
		System.out.println("곱 = " + (num1*num2));
				
	}

}
