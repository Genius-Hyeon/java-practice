package classPM_arr;

public class ArrEx01 {
	public static void main(String[] args) {
		int i, j;
		int val = 1;
		int[][] Arr = new int[5][5];
		//�迭�� 1���� 25���� ����
		for(i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				Arr[i][j] = val;
				val++;
			}
		}
		//�迭 ���
		for (i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				System.out.print(Arr[i][j] + "\t");
			}
			System.out.println("");
		}
		//���� �����ִ� �κ� �հ� ���ϱ�
		int sum = 0;
		for (i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				if (i!=0 && j==0)
					sum += Arr[i][j];
				else if (i==4 && j!=4)
					sum += Arr[i][j];
				else if (i==2 && (i+j)<4)
					sum += Arr[i][j];
				else if (i==3 && (i+j)<6)
					sum += Arr[i][j];

			}

		}
		System.out.println("\n������ �ִ� �κ��� �հ�: " + sum);
	}
}
