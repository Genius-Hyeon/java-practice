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
		System.out.print("�Ǹſ��� ���� �Է��ϼ���: ");
		int c = scan.nextInt();
		sales = new Salesman[c];

		for (int i=0; i<sales.length; i++) {
			System.out.println("�Ǹſ� " + (i+1) +"�� �������Դϴ�.");
			System.out.print("�Ǹſ� " + (i+1) +"�� �̸�: ");
			sales[i] = new Salesman();
			sales[i].name = scan.next();
			System.out.print("�Ǹſ� " + (i+1) + "�� �Ǹž�: ");
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
		System.out.println("�Ǹſ����� ��� �Ǹž�: " + avg);
		System.out.println("�Ǹſ����� �ִ� �Ǹž�: " + max);
		System.out.println("-----------------------");
		System.out.println("�ִ� �Ǹž��� �޼��� �Ǹſ��Դϴ�.");
		for (int i=0; i<sales.length; i++) {
			if (max == sales[i].sales) {
				System.out.println("�̸�: " + sales[i].name);
				System.out.println("�Ǹž�: " + sales[i].sales);
			}			
		}

	}
	
}

