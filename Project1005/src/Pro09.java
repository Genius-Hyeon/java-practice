import java.util.Scanner;
//성적의 합계가 100점 이상이면 
public class Pro09 {

	public static void main(String[] args) {
		String[] name = new String[3];
		int[] score = new int[3];

		int sum = 0;

		Scanner scan = new Scanner(System.in);
		while (true) {
			for(int i=0; i<name.length; i++) {
				System.out.print((i+1) + "번째 학생의 이름을 입력하세요: ");
				name[i] = scan.next();
				System.out.print("학생의 성적을 입력하세요: ");
				score[i] = scan.nextInt();
				sum += score[i];

				if (sum >= 100)
					break;
			}
			break;
		}
		System.out.println("성적의 합계가 100점 이상(" + sum + "점)입니다. 프로그램을 종료합니다. ");
		
		scan.close();
	}
	
}

