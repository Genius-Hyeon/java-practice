package exarr;
import java.util.Scanner;
public class Sample4 {

	public static void main(String[] args) {
		String name;
		int age;
		String number;

		Scanner in = new Scanner(System.in);

		System.out.println("1�� �л��� �̸�, ����, �ڵ��� ��ȣ�� ��ĭ���� �и��Ͽ� �Է��ϼ���");

		name = in.next();
		age = in.nextInt();
		number = in.next();

		System.out.println("1�� �л��� �̸��� " + name +", " + "���̴� " + age + ", " + "�ڵ��� ��ȣ�� " + number + "�Դϴ�.");

		in.close();
	}

}
