package ex01;
import java.util.Scanner;
//클래스 나누기(main 간단하게)
class Student{
	String[] name = new String[3];
	int[] age = new int[3];
	int[] num = new int[3];

	Scanner in = new Scanner(System.in);

	void input() {
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + "번째 학생의 이름을 입력하세요: ");
			name[i] = in.next();
			System.out.print("나이를 입력하세요: " );
			age[i] = in.nextInt();
			System.out.print("전화번호를 입력하세요: ");
			num[i] = in.nextInt();
		}
	}

	void print() {
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"번째 학생: " + name[i] + ", " + age[i] + ", " + num[i]);
		}
	}

	void search() {
		System.out.print("검색하실 학생의 나이를 입력하세요: ");//1부터 50까지 3의 배수(count++)
		int a = in.nextInt();	
		int count = 0;
	
			for(int i = 0; i<age.length; i++) {
				if (a == age[i]) {
					System.out.println((i+1) + "번째 학생: " + name[i] + ", " + age[i] + ", " + num[i]);
					System.out.println("프로그램을 종료합니다. ");
					count++;
					break;
				}
			}//for

			if (count == 0) {
				System.out.println("검색결과없음");
							
		}
	}
}
public class ex02 {

	public static void main(String[] args) {
		Student std = new Student();

		std.input();
		std.print();
		std.search();
	}

}

