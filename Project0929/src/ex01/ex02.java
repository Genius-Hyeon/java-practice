package ex01;
import java.util.Scanner;
//Ŭ���� ������(main �����ϰ�)
class Student{
	String[] name = new String[3];
	int[] age = new int[3];
	int[] num = new int[3];

	Scanner in = new Scanner(System.in);

	void input() {
		for (int i = 0; i < 3; i++) {
			System.out.print((i+1) + "��° �л��� �̸��� �Է��ϼ���: ");
			name[i] = in.next();
			System.out.print("���̸� �Է��ϼ���: " );
			age[i] = in.nextInt();
			System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
			num[i] = in.nextInt();
		}
	}

	void print() {
		for (int i = 0; i < 3; i++) {
			System.out.println((i+1)+"��° �л�: " + name[i] + ", " + age[i] + ", " + num[i]);
		}
	}

	void search() {
		System.out.print("�˻��Ͻ� �л��� ���̸� �Է��ϼ���: ");//1���� 50���� 3�� ���(count++)
		int a = in.nextInt();	
		int count = 0;
	
			for(int i = 0; i<age.length; i++) {
				if (a == age[i]) {
					System.out.println((i+1) + "��° �л�: " + name[i] + ", " + age[i] + ", " + num[i]);
					System.out.println("���α׷��� �����մϴ�. ");
					count++;
					break;
				}
			}//for

			if (count == 0) {
				System.out.println("�˻��������");
							
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

