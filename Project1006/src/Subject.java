// �޴� ���α׷��� �ۼ��Ѵ� 
import java.util.Scanner;
public class Subject {
	String[] sj; //������ ������ �迭
	int count; //�л� �� ����
	Student[] stud; // ��ü �迭

	Scanner scan = new Scanner(System.in);

	public Subject() {
		sj = new String[3];
		count = 0;
		stud = new Student[50];
	}

	void menu() {
		while (true) {

			System.out.println("���ϴ� �޴��� �����ϼ���");
			System.out.println("1. ���� �̸� �߰�" );
			System.out.println("2. �л� �̸� �߰�");
			System.out.println("3. �л� ��� ǥ��");
			System.out.println("4. ���α׷� ����");
			int c = scan.nextInt();

			if (c == 1) {
				for (int i=0; i<sj.length; i++) {
					System.out.print((i+1) + "��° ������� �Է��ϼ���: ");
					sj[i] = scan.next();
				}
			}
			if (c == 2) {
				System.out.print("�л��� �߰��Ͻ� ������� �Է��ϼ���: ");
				String s = scan.next();

				for (int i=0; i<sj.length; i++) {
					if (s.equals(sj[i])) {
						System.out.print("�߰��Ͻ� �л��� �̸��� �Է��ϼ���: ");
						stud[count] = new Student();
						stud[count].name = scan.next();
						stud[count].sb = i;

						count++; //�л��� �� �� �߰��Ǿ����� ��Ÿ��
					}//if
				}//for
			}

			if (c == 3) {
				System.out.println("-------������ �л� ���-------");
				for (int i=0; i<count; i++) {
					if (stud[i].sb == 0)
						System.out.println(sj[0] + ": " + stud[i].name);
					else if (stud[i].sb == 1)
						System.out.println(sj[1] + ": " + stud[i].name);
					else if (stud[i].sb == 2)
						System.out.println(sj[2] + ": " + stud[i].name);
				}//for
			}

			if (c == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}
}


