package ex0925;

public class ex03 {

	public static void main(String[] args) {
			int A[] = new int[10];
			int B[] = new int[10];
			
			for (int i = 0; i<A.length; i++)
			{
				A[i] = i + 1;
				System.out.print(A[i] + " ");//�迭 A�� 1���� 10������ �� ����			
			}
			System.out.println("");
			
			for(int i=0; i<A.length; i++)
			{
				B[i] = A[9-i];
			}
				
			for (int i = 9; i>=0; i--) {
				System.out.print(A[i] + " ");
			}	
	}
}
