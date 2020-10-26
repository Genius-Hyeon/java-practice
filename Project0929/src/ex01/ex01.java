package ex01;
import java.util.Scanner;
//변수만 활용하여 학생 3명의 이름, 나이, 전화번호 입력받고, 나이로 검색하여 입력받은 결과 출력하기 
//(검색결과가 없을 경우, 검색결과가 없다는 메시지 출력)
public class ex01 {

	public static void main(String[] args) {

		String name1, name2, name3;
		int age1, age2, age3;
		int num1, num2, num3;

		Scanner in = new Scanner(System.in);

		System.out.print("첫번째 학생의 이름을 입력하세요: ");
		name1 = in.next();
		System.out.print("나이를 입력하세요: " );
		age1 = in.nextInt();
		System.out.print("전화번호를 입력하세요: ");
		num1 = in.nextInt();

		System.out.print("두번째 학생의 이름을 입력하세요: ");
		name2 = in.next();
		System.out.print("나이를 입력하세요: " );
		age2 = in.nextInt();
		System.out.print("전화번호를 입력하세요: ");
		num2 = in.nextInt();

		System.out.print("세번째 학생의 이름을 입력하세요: ");
		name3 = in.next();
		System.out.print("나이를 입력하세요: " );
		age3 = in.nextInt();
		System.out.print("전화번호를 입력하세요: ");
		num3 = in.nextInt();

		System.out.println("첫번째 학생: " + name1 + ", " + age1 + ", " + num1);
		System.out.println("두번째 학생: " + name2 + ", " + age2 + ", " + num2);
		System.out.println("세번째 학생: " + name3 + ", " + age3 + ", " + num3);

		System.out.print("검색하실 학생의 나이를 입력하세요: ");
		int a = in.nextInt();


		if (a == age1) {
			System.out.println("첫번째 학생: " + name1 + ", " + age1 + ", " + num1);
			System.out.println("프로그램을 종료합니다. ");
		}
		if (a == age2) {
			System.out.println("두번째 학생: " + name2 + ", " + age2 + ", " + num2);
			System.out.println("프로그램을 종료합니다. ");
		}
		if (a == age3) {
			System.out.println("세번째 학생: " + name3 + ", " + age3 + ", " + num3);
			System.out.println("프로그램을 종료합니다. ");
		}
		else {
			System.out.println("검색결과없음");//처음으로 돌아가게 다시 짜보기

			in.close();
		}

	}
}

