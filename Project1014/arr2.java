package classPM_arr;

public class arr2 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int val = 1;
		//�迭�� 1���� 25���� ����ֱ�
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arr[i][j] = val;
				val++;
			} 
		}
		// �迭 ���
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
		int sum = 0;
		//�հ� ���Ͽ� ���
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (arr[i][j] %2 == 0)
					sum += arr[i][j];
			}
		}
		System.out.println("\n�հ�: " + sum);

	}
}