package ex0925;
import java.util.Scanner;
public class ex06 {

	public static void main(String[] args) {
		//int[] arr = new int[10];
		int max = 0;
		int min = 101;
		//int min = arr[0];
		
		Scanner scan = new Scanner(System.in);

		int[] arr = new int[10];
		System.out.println(arr.length + "���� ��� �Է�(100 ����) >> ");

		for(int i = 0; i < arr.length; i++)
		{
			System.out.print((i+1) + "��° ����� �Է��ϼ���. ");//�ȳ� ����
			arr[i] = scan.nextInt();//��� �Է¹ޱ�
			if(arr[i] > max)
			{
				max = arr[i];//�ִ밪 ���ϱ�
			}
			
			if(arr[i] < min)
			{
				min = arr[i];
			}

		}
		System.out.println("�ִ밪�� " + max + "�Դϴ�.");
		System.out.println("�ּҰ��� " + min + "�Դϴ�.");
		
		scan.close();
	}


}
