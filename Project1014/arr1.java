package classPM_arr;
//사각형모양 음영
public class arr1 {

	public static void main(String[] args) {
		int arr[][] = new int[5][5];
		int val = 1;
		//배열에 1부터 25까지 집어넣기
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arr[i][j] = val;
				val++;
			} 
		}
		// 배열 출력
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("");
		}
		int sum = 0;
		//합계 구하여 출력
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i == 0 || i == 4) {
					sum += arr[i][j];
				} else if(j == 4 || j == 0) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println("\n합계: " + sum);
	}

}
