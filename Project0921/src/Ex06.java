import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		double Base, Height, Area; 
				
		System.out.print("�غ��� ���̸� �Է��ϼ���: ");
		Base = scanner.nextDouble();
		System.out.print("������ ���̸� �Է��ϼ���: ");
		Height = scanner.nextDouble();
		
		Area = Base * Height * 0.5;
				
		System.out.print("�����ﰢ���� ������ " + Area  + "�Դϴ�.");
	

	}

}
