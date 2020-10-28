package classPM_arr;

public class ArrEx02 {
	public static void main(String[] args) {
		int i, j;
		int[][] Arr = new int[5][5];

		//배열 생성
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				if ((i+j) < 5)
					Arr[i][j] = (i+j)+1;
				else
					Arr[i][j] = 0;
			}
		}
		
		//배열 출력
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.print(Arr[i][j] + "\t");
			}
			System.out.println("");
		}

	}

}
