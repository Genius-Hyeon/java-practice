package ex1007;
import java.util.Scanner;
class ScoreEx_switch {
	int score;

	public ScoreEx_switch() { //생성자

	}
	//메소드 간소화
	void run() {
		input();
		print();
	}
	//성적 입력받는 메소드
	void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 성적을 입력하세요: ");
		score = scan.nextInt();

		scan.close();
	}
	//성적 출력하는 메소드
	void print() {
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("학점은 A+입니다.");
			break;
		case 8:
			System.out.println("학점은 B+입니다.");
			break;
		case 7:
			System.out.println("학점은 C+입니다.");
			break;
		default:
			System.out.println("학점은 F입니다.");
		}

	}
}

public class ScoreEx_1 {

	public static void main(String[] args) {
		
		ScoreEx_switch s = new ScoreEx_switch();
		s.run();
	}

}
