package exarr;
import java.util.Scanner;
public class Sample4 {

	public static void main(String[] args) {
		String name;
		int age;
		String number;

		Scanner in = new Scanner(System.in);

		System.out.println("1번 학생의 이름, 나이, 핸드폰 번호를 빈칸으로 분리하여 입력하세요");

		name = in.next();
		age = in.nextInt();
		number = in.next();

		System.out.println("1번 학생의 이름은 " + name +", " + "나이는 " + age + ", " + "핸드폰 번호는 " + number + "입니다.");

		in.close();
	}

}
