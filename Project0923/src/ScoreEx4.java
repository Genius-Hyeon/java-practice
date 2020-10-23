import java.util.Scanner;
public class ScoreEx4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] name = new String[5]; //name[0], name[1]
		int[] grade = new int[5];

		int sum = 0;
		double avg = 0;

		for (int i = 0; i < 5 ; i++) {
			System.out.print("이름입력: " );
			name[i] = in.next();
			System.out.print("성적입력: " );
			grade[i] = in.nextInt();

			if(grade[i] > 100) {
				System.out.println("잘못 입력했다!");
				i--;
				continue;
			}//이름은 그대로, 성적은 다시 입력: 아이디 비밀번호 틀렸을 때 생각하기
			sum = sum + grade[i];

		}

		avg = sum / 5;

		System.out.print("\n전체 목록: ");

		for (int i = 0; i < 5 ; i++) {
			System.out.print(grade[i] + " ");
		}

		System.out.println("\n점수 합계: " + sum);
		System.out.println("점수 평균: " + avg);
		
		in.close();

	}
}