package classAM;
import java.util.ArrayList;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		//������ ���� �� ���൵ ��
		Scanner scan = new Scanner(System.in);
		int choice;
		ArrayList<Info> list = new ArrayList<Info>();

		while(true) {
			System.out.println("�޴��� �����ϼ���");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ���α׷� ����");
			choice = scan.nextInt();

			if (choice == 1) {
				Info in = new Info();/**********/
				System.out.println("�л��� �̸��� �Է��ϼ���.");
				in.name = scan.next();
				System.out.println("�л��� �й��� �Է��ϼ���.");
				in.num = scan.nextInt();
				list.add(in); //0�ε����� �߰�

			}

			if (choice == 2) {			
				for (int i=0; i<list.size(); i++) {
					System.out.println((i+1)+"��° �л� ");
					System.out.println("�̸�: " + list.get(i).name);
					System.out.println("�й�: " + list.get(i).num);
				}
				System.out.println("--------------");
			}

			if (choice == 3) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
		scan.close();
	}

}