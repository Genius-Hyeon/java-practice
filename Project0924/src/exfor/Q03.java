package exfor;
import java.util.Scanner;
public class Q03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("���ڸ� �Է�: ");
			
		int a = scan.nextInt();
		
		int max = 0;
		for(int i = 0; i < a+1; i+=7) {
			max = i; 
		}
		System.out.println("���� ��� >> " + max);
		scan.close();
	}
}
