package stu.exmethod;
import java.util.Scanner;
public class ex12 {

	public static void main(String[] args) {
		Score t = new Score();

		Scanner s = new Scanner(System.in);

		int menu = 0;
		while(true) {
			System.out.println("\n1. 입력, 2. 평균, 3. 종료 ");
			menu = s.nextInt();
			if (menu == 1) t.input();
			if (menu == 2) t.avgPrint();
			if (menu == 3) break;
		}
		s.close();
	}

}