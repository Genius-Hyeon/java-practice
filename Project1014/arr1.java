package classPM_arr;
//�簢����� ����
public class arr1 {

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
				if (i == 0 || i == 4) {
					sum += arr[i][j];
				} else if(j == 4 || j == 0) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("\n�հ�: " + sum);
	}

}
