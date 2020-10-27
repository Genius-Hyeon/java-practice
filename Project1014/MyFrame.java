package classPM;
import javax.swing.*;
import java.util.Scanner;

public class MyFrame extends JFrame{
	MyFrame(){ //생성자
		disp();
	}
	public void disp() { //메소드

		setTitle("첫번째 프레임");
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		int choice;

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 선택하세요 (1, 2)");
		choice = scan.nextInt();

		if (choice == 1) {
			new MyFrame(); //메인을 짧게
		}

		else if(choice == 2) {
			System.out.println("프로그램 종료");
		}
		
		scan.close();

	}

}