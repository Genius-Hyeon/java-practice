package classPM;
import javax.swing.*;
import java.util.Scanner;

public class MyFrame extends JFrame{
	MyFrame(){ //������
		disp();
	}
	public void disp() { //�޼ҵ�

		setTitle("ù��° ������");
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		int choice;

		Scanner scan = new Scanner(System.in);
		System.out.println("���ڸ� �����ϼ��� (1, 2)");
		choice = scan.nextInt();

		if (choice == 1) {
			new MyFrame(); //������ ª��
		}

		else if(choice == 2) {
			System.out.println("���α׷� ����");
		}
		
		scan.close();

	}

}