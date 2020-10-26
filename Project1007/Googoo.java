package ex1007;
import java.util.Scanner;
class Goog{

	int i;

	public Goog() {//생성자

	}
	//main메소드 간소화
	public void run() {
		input();
		print();
	}

	public void input() {
		//구구단을 출력할 수를 입력받는다.
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하세요(2부터 9까지 중 하나): ");
		i = scan.nextInt();

		scan.close();
	}
	//결과를 출력한다.
	public void print() {
		for(int j=1; j<10; j++) {
			System.out.print(i +"*" + j + "=" + (i*j) + "\t");
		}
	}
}

public class Googoo {

	public static void main(String[] args) {
		Goog g = new Goog();
		g.run();
	}

}
