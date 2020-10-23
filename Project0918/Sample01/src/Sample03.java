import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, kor1, kor2;
		int eng1, eng2, math1, math2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학생번호 입력 >> ");
		num1 = scan.nextInt();
		System.out.print("1. 국어 점수 입력 >> ");
		kor1 = scan.nextInt();
		System.out.print("1. 수학 점수 입력 >> ");
		math1 = scan.nextInt();
		System.out.print("1. 영어 점수 입력 >> ");
		eng1 = scan.nextInt();
		
		System.out.println("첫번째 학생의 점수 합계 " + (kor1+math1+eng1));
		
		System.out.print("학생번호 입력 >> ");
		num2 = scan.nextInt();
		System.out.print("2. 국어 점수 입력 >> ");
		kor2 = scan.nextInt();
		System.out.print("2. 수학 점수 입력 >> ");
		math2 = scan.nextInt();
		System.out.print("2. 영어 점수 입력 >> ");
		eng2 = scan.nextInt();
		
		System.out.println("두번째 학생의 점수 합계 " + (kor2+math2+eng2));
		System.out.println("두 학생의 평균 : " + (kor1+math1+eng1+kor2+math2+eng2)/6);

	}

}
