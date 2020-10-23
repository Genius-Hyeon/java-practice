import java.util.Scanner;

public class ScoreEx {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a, b, c, d, e;
					
		System.out.print("a학생 성적을 입력하세요: " );
		a = scan.nextInt();
		System.out.print("b학생 성적을 입력하세요: " );
		b = scan.nextInt();
		System.out.print("c학생 성적을 입력하세요: " );
		c = scan.nextInt();
		System.out.print("d학생 성적을 입력하세요: " );
		d = scan.nextInt();
		System.out.print("e학생 성적을 입력하세요: " );
		e = scan.nextInt();
		
		int sum = a+b+c+d+e;
		double avg = (a+b+c+d+e)/5;
		
		System.out.println("\n1. 성적 목록: " + a + " " + b + " " + c + " " + d + " " + e);
		System.out.println("2. 총 합계: " + sum );
		System.out.println("3. 평균: " + avg);
		
		
		scan.close();
		
		

	}

}
