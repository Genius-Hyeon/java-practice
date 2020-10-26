package stu.exmethod;
import java.util.Scanner;

public class Score {
	int[] num = new int[5];
	int sum = 0;
	double avg;

	void input() {

		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.print("성적을 입력하세요: ");
			num[i] = s.nextInt();
		}
		s.close();

	}
	void sumCalc() {
		for (int i = 0; i<5; i++) {
			sum += num[i];
		}
	}
	void sumPrint() {
		System.out.println("합계: " + sum);
	}

	void avgPrint() {
		sumCalc();
		avg = sum/5;
		System.out.println("평균: " + avg);
	}
}
