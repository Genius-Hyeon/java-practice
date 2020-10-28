package classPM_arr;

public class ArrEx01 {
	public static void main(String[] args) {
		int i, j;
		int val = 1;
		int[][] Arr = new int[5][5];
		//배열에 1부터 25까지 저장
		for(i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				Arr[i][j] = val;
				val++;
			}
		}
		//배열 출력
		for (i=0; i<5; i++) {
			for (j=0; j<5; j++) {
				System.out.print(Arr[i][j] + "\t");
			}
			System.out.println("");
		}
		//음영 쳐져있는 부분 합계 구하기
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
		System.out.println("\n음영이 있는 부분의 합계: " + sum);
	}
}
