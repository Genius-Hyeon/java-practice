package ex01;
import java.util.Scanner;
//������ Ȱ���Ͽ� �л� 3���� �̸�, ����, ��ȭ��ȣ �Է¹ް�, ���̷� �˻��Ͽ� �Է¹��� ��� ����ϱ� 
//(�˻������ ���� ���, �˻������ ���ٴ� �޽��� ���)
public class ex01 {

	public static void main(String[] args) {

		String name1, name2, name3;
		int age1, age2, age3;
		int num1, num2, num3;

		Scanner in = new Scanner(System.in);

		System.out.print("ù��° �л��� �̸��� �Է��ϼ���: ");
		name1 = in.next();
		System.out.print("���̸� �Է��ϼ���: " );
		age1 = in.nextInt();
		System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
		num1 = in.nextInt();

		System.out.print("�ι�° �л��� �̸��� �Է��ϼ���: ");
		name2 = in.next();
		System.out.print("���̸� �Է��ϼ���: " );
		age2 = in.nextInt();
		System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
		num2 = in.nextInt();

		System.out.print("����° �л��� �̸��� �Է��ϼ���: ");
		name3 = in.next();
		System.out.print("���̸� �Է��ϼ���: " );
		age3 = in.nextInt();
		System.out.print("��ȭ��ȣ�� �Է��ϼ���: ");
		num3 = in.nextInt();

		System.out.println("ù��° �л�: " + name1 + ", " + age1 + ", " + num1);
		System.out.println("�ι�° �л�: " + name2 + ", " + age2 + ", " + num2);
		System.out.println("����° �л�: " + name3 + ", " + age3 + ", " + num3);

		System.out.print("�˻��Ͻ� �л��� ���̸� �Է��ϼ���: ");
		int a = in.nextInt();


		if (a == age1) {
			System.out.println("ù��° �л�: " + name1 + ", " + age1 + ", " + num1);
			System.out.println("���α׷��� �����մϴ�. ");
		}
		if (a == age2) {
			System.out.println("�ι�° �л�: " + name2 + ", " + age2 + ", " + num2);
			System.out.println("���α׷��� �����մϴ�. ");
		}
		if (a == age3) {
			System.out.println("����° �л�: " + name3 + ", " + age3 + ", " + num3);
			System.out.println("���α׷��� �����մϴ�. ");
		}
		else {
			System.out.println("�˻��������");//ó������ ���ư��� �ٽ� ¥����

			in.close();
		}

	}
}

