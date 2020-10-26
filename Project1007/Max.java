package ex1007;
import java.util.Scanner;
public class Max {
	int a, b; //입력받을 두 정수
	int max; //최대값

	public Max() {//생성자

	}
	//메소드 간소화
	public void run() {
		input();
		max();
		print();
	}
	//정수를 입력받는다.
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하세요: ");
		a = scan.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		b = scan.nextInt();

		scan.close();

		max = a;
		//첫번째 정수를 최대값에 저장한다.
	}
	//두 번째 정수가 최대값(a)보다 클 경우 b를 최대값에 저장한다.
	public void max() {
		if (b > max) max = b;
	}
	//최대값을 출력한다.
	public void print() {
		System.out.println("최대값은 " + max + "입니다. ");
	}

	public static void main(String[] args) {
		Max m = new Max();
		m.run();

	}

}
