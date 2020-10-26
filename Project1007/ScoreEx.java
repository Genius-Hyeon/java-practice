package ex1007;
import java.util.Scanner;
class ScoreEx_if {
	int score;

	public ScoreEx_if() { //생성자

	}
	//메소드 간소화
	void run() {
		input();
		print();
	}
	//성적을 입력받는 메소드
	void input() {

		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 성적을 입력하세요: " );
		score = scan.nextInt();

		scan.close();
	}
	//성적을 출력하는 메소드
	void print() {
		if (score/10 == 10 || score/10 == 9) 
			System.out.println("학점은 A+입니다.");
		else if (score/10 == 8)
			System.out.println("학점은 B+입니다.");
		else if (score/10 == 7)
			System.out.println("학점은 C+입니다.");
		else
			System.out.println("학점은 F입니다. ");

	}

}
public class ScoreEx {

	public static void main(String[] args) {

		ScoreEx_if s = new ScoreEx_if();
		s.run();
	}

}
