package classAM;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		//사이즈 지정 안 해줘도 됨
		Scanner scan = new Scanner(System.in);
		int choice;
		ArrayList<Info> list = new ArrayList<Info>();

		while(true) {
			System.out.println("메뉴를 선택하세요");
			System.out.println("1. 정보 입력");
			System.out.println("2. 정보 출력");
			System.out.println("3. 프로그램 종료");
			choice = scan.nextInt();

			if (choice == 1) {
				Info in = new Info();/**********/
				System.out.println("학생의 이름을 입력하세요.");
				in.name = scan.next();
				System.out.println("학생의 학번을 입력하세요.");
				in.num = scan.nextInt();
				list.add(in); //0인덱스에 추가

			}

			if (choice == 2) {			
				for (int i=0; i<list.size(); i++) {
					System.out.println((i+1)+"번째 학생 ");
					System.out.println("이름: " + list.get(i).name);
					System.out.println("학번: " + list.get(i).num);
				}
				System.out.println("--------------");
			}

			if (choice == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
		scan.close();
	}

}