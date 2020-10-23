import java.util.Scanner;

public class LJH8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sum1 = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.print("영작문 과목의 점수: ");
		sum1 = sum1 + scanner.nextInt();
		System.out.print("프로그래밍 과목의 점수: ");
		sum1 = sum1 + scanner.nextInt();
		System.out.print("이산수학 과목의 점수: ");
		sum1 = sum1 + scanner.nextInt();
		System.out.print("컴퓨터구조 과목의 점수: ");
		sum1 = sum1 + scanner.nextInt();
		System.out.print("평균 점수: " + sum1/4);
		
	}

}
