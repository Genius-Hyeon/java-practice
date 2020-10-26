// 메뉴 프로그램을 작성한다 
import java.util.Scanner;
public class Subject {
	String[] sj; //과목을 저장할 배열
	int count; //학생 수 저장
	Student[] stud; // 객체 배열

	Scanner scan = new Scanner(System.in);

	public Subject() {
		sj = new String[3];
		count = 0;
		stud = new Student[50];
	}

	void menu() {
		while (true) {

			System.out.println("원하는 메뉴를 선택하세요");
			System.out.println("1. 과목 이름 추가" );
			System.out.println("2. 학생 이름 추가");
			System.out.println("3. 학생 목록 표시");
			System.out.println("4. 프로그램 종료");
			int c = scan.nextInt();

			if (c == 1) {
				for (int i=0; i<sj.length; i++) {
					System.out.print((i+1) + "번째 과목명을 입력하세요: ");
					sj[i] = scan.next();
				}
			}
			if (c == 2) {
				System.out.print("학생을 추가하실 과목명을 입력하세요: ");
				String s = scan.next();

				for (int i=0; i<sj.length; i++) {
					if (s.equals(sj[i])) {
						System.out.print("추가하실 학생의 이름을 입력하세요: ");
						stud[count] = new Student();
						stud[count].name = scan.next();
						stud[count].sb = i;

						count++; //학생이 한 명 추가되었음을 나타냄
					}//if
				}//for
			}

			if (c == 3) {
				System.out.println("-------교과목별 학생 목록-------");
				for (int i=0; i<count; i++) {
					if (stud[i].sb == 0)
						System.out.println(sj[0] + ": " + stud[i].name);
					else if (stud[i].sb == 1)
						System.out.println(sj[1] + ": " + stud[i].name);
					else if (stud[i].sb == 2)
						System.out.println(sj[2] + ": " + stud[i].name);
				}//for
			}

			if (c == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}


