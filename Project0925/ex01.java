package ex0925;
import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int intArray[] = new int[5]; //�迭 ����

		int max = 0; //���� ���� ū ��
		System.out.println("��� 5���� �Է��ϼ���.");
		for (int i = 0; i < intArray.length; i++) 
		{
			System.out.println((i+1) + "��° ����� �Է��ϼ���.");//�ȳ� ����
			intArray[i] = scan.nextInt();//�Է¹��� ������ �迭�� ����
			if(intArray[i]>max) 
			{
				max = intArray[i]; //intArray[i]�� ���� ���� ū �� 
			}
		}
		
		System.out.println("���� ū ���� " + max + "�Դϴ�.");
		
		scan.close();
	}
}