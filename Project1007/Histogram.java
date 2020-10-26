package ex1007;
import java.util.Scanner;

public class Histogram {
	static int[] freq;
	static int size;

	static Scanner scan = new Scanner(System.in);

	public Histogram(int size) { //생성자
		Histogram.size = size;
		freq = new int[size];
		run();
	}
	//메소드 간소화
	public static void run() {
		input();
		print();
	}
	//정수를 입력받는다.
	public static void input() {

		for (int i=0; i<size; i++) {
			System.out.print((i+1) + "번째 정수를 입력하세요(1부터 100까지): ");
			int s = scan.nextInt();

			if (s != 0)
				freq[(s-1)/size]++;
			//입력한 수가 0이 아닐 경우, freq[(s-1)/size] 인덱스에 개수 누적
			else
				freq[0]++;
			//입력한 수가 0일 경우, freq[0] 인덱스에 개수 누적
		}

		System.out.println("-----------------");
		scan.close();
	}
	//히스토그램을 출력한다.
	public static void print() {
		for(int i=0; i<size; i++) {
			System.out.print((i*10+1)+"-"+(i+1)*10+": ");
			for (int k=0; k<freq[i]; k++) 
				System.out.print("*");
			System.out.println("");

		}

	}

	public static void main(String[] args) {
		//10개의 정수를 입력받는 히스토그램 객체를 생성한다.
		new Histogram(10);
	}

}