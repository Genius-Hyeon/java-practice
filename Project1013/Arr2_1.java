package classPM;
//������ �밢�� �հ�
public class Arr2_1 {
	public static void main(String[] args) {

		int arr2[][] = new int[5][5];
		int val = 1;
		//�迭�� 1���� 25���� ����ֱ�
		for (int i=0; i<5; i++) { //�迭 �ʱ�ȭ
			for (int j=0; j<5; j++) {
				arr2[i][j] = val;
				val++;
			}
		}
		
		//�迭 ���
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println("");
		}

		int sum = 0;

		//�հ� ���ؼ� ���
		for (int i=0; i<5; i++) {
			for (int j=4; j>=0; j--) {
				if ((i+j) == 4)
					sum += arr2[i][j];
			}
		}
		System.out.print("\n�հ�: " + sum); 
	}
}
