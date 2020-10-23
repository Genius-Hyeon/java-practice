package exarr;
import java.util.Scanner;
class Sample3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		final int SIZE = 10;
		int[] seats = new int[SIZE];

		while (true) { //true = 무한루프
			System.out.println("---------------------");
			for (int i = 0; i < SIZE; i++)
				System.out.print(i+1 + " "); //1부터 10까지 좌석 출력
			System.out.println("\n---------------------");
			for (int i = 0; i < SIZE; i++)//좌석 예약 여부 0과 1로 출력
				System.out.print(seats[i] + " ");
			System.out.println("\n---------------------");
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): " );//좌석번호 입력
			int s = scan.nextInt();
			if (s == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;//-1 입력 시 프로그램 종료
			}
			if (seats[s-1] == 0) {
				seats[s-1] = 1;
				System.out.println("예약되었습니다."); //좌석 선택 시 0을 1로 변경
			}
			else {
				System.out.println("이미 예약된 좌석입니다.");//예약된 좌석 선택 시 메시지 출력
			}
			
			scan.close();
		}//while
	}
}
