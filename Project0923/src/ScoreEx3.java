import java.util.Scanner;

public class ScoreEx3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a, sum = 0, avg = 0;
						
		for (int i = 0; i < 5; i++) {
			System.out.print( (i+1) + "번째 학생 점수입력: " );
			a = scan.nextInt();
			
			if(a > 101) {
				System.out.println("잘못 입력했다!");
				i--;
				continue;
				
			}
			sum = sum+a;
			avg = sum / 5;
		}
		System.out.println("점수 합계: " + sum);
		System.out.println("점수 평균: " + avg);
		
		scan.close();
	}

}
