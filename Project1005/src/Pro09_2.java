import java.util.Scanner;
/*
 * �� ���� �л��� �̸��� ������ �Է¹��� �� "���α׷��� ����Ǿ����ϴ�. " 
 * ��� �޽����� ����ϴ� ���α׷��� Ŭ������ Ȱ���Ͽ� �ۼ��Ͻÿ�.
 */
class Student {

		String[] name = new String[3];
		int[] score = new int[3];
		int i = 0;

		Scanner scan = new Scanner(System.in);  

		void run() { //�Է�, ��� ���� �޼ҵ�
			input();
			output();
		}

		void input() { //�л� �̸�, ���� �Է¹޴� Ŭ���� 

			for(int i=0; i<name.length; i++) {
				System.out.println((i+1) + "��° �л��� �̸��� �Է��ϼ���: ");
				name[i] = scan.next();
				System.out.println("�л��� ������ �Է��ϼ���: ");
				score[i] = scan.nextInt();
			}
		}
		void print() { // �л� �̸�, ���� ����ϴ� Ŭ����
				System.out.println((i+1)+"��° �л� �̸�: " + name[i]);
				System.out.println((i+1)+"��° �л� ����: " + score[i] +"��");
				System.out.println("--------------------"); 
				i++;
			}
		void output() { // ���α׷� ���� �޽��� ���
			System.out.println("���α׷��� ����Ǿ����ϴ�. ");
		}
	}
	public class Pro09_2 {
		public static void main(String[] args) {

			Student std = new Student();
			std.run(); //main �޼ҵ� ����ȭ

		}
	}
