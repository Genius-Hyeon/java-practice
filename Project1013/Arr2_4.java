package classPM;
//X자 합계
public class Arr2_4 {

	public static void main(String[] args) {
		int arr2[][] = new int[5][5];
		int val = 1;
		int sum = 0;
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

		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				if ((i+j) == 4) {
					sum += arr2[i][j];
				}
				else if (i == j) {
					sum += arr2[i][j];
				}
			}
		}
		System.out.println("\n합계: " + sum);
	}
}