package classPM;
// 2번째줄, 4번째줄 합계
public class Arr2_2 {
	public static void main(String[] args) {

		int arr2[][] = new int[5][5];
		int val = 1;
		 //배열에 1부터 25까지 집어넣기
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				arr2[i][j] = val;
				val++;
			}
		}
		//배열 출력
		for (int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println("");
		}
		int sum = 0;
		//합계 더하여 출력
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if (i %2 == 1)
					sum += arr2[i][j];
			}
		}
		System.out.println("\n합계: " + sum);
	}

}
