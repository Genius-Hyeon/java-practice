package ex0925;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		int intArray[] = new int[5];
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.print(intArray.length + "���� ������ �Է��ϼ��� >> " );

		for (int i=0; i<intArray.length; i++)
		{
			intArray[i] = scan.nextInt();// Ű���忡�� �Է¹��� ���� ����
			sum += intArray[i]; // �迭�� ����� ���� ���� sum�� ���ϱ�
		}
		
		double avg = sum / intArray.length; //��� ���ϱ�
		
		System.out.println("����� " + avg);
		
		scan.close();
	}
}
