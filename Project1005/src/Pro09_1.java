import java.util.Scanner;
/*Pro09 코드는 학생 수와 입력 점수에 제한이 있으므로, 
 * 학생 수와 합계의 제한 없이 성적의 합계가 100점이 넘을 때까지 무한 반복
 */
public class Pro09_1 {

	public static void main(String[] args) {
		String name;
		int score = 0, i = 0, sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		while (sum <= 100) {
			System.out.print((i+1) + "번째 학생의 이름 입력: ");
			name = scan.next();
			System.out.print((i+1) + "번째 학생의 점수 입력: ");
			score = scan.nextInt();
			i++;
			sum += score;
		}//성적의 합계가 100점 이상이면 반복 종료
		System.out.println("성적의 합계가 100점 이상(" + sum + "점)입니다. 프로그램을 종료합니다.");
		
		scan.close();
	}

	
}
