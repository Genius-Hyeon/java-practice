package classPM_Salesman;
import java.util.Scanner;

public class SalesReport {
	double max;
	double avg = 0;
	Salesman[] sales;
	
	public void run() {
		input();
		calc();
		print();
	}

	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("판매원의 수를 입력하세요: ");
		int c = scan.nextInt();
		sales = new Salesman[c];

		for (int i=0; i<sales.length; i++) {
			System.out.println("판매원 " + (i+1) +"의 데이터입니다.");
			System.out.print("판매원 " + (i+1) +"의 이름: ");
			sales[i] = new Salesman();
			sales[i].name = scan.next();
			System.out.print("판매원 " + (i+1) + "의 판매액: ");
			sales[i].sales = scan.nextInt();
			avg += sales[i].sales;
			
		}
		
		scan.close();
	}
	public void calc() {
		max = sales[0].sales;

		avg = avg / sales.length;

		for (int i=0; i<sales.length; i++) {
			if (sales[i].sales > max)
				max = sales[i].sales;

			else max = sales[0].sales;
		}
	}
	
	public void print() {
		System.out.println("판매원들의 평균 판매액: " + avg);
		System.out.println("판매원들의 최대 판매액: " + max);
		System.out.println("-----------------------");
		System.out.println("최대 판매액을 달성한 판매원입니다.");
		for (int i=0; i<sales.length; i++) {
			if (max == sales[i].sales) {
				System.out.println("이름: " + sales[i].name);
				System.out.println("판매액: " + sales[i].sales);
			}			
		}

	}
	
}

