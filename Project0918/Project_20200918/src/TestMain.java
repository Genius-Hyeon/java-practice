import java.util.Scanner;  // �߰� 

public class TestMain {
		
	public static void main(String[] args) {

		int num1, kor1, sum1=0, sum2=0; 
		
		Scanner scan = new Scanner(System.in); 
		System.out.print("�л���ȣ �Է� >> ");  
		num1 = scan.nextInt(); 	
		
		System.out.print("1.���� ���� �Է� >> ");  
		sum1 = sum1 + scan.nextInt();
		
		System.out.print("1.���� ���� �Է� >> "); 
		sum1 = sum1 + scan.nextInt();
			
		System.out.print("1.���� ���� �Է� >> "); 
		sum1 = sum1 + scan.nextInt();
					
		System.out.println(num1 +"��ȣ �л��� ���� �հ� "+ sum1);
		
		System.out.print("�л���ȣ �Է� >> ");  
		num1 = scan.nextInt(); 	
		
		System.out.print("2.���� ���� �Է� >> ");  
		sum2 = sum2 + scan.nextInt();
		
		System.out.print("2.���� ���� �Է� >> "); 
		sum2 = sum2 + scan.nextInt();
		
		System.out.print("2.���� ���� �Է� >> "); 
		sum2 = sum2 + scan.nextInt();
		
		System.out.println(num1 + "��ȣ �л��� ���� �հ� "+ (sum2));	
		System.out.println("�� �л��� ��� : " + (sum1+sum2)/6);
	}
}
