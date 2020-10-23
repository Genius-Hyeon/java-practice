import java.util.Scanner;

public class Sample04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor1;
		int sum1 = 0;
		int sum2 = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생번호 입력 >> ");
		kor1 = scan.nextInt();
		
		System.out.print("1. 국어 점수 입력 >> ");
		kor1 = scan.nextInt();
		sum1 = sum1 + kor1;
				
		System.out.print("1. 수학 점수 입력 >> ");
		kor1 = scan.nextInt();
		sum1 = sum1 + kor1;
		
		System.out.print("1. 영어 점수 입력 >> ");
		kor1 = scan.nextInt();
		sum1 = sum1 + kor1;
		
		System.out.println(kor1 + " 학생의 점수 합계 " + (sum1));
		
		System.out.print("학생번호 입력 >> ");
		kor1 = scan.nextInt();
		
		System.out.print("2. 국어 점수 입력 >> ");
		kor1 = scan.nextInt();
		sum2 = sum2 + kor1;
		
		System.out.print("2. 수학 점수 입력 >> ");
		kor1 = scan.nextInt();
		sum2 = sum2 + kor1;
		
		System.out.print("2. 영어 점수 입력 >> ");
		kor1 = scan.nextInt();
		sum2 = sum2 + kor1;
		
		System.out.println(kor1 + " 학생의 점수 합계 " + (sum2));
		System.out.println("두 학생의 평균 : "+(sum1+sum2)/6);
		
	}	
}
